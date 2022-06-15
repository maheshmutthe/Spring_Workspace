package com.morningstar;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.config.AppConfig;
import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentService;
import com.morningstar.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args ){
        //step 1- Get the handle of spring container
    //	BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    	
    	//step 3- use the object
    	 StudentService service = context.getBean(StudentService.class);
// 		StudentDao dao = new StudentDaoImpl();
// 		service.setDao(dao);
    	 
//    	 Student student2 = context.getBean(Student.class);
//    	 student2.setStudentId(103);
//    	 student2.setStudentName("Shubham");
//    	 student2.setStudentScore(88);
//    		service.addStudent(student2);
 		
 		List<Student> result = service.findAllList();
 		for (Student student : result) {
 			System.out.println("Student Id :"+student.getStudentId());
 			System.out.println("Student Name :"+student.getStudentName());
 			System.out.println("Student Score :"+student.getStudentScore());
 			System.out.println("----------------------------------------------");
    	
    }
}
}
