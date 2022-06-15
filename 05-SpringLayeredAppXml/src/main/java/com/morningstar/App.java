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
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-configzz.xml");

    	
    	//step 3- use the object
    	 StudentService service = factory.getBean(StudentService.class);
// 		StudentDao dao = new StudentDaoImpl();
// 		service.setDao(dao);
 		
 		List<Student> result = service.findAllList();
 		for (Student student : result) {
 			System.out.println("Student Id :"+student.getStudentId());
 			System.out.println("Student Name :"+student.getStudentName());
 			System.out.println("Student Score :"+student.getStudentScore());
 			System.out.println("----------------------------------------------");
    	
    }
}
}
