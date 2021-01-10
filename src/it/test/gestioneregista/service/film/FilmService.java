package it.test.gestioneregista.service.film;

import java.util.List;

import it.test.gestioneregista.dao.film.FilmDAO;
import it.test.gestioneregista.model.Film;

public interface FilmService {

	public List<Film> listAllFilms() throws Exception;

	public Film caricaSingoloFilm(Long id) throws Exception;

	public void aggiorna(Film filmInstance) throws Exception;

	public void inserisciNuovo(Film filmInstance) throws Exception;

	public void rimuovi(Film filmInstance) throws Exception;
	
	public List<Film> cercaTuttiIFilmConTitolo(String titolo) throws Exception;

	public List<Film> cercaTuttiIFilmConGenere(String genereInput) throws Exception;
	
	public List<Film> cercaTuttiIFilmConCognomeRegista(String cognomeRegistaInput) throws Exception;
	
	//per injection
	public void setFilmDAO(FilmDAO filmDAO);

}
