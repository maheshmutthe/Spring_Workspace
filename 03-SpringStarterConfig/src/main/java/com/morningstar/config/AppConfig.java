package com.morningstar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.morningstar.model.Student;

@Configuration	//to mark as any class as configuration class 
public class AppConfig {
	@Bean	//default scope singleton
	@Scope(scopeName="singleton")	//
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
