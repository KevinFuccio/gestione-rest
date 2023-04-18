package com.week_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.week_project.model.Edificio;
import com.week_project.model.Utente;
import com.week_project.model.infoClass;
import com.week_project.service.EdificioService;
import com.week_project.service.PrenotazioneService;
import com.week_project.service.UtenteService;


@Controller
@RequestMapping("/info")
public class InfoController {
	@Autowired
	UtenteService utente;
	@Autowired
	EdificioService edificio;
	
	
	@GetMapping("/{lang}")
	public ModelAndView infoPage(@PathVariable String lang) {
		return new ModelAndView("infoPage","infoClass",new infoClass(lang));
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
}