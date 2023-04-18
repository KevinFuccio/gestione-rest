package com.week_project.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.week_project.model.infoClass;

@Service
public class InfoClassService {

	@Autowired
	@Qualifier("customInfo")
	private ObjectProvider<infoClass> customInfo;
	public String stringifyInfo(String lang) {
		return customInfo.getObject(lang).toString();
	}
}
