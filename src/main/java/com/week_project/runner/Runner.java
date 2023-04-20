package com.week_project.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.week_project.model.Postazione;
import com.week_project.model.Stato_Postazione;
import com.week_project.model.Utente;
import com.week_project.service.EdificioService;
import com.week_project.service.PostazioneService;
import com.week_project.service.PrenotazioneService;
import com.week_project.service.UtenteService;


@Component
public class Runner implements CommandLineRunner{

	@Autowired
	EdificioService edificioService;
	@Autowired
	PostazioneService postazioneService;
	@Autowired
	UtenteService utenteService;
	@Autowired
	PrenotazioneService prenotazioneService;
		
	@Override
	public void run(String... args) throws Exception {	
//		//creazione edificio
//		edificioService.createCustomEdificio("Colabrodo", "alfio 69", "Milano");
////		//creazione postazione
//		postazioneService.createPostazione("Fatture", Stato_Postazione.OPENSPACE, 20, edificioService.findEdificioByID(1l));
////		//creazione utente
//		utenteService.createUtente("Pattuallo", "kevin", "k.p@gmail.com");
		
		//prenotazioneService.createPrenotazione(utenteService.findUtenteByID(1l), postazioneService.findPostazioneByID(1l), LocalDate.of(2022, 8, 16));
//		// settaggio del posto libero a 'true' per verificare se si potesse prenotare con la stessa data due volte
//		Postazione p = postazioneService.findPostazioneByID(2l);
//		p.setLibero(true);
//		postazioneService.savePostazione(p);
//		//prenotazione gia esistente ma con la postazione libera
//		prenotazioneService.createPrenotazione(utenteService.findUtenteByID(1l), postazioneService.findPostazioneByID(2l), LocalDate.of(2024, 8, 26));
//		
//		prenotazioneService.createPrenotazione(utenteService.findUtenteByID(3l),postazioneService.findPostazioneByID(3l),LocalDate.now());
		
		//cercare la citta dando il tipo di postazione e la citta
//		System.out.println(utenteService.findByCityIn(Stato_Postazione.OPENSPACE,"Catania"));
		
	}
}
	
