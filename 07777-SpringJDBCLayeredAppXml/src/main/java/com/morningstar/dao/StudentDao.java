package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Student;

public interface StudentDao
{
	public int createStudent(Student student) throws SQLException;	// Student.java
	public Student readStudent(int studentId) throws SQLException;	// return type is Student Object of Student.java
	public List<Student> readAllStudent() throws SQLException;	
	
}
