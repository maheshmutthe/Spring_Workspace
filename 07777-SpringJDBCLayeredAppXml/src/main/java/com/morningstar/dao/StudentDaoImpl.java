package com.morningstar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.morningstar.model.Student;

public class StudentDaoImpl implements StudentDao
{
	private static Connection connection = null;	// to establish connection
	
	public static Connection getConnection() // getter for above connection
	{
		return connection;
	}
	
	static
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");	// add jar file
			connection.setAutoCommit(false);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("There is some Problem.");
			e.printStackTrace();	// print log stack trace
		}
		
	}


	@Override
	public int createStudent(Student student) throws SQLException 
	{		
		String sql = "Insert Into Student(Student_Id, Student_Name, Student_Score) values (?, ?, ?)";	// insert statement to insert records
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.setDouble(3, student.getStudentScore());
		
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException 
	{
		String sql = "Select * From Student Where Student_Id =" + studentId;
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Student student = null;
		while(rs.next())
		{
			int stuId = rs.getInt("Student_Id");
			String stuName = rs.getString("Student_Name");
			double stuScore = rs.getDouble("Student_Score");
			student = new Student(stuId, stuName,stuScore);
		}
		stmt.close();
		return student;
	}

	@Override
	public List<Student> readAllStudent() throws SQLException {
		String sql = "Select * From Student";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Student> list = new ArrayList<>();
		while(rs.next())
		{
			int stuId = rs.getInt("Student_Id");
			String stuName = rs.getString("Student_Name");
			double stuScore = rs.getDouble("Student_Score");
			Student student = new Student(stuId, stuName,stuScore);
			list.add(student);
		}
		return list;
	}

}
