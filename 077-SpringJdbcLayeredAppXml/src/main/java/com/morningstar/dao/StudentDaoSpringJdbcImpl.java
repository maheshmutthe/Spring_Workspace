package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.morningstar.model.Student;

public class StudentDaoSpringJdbcImpl implements StudentDao {
	private JdbcTemplate template = null;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int createStudent(Student student) throws SQLException {
		String query = "Insert Into Student(Student_Id, Student_Name, Student_Score) Values(?, ?, ?)";
		int result = template.update(query, student.getStudentId(), student.getStudentName(), student.getStudentScore());
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException {
	//	String query = "Select s from Student s where Id"+studentId;
		return null;
	}

	@Override
	public List<Student> readAllStudents() throws SQLException {
		return null;
	}
	

}
