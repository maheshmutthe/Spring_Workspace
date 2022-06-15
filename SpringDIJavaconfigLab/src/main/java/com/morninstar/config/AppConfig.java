package com.morninstar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.morningstar.Model.Employee;


@Configuration
public class AppConfig {
//@Configuration annotation is used to mark class as configuration class;

	@Bean
	@Scope(scopeName = "singleton")
	public Employee getEmployee() {

		Employee emp=new Employee();
		
		return emp;
	}

}
