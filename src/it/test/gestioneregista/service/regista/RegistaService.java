package it.test.gestioneregista.service.regista;

import java.util.List;

import it.test.gestioneregista.dao.regista.RegistaDAO;
import it.test.gestioneregista.model.Regista;

public interface RegistaService {

	public List<Regista> listAllRegisti() throws Exception;

	public Regista caricaSingoloRegista(Long id) throws Exception;

	public void aggiorna(Regista registaInstance) throws Exception;

	public void inserisciNuovo(Regista registaInstance) throws Exception;

	public void rimuovi(Regista registaInstance) throws Exception;
	
	public Regista caricaSingoloRegistaConFilms(Long id) throws Exception;

	public List<Regista> cercaRegistaConInizialeNome(String inizialeInput) throws Exception;
	
	public Regista registaConPiuOscarVinti() throws Exception;
	
	//per injection
		public void setRegistaDAO(RegistaDAO registaDAO);
}
