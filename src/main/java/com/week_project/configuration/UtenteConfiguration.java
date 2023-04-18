package com.week_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.week_project.model.Utente;

@Configuration
public class UtenteConfiguration {
	
	@Bean("customUtente")
	@Scope("prototype")
	public Utente customUtente() {
		return new Utente();
	}

}
