package it.test.gestioneregista.service;

import it.test.gestioneregista.dao.MyDaoFactory;
import it.test.gestioneregista.service.film.FilmService;
import it.test.gestioneregista.service.regista.RegistaService;

public class MyServiceFactory {

	// rendiamo le istanze restituite SINGLETON
	private static FilmService filmServiceInstance = null;
	private static RegistaService registaServiceInstance = null;

	public static FilmService getFilmServiceInstance() {
		if (filmServiceInstance == null) {
			filmServiceInstance = new FilmServiceImpl();
			filmServiceInstance.setFilmDAO(MyDaoFactory.getFilmDAOInstance());
		}
		return filmServiceInstance;
	}

	public static RegistaService getRegistaServiceInstance() {
		if (registaServiceInstance == null) {
			registaServiceInstance = new RegistaServiceImpl();
			registaServiceInstance.setRegistaDAO(MyDaoFactory.getRegistaDAOInstance());
		}
		return registaServiceInstance;
	}

}
