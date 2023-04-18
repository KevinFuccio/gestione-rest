package com.week_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.week_project.model.Prenotazione;

@Configuration
public class PrenotazioneConfiguration {

	
	@Bean("customPrenotazione")
	@Scope("prototype")
	public Prenotazione customPrenotazione() {
		return new Prenotazione();
	}
}
