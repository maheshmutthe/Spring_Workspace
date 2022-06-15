package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.model.Student;

public class App2 
{
    public static void main( String[] args ){
        //step 1- Get the handle of spring container
    	//bean factory - for simple application not for web application
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//step 2- ask for student object from spring container
    	// Student student = (Student) factory.getBean("student");    //old style
    	 Student student0 = factory.getBean("student2", Student.class);	//2nd way
    	 Student student1 = factory.getBean("student2", Student.class);
    	//Student student = factory.getBean(Student.class);		//3rd way (same)
    	 //---------------------------------------------------------------------
    	 Student student3 = factory.getBean("student", Student.class);	//2nd way
    	 Student student4 = factory.getBean("student", Student.class);
    	
    	//step 3- use the object
    	System.out.println(student0.hashCode());
    	System.out.println(student1.hashCode());
    	
    	System.out.println(student3.hashCode());
    	System.out.println(student4.hashCode());
    	
    	
    }
}
