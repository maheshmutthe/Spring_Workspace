package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.config.AppConfig;
import com.morningstar.model.Employee;


public class App2 
{
    public static void main( String[] args )
    {
       //step 01 get the handle of the Spring Container
    	//BeanFactory factory=new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	BeanFactory factory=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//Step 02 :will ask for Student Object for the spring Container.
    	Employee employee=factory.getBean(Employee.class);
    	
    	//Step 03: Use the Student Object
    	System.out.println(employee);
    }
    
}
