package com.week_project.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.week_project.model.Edificio;
import com.week_project.model.Postazione;
import com.week_project.model.Stato_Postazione;
import com.week_project.model.Utente;
import com.week_project.repository.PostazioneDaoRepository;
import com.week_project.repository.UtenteDaoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteService {

	@Autowired
	UtenteDaoRepository repo;
	@Autowired
	@Qualifier("customUtente")
	private ObjectProvider<Utente> customUtente;
	
	public void createUtente(String Username,String nome,String email) {
		Utente u = customUtente.getObject();
		u.setUsername(Username);
		u.setNome_completo(nome);
		u.setEmail(email);
		
		saveUtente(u);
		
	}
	public void saveUtente(Utente u) {
		repo.save(u);
	}
	
	public Utente findUtenteByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Utente> findAll(){
		return (List<Utente>) repo.findAll();
	}
	public List<Postazione> findByCityIn(Stato_Postazione stato,String citta){
		return repo.findByCityInCitta(stato,citta);
	}
	public String removeUtenteByID(Long id) {
		if(!repo.existsById(id)) {
			throw new NoSuchElementException("non c'e l'utente");
		}
		repo.deleteById(id);
		return "utente eliminato";
	}
	public Page<Utente> findAllPageable(Pageable pageable){
		return (Page<Utente>) repo.findAll(pageable);
	}
}
