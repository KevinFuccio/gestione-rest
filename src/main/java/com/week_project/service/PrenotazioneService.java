package com.week_project.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.week_project.model.Edificio;
import com.week_project.model.Postazione;
import com.week_project.model.Prenotazione;
import com.week_project.model.Stato_Postazione;
import com.week_project.model.Utente;
import com.week_project.repository.PostazioneDaoRepository;
import com.week_project.repository.PrenotazioneDaoRepository;
import com.week_project.repository.UtenteDaoRepository;

@Service
public class PrenotazioneService {
	@Autowired
	PrenotazioneDaoRepository repo;
	@Autowired
	PostazioneDaoRepository postazione;
	@Autowired
	UtenteDaoRepository utente;
	@Autowired
	@Qualifier("customPrenotazione")
	private ObjectProvider<Prenotazione> customPrenotazione;
	
	public void createPrenotazione(Utente u, Postazione a,LocalDate s) {
			
		if(a.isLibero() == true) {
			System.out.println(u.getPrenotazioni());
			System.out.println(s);
			Boolean b = u.getPrenotazioni().stream().map(e-> e.getPrenotazionePostazione()).collect(Collectors.toList()).contains(s);
			if(!b) {
				
				Prenotazione p = customPrenotazione.getObject();			
				p.setPrenotazionePostazione(s);
				p.setFinePrenotazionePostazione(s.plusDays(1));
				p.setUtente(u);
				p.setPostazionePrenotata(a);
				p.getPostazionePrenotata().setLibero(false);
				postazione.save(a);		
				savePrenotazione(p);
				
			}else {
				
				System.out.println("Gia hai prenotato in questa data!");
			}
				
			
		}else {
			System.out.println("Postazione occupata!");
		}
		
	}
	
	public void savePrenotazione(Prenotazione p) {
		repo.save(p);
	}
	public List<Prenotazione> findAll(){
		return (List<Prenotazione>) repo.findAll();
	}

}
