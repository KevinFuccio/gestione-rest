package com.week_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.week_project.model.infoClass;

@Configuration
public class InfoClassConfiguration {

	
	@Bean("customInfo")
	@Scope("prototype")
	public infoClass customInfo(String l) {
		return new infoClass(l);
	}
}
