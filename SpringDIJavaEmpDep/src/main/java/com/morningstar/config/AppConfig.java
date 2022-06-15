package com.morningstar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration	//to mark as any class as configuration class 
@ComponentScan(basePackages="com.morningstar.model")
public class AppConfig {
	// types of componant 1) controller, 2)Service, 3)Repository, 4)RestController
	
}

