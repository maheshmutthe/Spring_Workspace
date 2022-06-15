package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.morningstar.model.Student;

public class StudentDaoSpringJdbcImpl implements StudentDao
{
	private JdbcTemplate template = null;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int createStudent(Student student) throws SQLException {
		String query = "Insert into Student(Student_Id, student_Name, student_Score) values (?, ?, ?)";
		int result = template.update(query, student.getStudentId(), student.getStudentName(), student.getStudentScore());
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException {
		
		return null;
	}

	@Override
	public List<Student> readAllStudent() throws SQLException {
	
		return null;
	}
	
}
