package com.xm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value="/")
	public String testProperty()
	{
		return env.getProperty("spring.datasource.url");
	}
}
