package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.model.Student;

public class App 
{
    public static void main( String[] args ){
        //step 1- Get the handle of spring container
    	//bean factory - for simple application not for web application
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//step 2- ask for student object from spring container
    	// Student student = (Student) factory.getBean("student");    //old style
    	 Student student = factory.getBean(Student.class);	//2nd way
    	//Student student = factory.getBean(Student.class);		//3rd way (same)
    	
    	//step 3- use the object
    	System.out.println(student);
    	System.out.println(student.getAddress()	);
    	
    	
    }
}
