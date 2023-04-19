package com.week_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.week_project.model.Edificio;
import com.week_project.model.Postazione;
import com.week_project.model.Utente;
import com.week_project.model.infoClass;
import com.week_project.service.EdificioService;
import com.week_project.service.InfoClassService;
import com.week_project.service.PostazioneService;
import com.week_project.service.PrenotazioneService;
import com.week_project.service.UtenteService;


@Controller
@RequestMapping("/info")
public class InfoController {
	@Autowired
	UtenteService utente;
	@Autowired
	EdificioService edificio;
	@Autowired
	InfoClassService info;
	@Autowired
	PostazioneService postazione;
	@Autowired
	PrenotazioneService prenotazione;
	
	
	@GetMapping("/{lang}")
	public ModelAndView infoPage(@PathVariable String lang) {
		return new ModelAndView("infoPage","infoClass",new infoClass(lang));
	}
	
	//senza html
	@GetMapping("/test/{lang}")
	public @ResponseBody String edificio(@PathVariable String lang){
		return info.stringifyInfo(lang);
	}
	
	@GetMapping("/utente/{id}")
	public ResponseEntity<Utente> utente(@PathVariable Long id){
		ResponseEntity<Utente> resp= new ResponseEntity<Utente>(utente.findUtenteByID(id), HttpStatus.OK);
		return resp;
	}
	@GetMapping("/edificio/{id}")
	public ResponseEntity<Edificio> edificio(@PathVariable Long id){
		ResponseEntity<Edificio> resp= new ResponseEntity<Edificio>(edificio.findEdificioByID(id), HttpStatus.OK);
		return resp;
	}
	@PutMapping("/edificio/{id}")
	public ResponseEntity<Edificio> edificioFind(@PathVariable Long id,@RequestBody Edificio e){
		
		Edificio ed=edificio.findEdificioByID(id);
		ed.setCitta(e.getCitta());
		ed.setIndirizzo(e.getIndirizzo());
		ed.setNome(e.getNome());
		ResponseEntity<Edificio> resp= new ResponseEntity<Edificio>(edificio.updateEdificio(ed), HttpStatus.OK);
		return resp;
	}
	@DeleteMapping("/postazione/{id}")
	public ResponseEntity<String> postazioneDelete(@PathVariable Long id){
		return new ResponseEntity<String>(utente.removeUtenteByID(id),HttpStatus.OK);
	}
	@GetMapping("/prenotazioni")
	public ResponseEntity<?> getAllPrenotazioni(){
		return new ResponseEntity<>(utente.findAll(),HttpStatus.OK);
	}
}