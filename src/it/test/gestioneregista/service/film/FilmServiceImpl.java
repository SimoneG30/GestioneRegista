package it.test.gestioneregista.service.film;

import java.util.List;

import javax.persistence.EntityManager;

import it.test.gestioneregista.dao.EntityManagerUtil;
import it.test.gestioneregista.dao.film.FilmDAO;
import it.test.gestioneregista.model.Film;

public class FilmServiceImpl implements FilmService{

	private FilmDAO filmDAO;

	public void setFilmDAO(FilmDAO filmDAO) {
		this.filmDAO = filmDAO;
	}
	
	@Override
	public List<Film> listAllFilms() throws Exception {
				EntityManager entityManager = EntityManagerUtil.getEntityManager();
				try {
					filmDAO.setEntityManager(entityManager);
					return filmDAO.list();
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				} finally {
					entityManager.close();
				}
	}

	@Override
	public Film caricaSingoloFilm(Long id) throws Exception {
		
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			filmDAO.setEntityManager(entityManager);

			return filmDAO.get(id);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void aggiorna(Film filmInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();

			filmDAO.setEntityManager(entityManager);

			filmDAO.update(filmInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void inserisciNuovo(Film filmInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();

			filmDAO.setEntityManager(entityManager);

			filmDAO.insert(filmInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void rimuovi(Film filmInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();

			filmDAO.setEntityManager(entityManager);

			filmDAO.delete(filmInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<Film> cercaTuttiIFilmConTitolo(String titolo) throws Exception {
				EntityManager entityManager = EntityManagerUtil.getEntityManager();

				try {
					filmDAO.setEntityManager(entityManager);

					return filmDAO.findAllByTitolo(titolo);
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				} finally {
					entityManager.close();
				}
	}

	@Override
	public List<Film> cercaTuttiIFilmConGenere(String genereInput) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			filmDAO.setEntityManager(entityManager);

			return filmDAO.findAllByGenere(genereInput);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<Film> cercaTuttiIFilmConCognomeRegista(String cognomeRegistaInput) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			filmDAO.setEntityManager(entityManager);

			return filmDAO.findAllByCognomeRegista(cognomeRegistaInput);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

}
