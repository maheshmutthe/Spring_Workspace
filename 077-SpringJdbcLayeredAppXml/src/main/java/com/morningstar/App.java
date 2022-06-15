package com.morningstar;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentService;
import com.morningstar.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args ){
        //step 1- Get the handle of spring container
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");

    	
    	//step 3- use the object
    	 StudentService service = factory.getBean(StudentService.class);
    	 
    	 Student student2 = factory.getBean(Student.class);
    	 student2.setStudentId(105);
    	 student2.setStudentName("Rahul");
    	 student2.setStudentScore(78);
    	 service.addStudent(student2);
 		
 		List<Student> result = service.findAllList();
 		for (Student student : result) {
 			System.out.println("Student Id :"+student.getStudentId());
 			System.out.println("Student Name :"+student.getStudentName());
 			System.out.println("Student Score :"+student.getStudentScore());
 			System.out.println("----------------------------------------------");
    	
    }
}
}
