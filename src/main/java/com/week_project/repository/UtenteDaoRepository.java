package com.week_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.week_project.model.Edificio;
import com.week_project.model.Postazione;
import com.week_project.model.Stato_Postazione;
import com.week_project.model.Utente;

//AND SELECT e FROM Edificio e WHERE e.citta IN :citta
@Repository
public interface UtenteDaoRepository extends CrudRepository<Utente, Long> {
	
	
	@Query(value="SELECT p FROM Postazione p WHERE p.tipologia_postazione = :postazione AND p.edificio.citta = :citta")
	public List<Postazione> findByCityInCitta(Stato_Postazione postazione,String citta);
}
