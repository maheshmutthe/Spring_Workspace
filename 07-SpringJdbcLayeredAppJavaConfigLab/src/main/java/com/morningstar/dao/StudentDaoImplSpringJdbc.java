package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Student;

@Repository
public class StudentDaoImplSpringJdbc implements StudentDao{

	@Autowired
	private JdbcTemplate template=null;
	

	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int createStudent(Student student) throws SQLException {
		
		String query="Insert Into Student(Student_Id,Student_Name,Student_Score) values(?,?,?)";
		
	   int result= template.update(query,student.getStudentId(),student.getStudentName(),student.getStudentScore());
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> readAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
