package com.morningstar;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentService;
import com.morningstar.service.StudentServiceImpl;

public class App {
	public static void main(String[] args) {
		// step 1 - Get handle/reference of spring container
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
		
		StudentService service = factory.getBean(StudentService.class);
		
		Student student2 = factory.getBean(Student.class);
		student2.setStudentId(106);
		student2.setStudentName("piya");
		student2.setStudentScore(92);
		
		service.addStudent(student2);
		
		System.out.println("Student is added");
		
		/*List<Student> result = service.findAllStudents();
		for(Student student : result)
		{
			System.out.println("Student Id:" + student.getStudentId());
			System.out.println("Student Name:" + student.getStudentName());
			System.out.println("Student Score:" + student.getStudentScore());
			System.out.println("----------------------------------");
		}*/
	}
}
