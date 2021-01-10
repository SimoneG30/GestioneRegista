package it.test.gestioneregista.service.film;

import java.util.List;

import it.test.gestioneregista.dao.film.FilmDAO;
import it.test.gestioneregista.model.Film;
import it.test.gestioneregista.model.Regista;

public class FilmServiceImpl implements FilmService{

	@Override
	public List<Film> listAllFilms() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film caricaSingoloFilm(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aggiorna(Film filmInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserisciNuovo(Film filmInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rimuovi(Film filmInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Film> cercaTuttiIFilmConRegista(Regista registaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cancellaTuttiIFilmConRegista(Regista registaInput) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Film> cercaTuttiIFilmConGenere(String genereInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> cercaTuttiIFilmConCognomeRegista(String cognomeRegistaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFilmDAO(FilmDAO filmDAO) {
		// TODO Auto-generated method stub
		
	}

}
