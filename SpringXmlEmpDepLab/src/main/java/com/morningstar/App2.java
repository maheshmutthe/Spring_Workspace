package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.morningstar.Model.Employee;

public class App2 
{
    public static void main( String[] args ){
        //step 1- Get the handle of spring container
    	//bean factory - for simple application not for web application
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//step 2- ask for student object from spring container
    	// Student student = (Student) factory.getBean("student");    //old style
    	 Employee emp0 = factory.getBean("emp2", Employee.class);	//2nd way
    	 Employee emp1 = factory.getBean("emp2", Employee.class);
    	//Student student = factory.getBean(Student.class);		//3rd way (same)
    	 //---------------------------------------------------------------------
    	 Employee emp3 = factory.getBean("emp", Employee.class);	//2nd way
    	 Employee emp4 = factory.getBean("emp", Employee.class);
    	
    	//step 3- use the object
    	System.out.println(emp0.hashCode());
    	System.out.println(emp1.hashCode());
    	
    	System.out.println(emp3.hashCode());
    	System.out.println(emp4.hashCode());
    	
    	
    }
}
