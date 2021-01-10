package it.test.gestioneregista.dao.film;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.test.gestioneregista.model.Film;

public class FilmDAOImpl implements FilmDAO {

	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Film> list() throws Exception {
		return entityManager.createQuery("from film", Film.class).getResultList();
	}

	@Override
	public Film get(Long id) throws Exception {
			return entityManager.find(Film.class, id);
		}

	@Override
	public void update(Film filmInstance) throws Exception {
		if (filmInstance == null) {
			throw new Exception("Problema valore in input");
		}
		filmInstance = entityManager.merge(filmInstance);
		}

	@Override
	public void insert(Film filmInstance) throws Exception {
		if (filmInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.persist(filmInstance);
	}

	@Override
	public void delete(Film filmInstance) throws Exception {
		if (filmInstance == null) {
			throw new Exception("Problema valore in input");
		}

		entityManager.remove(entityManager.merge(filmInstance));
	}

	@Override
	public List<Film> findAllByTitolo(String titolo) throws Exception {
		TypedQuery<Film> query = entityManager.createQuery("from Film f where f.titolo like ?1", Film.class);
		return query.setParameter(1, titolo).getResultList();
	}

	@Override
	public List<Film> findAllByGenere(String genereInput) throws Exception {
		TypedQuery<Film> query = entityManager.createQuery("from Film f where f.genere = ?1", Film.class);
		return query.setParameter(1, genereInput).getResultList();
	}

	@Override
	public List<Film> findAllByCognomeRegista(String cognomeRegistaInput) throws Exception {
		TypedQuery<Film> query = entityManager.createQuery("from Film f left join fetch f.regista where cognome like ?1", Film.class);
		return query.setParameter(1, cognomeRegistaInput + '%').getResultList();
	}

}
