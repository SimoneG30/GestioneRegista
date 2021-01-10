package it.test.gestioneregista.dao;

import it.test.gestioneregista.dao.film.FilmDAO;
import it.test.gestioneregista.dao.film.FilmDAOImpl;
import it.test.gestioneregista.dao.regista.RegistaDAO;
import it.test.gestioneregista.dao.regista.RegistaDAOImpl;

public class MyDaoFactory {

	private static FilmDAO filmDAOInstance = null;
	private static RegistaDAO registaDAOInstance = null;

	public static FilmDAO getFilmDAOInstance() {
		if (filmDAOInstance == null)
			filmDAOInstance = new FilmDAOImpl();
		return filmDAOInstance;
	}

	public static RegistaDAO getRegistaDAOInstance(){
		if(registaDAOInstance == null)
			registaDAOInstance= new RegistaDAOImpl();
		return registaDAOInstance;
	}

}
