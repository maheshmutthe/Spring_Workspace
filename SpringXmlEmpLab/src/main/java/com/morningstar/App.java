package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.Model.Department;
import com.morningstar.Model.Employee;


public class App 
{
    public static void main( String[] args ){
        //step 1- Get the handle of spring container
    	//bean factory - for simple application not for web application
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//step 2- ask for student object from spring container
    	// Student student = (Student) factory.getBean("student");    //old style
    	 Employee emp = factory.getBean(Employee.class);	//2nd way
    	
    	
    	//step 3- use the object
    	System.out.println(emp);
    	System.out.println(emp.getDepartment()	);
    	
    	
    }
}
