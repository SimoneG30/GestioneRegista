package it.test.gestioneregista.dao.film;

import java.util.List;

import javax.persistence.EntityManager;

import it.test.gestioneregista.model.Film;
import it.test.gestioneregista.model.Regista;

public class FilmDAOImpl implements FilmDAO {

	@Override
	public List<Film> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Film o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Film o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Film o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Film> findAllByRegista(Regista registaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAllByRegista(Regista registaInput) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Film> findAllByGenere(String genereInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> findAllByCognomeRegista(String cognomeRegistaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
