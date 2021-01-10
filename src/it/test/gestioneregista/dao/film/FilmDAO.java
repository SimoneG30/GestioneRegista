package it.test.gestioneregista.dao.film;

import java.util.List;

import it.test.gestioneregista.dao.IBaseDAO;
import it.test.gestioneregista.model.Film;

public interface FilmDAO extends IBaseDAO<Film> {
	
	public List<Film> findAllByTitoloConIniziale(String titolo) throws Exception;
	
	public List<Film> findAllByGenere(String genereInput) throws Exception;
	
	public List<Film> findAllByCognomeRegistaConIniziale(String cognomeRegistaInput) throws Exception;
	
}
