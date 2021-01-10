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
			
			// DELETE REGISTA
//			System.out.println("============ DELETE REGISTA =====================");
//			long idRegistaDb = 8;
//			Regista registaDb2 = registaService.caricaSingoloRegista(idRegistaDb);
//			if (registaDb2 != null) {
//				registaService.rimuovi(registaDb2);
//				registaDb2 = registaService.caricaSingoloRegista(idRegistaDb);
//				if (registaDb2 == null)
//					System.out.println("Cancellazione ok");
//				else
//					System.out.println("Cancellazione fallita!!!");
//			}
			
			// update regista
//			System.out.println("============ UPDATE REGISTA =====================");
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
			
			// update films
//			System.out.println("============ UPDATE FILMS =====================");
//			List<Film> listaFilm = filmService.cercaTuttiIFilmConTitoloCheIniziaPer("S");
//			for (Film filmItem : listaFilm) {
//				System.out.println(filmItem);
//			}
//			
//			if(!listaFilm.isEmpty()) {
//				Film filmDb = listaFilm.get(0);
//				System.out.println(" \n main before setDurata +10:" + filmDb);
//				filmDb.setDurata(filmDb.getDurata()+10);
//				filmService.aggiorna(filmDb);
//				
//				System.out.println(" \n carico film con id: "+filmDb.getId() + "\n");
//				System.out.println(filmService.caricaSingoloFilm(filmDb.getId()));
//			}			

//			// elenco registi
//			System.out.println("Elenco i registi:");
//			for (Regista registaItem : registaService.listAllRegisti()) {
//				System.out.println(registaItem);
//			}
			
//			// elenco film
//			System.out.println("Elenco i film:");
//			for (Film filmItem : filmService.listAllFilms()) {
//				System.out.println(filmItem);
//			}
//
//			// elenco tutti i registi con iniziale nome
//			System.out.println("Ecco i registi con iniziale nome selezionata ");
//			String iniziale = "S";
//			for (Regista registaItem : registaService.cercaRegistaConInizialeNome(iniziale)) {
//				System.out.println(registaItem);
//			}
			
//			// elenco tutti i film con iniziale titolo
//			System.out.println("Ecco i film con iniziale titolo selezionata ");
//			String iniziale = "V";
//			for (Film filmItem : filmService.cercaTuttiIFilmConTitoloCheIniziaPer(iniziale)) {
//				System.out.println(filmItem);
//			}
			
			// regista con più oscar
//			System.out.println("Ecco il miglior regista: ");
//			Regista migliorRegista = registaService.registaConPiuOscarVinti();
//			System.out.println(migliorRegista);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			EntityManagerUtil.shutdown();
		}

	}
}
