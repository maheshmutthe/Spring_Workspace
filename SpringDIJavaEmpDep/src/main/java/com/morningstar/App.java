package com.morningstar;
	
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.morningstar.config.AppConfig;
import com.morningstar.model.Department;
import com.morningstar.model.Employee;

public class App 
{
    public static void main( String[] args ){

    	BeanFactory factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	 Employee employee = factory.getBean(Employee.class);	//2nd way
    	//Student student = factory.getBean(Student.class);		//3rd way (same)
    	 Department department = factory.getBean(Department.class);
    	
    	//step 3- use the object
    	System.out.println(employee);
    	System.out.println(employee.getDepartment());
    	
    	
    }
}
