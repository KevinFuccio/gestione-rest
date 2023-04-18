package com.week_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.week_project.model.Postazione;

@Configuration
public class PostazioneConfiguration {

	
	@Bean("customPostazione")
	@Scope("prototype")
	public Postazione customPostazione() {
		return new Postazione();
	}
}
