package it.test.gestioneregista.test;

import java.util.List;

import it.test.gestioneregista.dao.EntityManagerUtil;
import it.test.gestioneregista.model.Film;
import it.test.gestioneregista.model.Regista;
import it.test.gestioneregista.service.MyServiceFactory;
import it.test.gestioneregista.service.film.FilmService;
import it.test.gestioneregista.service.regista.RegistaService;

public class TestGestioneRegista {

	public static void main(String[] args) {

		RegistaService registaService = MyServiceFactory.getRegistaServiceInstance();
		FilmService filmService = MyServiceFactory.getFilmServiceInstance();

		try {

//			Regista nuovoRegista = new Regista("Mario", "Rossi", 5);
//			registaService.inserisciNuovo(nuovoRegista);
//			System.out.println("Regista appena inserito: " + nuovoRegista);
//
//			Film nuovoFilm = new Film("V per Vendetta", "Thriller", 132);
//			nuovoFilm.setRegista(nuovoRegista);
//			filmService.inserisciNuovo(nuovoFilm);
//			System.out.println("Film appena inserito: " + nuovoFilm);
//
//			Regista registaInstance = registaService.caricaSingoloRegista(nuovoRegista.getId());
//			
//			registaInstance = registaService.caricaSingoloRegistaConFilms(nuovoRegista.getId());
//
//			System.out.println("Stampo i film del regista appena ricaricato:" + registaInstance.getFilms());

			// DELETE FILM
//			System.out.println("============ DELETE FILM =====================");
//			long idFilmDb = 5;
//			Film filmDb2 = filmService.caricaSingoloFilm(idFilmDb);
//			if (filmDb2 != null) {
//				filmService.rimuovi(filmDb2);
//				filmDb2 = filmService.caricaSingoloFilm(idFilmDb);
//				if (filmDb2 == null)
//					System.out.println("Cancellazione ok");
//				else
//					System.out.println("Cancellazione fallita!!!");
//			}
			
			// update regista
//			List<Regista> listaRegista = registaService.cercaRegistaConInizialeNome("S");
//			for (Regista registaItem : listaRegista) {
//				System.out.println(registaItem);
//			}
//			
//			if(!listaRegista.isEmpty()) {
//				Regista registaDb = listaRegista.get(0);
//				System.out.println(" \n main before setOscarVinti:" + registaDb);
//				registaDb.setOscarVinti(registaDb.getOscarVinti()+1);
//				registaService.aggiorna(registaDb);
//				
//				System.out.println(" \n carico regista con id: "+registaDb.getId() + "\n");
//				System.out.println(registaService.caricaSingoloRegista(registaDb.getId()));
//			}			

//			// elencare i registi
//			System.out.println("Elenco i registi:");
//			for (Regista registaItem : registaService.listAllRegisti()) {
//				System.out.println(registaItem);
//			}
//
//			// elenca tutti i registi con iniziale nome
//			System.out.println("Ecco i registi con iniziale nome selezionata ");
//			String iniziale = "S";
//			for (Regista registaItem : registaService.cercaRegistaConInizialeNome(iniziale)) {
//				System.out.println(registaItem);
//			}
			
			// elenca regista con più oscar
			System.out.println("Ecco il miglior regista: ");
			Regista migliorRegista = registaService.registaConPiuOscarVinti();
				System.out.println(migliorRegista);
			

			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			EntityManagerUtil.shutdown();
		}

	}
}
