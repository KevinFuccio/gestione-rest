package com.week_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.week_project.model.Edificio;



@Configuration
public class EdificioConfiguration {
	
	
	@Bean("customEdificio")
	@Scope("prototype")
	public Edificio customEdificio() {
		return new Edificio();
	};

}
