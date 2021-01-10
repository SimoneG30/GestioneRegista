package it.test.gestioneregista.dao.film;

import java.util.List;

import it.test.gestioneregista.model.Regista;
import it.test.gestioneregista.dao.IBaseDAO;
import it.test.gestioneregista.model.Film;

public interface FilmDAO extends IBaseDAO<Film> {

	public List<Film> findAllByRegista(Regista registaInput) throws Exception;
	
	public int deleteAllByRegista(Regista registaInput) throws Exception;
	
	public List<Film> findAllByGenere(String genereInput) throws Exception;
	
	public List<Film> findAllByCognomeRegista(String cognomeRegistaInput) throws Exception;
	
}
