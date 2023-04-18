package com.week_project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.week_project.model.Edificio;
import com.week_project.model.Postazione;
import com.week_project.model.Stato_Postazione;
import com.week_project.model.Utente;
import com.week_project.repository.PostazioneDaoRepository;

@Service
public class PostazioneService {

	@Autowired
	PostazioneDaoRepository repo;
	@Autowired
	@Qualifier("customPostazione")
	private ObjectProvider<Postazione> customPostazione;
	
	
	
	public void createPostazione(String descrizione,Stato_Postazione stato,Integer numeroPartecipanti,Edificio e) {
		Postazione p = customPostazione.getObject();
		p.setDescrizione(descrizione);
		p.setTipologia_postazione(stato);
		p.setNumero_partecipanti(numeroPartecipanti);
		p.setEdificio(e);
		
		savePostazione(p);
	}
	public void savePostazione(Postazione e) {
		repo.save(e);
	};
	public Postazione findPostazioneByID(Long id) {
		return repo.findById(id).get();
	}
	public List<Postazione> findAll(){
		return (List<Postazione>) repo.findAll();
	}
}
