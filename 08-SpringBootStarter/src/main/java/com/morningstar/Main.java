package com.morningstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.morningstar.model.Student;
import com.morningstar.service.StudentService;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);
		
		StudentService service = context.getBean(StudentService.class);
		
		Student student = context.getBean(Student.class);
		student.setStudentId(108);
		student.setStudentName("nama");
		student.setStudentScore(93);
		
		service.addStudent(student);
		
		System.out.println("Student is added");
		
		System.out.println(student);

	}

}
