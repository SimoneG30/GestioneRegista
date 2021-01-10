package it.test.gestioneregista.service.film;

import java.util.List;

import it.test.gestioneregista.dao.film.FilmDAO;
import it.test.gestioneregista.model.Film;
import it.test.gestioneregista.model.Regista;

public interface FilmService {

	public List<Film> listAllFilms() throws Exception;

	public Film caricaSingoloFilm(Long id) throws Exception;

	public void aggiorna(Film filmInstance) throws Exception;

	public void inserisciNuovo(Film filmInstance) throws Exception;

	public void rimuovi(Film filmInstance) throws Exception;

	public List<Film> cercaTuttiIFilmConRegista(Regista registaInput) throws Exception;
	
	public int cancellaTuttiIFilmConRegista(Regista registaInput) throws Exception;
	
	public List<Film> cercaTuttiIFilmConGenere(String genereInput) throws Exception;
	
	public List<Film> cercaTuttiIFilmConCognomeRegista(String cognomeRegistaInput) throws Exception;
	
	//per injection
	public void setFilmDAO(FilmDAO filmDAO);

}
