package it.test.gestioneregista.dao.regista;

import java.util.List;

import it.test.gestioneregista.dao.IBaseDAO;
import it.test.gestioneregista.model.Regista;

public interface RegistaDAO extends IBaseDAO<Regista> {
	
	public Regista getEagerFilms(Long id) throws Exception;

	public List<Regista> findAllByIniziali(String inizialeInput) throws Exception;
	
	public Regista registaConPiuOscarVinti() throws Exception;
}
