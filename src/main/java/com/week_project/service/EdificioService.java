package com.week_project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.week_project.model.Edificio;
import com.week_project.repository.EdificioDaoRepository;




@Service
public class EdificioService {
		
	@Autowired
	private EdificioDaoRepository repo;
	@Autowired
	@Qualifier("customEdificio")
	private ObjectProvider<Edificio> customEdificioProvider;
	
	public void createCustomEdificio(String name, String indirizzo,String citta) {
		Edificio e = customEdificioProvider.getObject();
		e.setNome(name);
		e.setIndirizzo(indirizzo);
		e.setCitta(citta);
		
		saveEdificio(e);
	}
	
	public void saveEdificio(Edificio e) {
		repo.save(e);
	}
	public void updateEdificio(Edificio e) {
		repo.save(e);
	}
	public Edificio findEdificioByID(Long id) {
		return repo.findById(id).get();
	}
	public void removeEdificio(Edificio e) {
		repo.delete(e);
	}
	public List<Edificio> findAll(){
		return (List<Edificio>) repo.findAll();
	}
	
	
	
	
}
