package it.test.gestioneregista.service.regista;

import java.util.List;

import javax.persistence.EntityManager;

import it.test.gestioneregista.dao.EntityManagerUtil;
import it.test.gestioneregista.dao.regista.RegistaDAO;
import it.test.gestioneregista.model.Regista;

public class RegistaServiceImpl implements RegistaService {

	private RegistaDAO registaDAO;

	public void setRegistaDAO(RegistaDAO registaDAO) {
		this.registaDAO = registaDAO;
	}
	
	@Override
	public List<Regista> listAllRegisti() throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Regista caricaSingoloRegista(Long id) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.get(id);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void aggiorna(Regista registaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			registaDAO.setEntityManager(entityManager);
			registaDAO.update(registaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void inserisciNuovo(Regista registaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			registaDAO.setEntityManager(entityManager);
			registaDAO.insert(registaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void rimuovi(Regista registaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			registaDAO.setEntityManager(entityManager);
			registaDAO.delete(registaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public Regista caricaSingoloRegistaConFilms(Long id) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			registaDAO.setEntityManager(entityManager);

			return registaDAO.getEagerFilms(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<Regista> cercaRegistaConInizialeNome(String inizialeInput) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.findAllByIniziali(inizialeInput);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Regista registaConPiuOscarVinti() throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);

			return registaDAO.findByOscarVinti();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

}
