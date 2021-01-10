package it.test.gestioneregista.dao.regista;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.test.gestioneregista.model.Regista;

public class RegistaDAOImpl implements RegistaDAO {

	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Regista> list() throws Exception {
		return entityManager.createQuery("from Regista", Regista.class).getResultList();
	}

	@Override
	public Regista get(Long id) throws Exception {
		return entityManager.find(Regista.class, id);
	}

	@Override
	public void update(Regista registaInstance) throws Exception {
		if (registaInstance == null) {
			throw new Exception("Problema valore in input");
		}

		registaInstance = entityManager.merge(registaInstance);
	}

	@Override
	public void insert(Regista registaInstance) throws Exception {
		if (registaInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.persist(registaInstance);
	}

	@Override
	public void delete(Regista registaInstance) throws Exception {
		if (registaInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.remove(entityManager.merge(registaInstance));
	}

	@Override
	public Regista getEagerFilms(Long id) throws Exception {
		TypedQuery<Regista> query = entityManager.createQuery("from Regista r left join fetch r.films where r.id = ?1", Regista.class);
		query.setParameter(1, id);
		
		return query.getResultStream().findFirst().orElse(null);
	}
	
	@Override
	public List<Regista> findAllByIniziali(String inizialeInput) throws Exception {
		TypedQuery<Regista> query = entityManager.createQuery("from Regista r where r.nome like ?1", Regista.class);
		return query.setParameter(1, inizialeInput + '%').getResultList();
	}

	@Override
	public Regista findByOscarVinti() throws Exception {
		TypedQuery<Regista> query = entityManager.createQuery("from Regista m left join fetch r. where oscarvinti = (SELECT MAX(oscarvinti) FROM regista)", Regista.class);
		return query.getResultStream().findFirst().orElse(null);
	}

}
