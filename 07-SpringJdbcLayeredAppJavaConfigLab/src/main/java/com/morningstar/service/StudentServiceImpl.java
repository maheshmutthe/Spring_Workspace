package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao = null;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			int result = dao.createStudent(student);
			if (result >= 1) {
				StudentDaoImpl.getConnection().commit();
				return true; 
			}
		} catch (SQLException e) {
			try {
				StudentDaoImpl.getConnection().rollback();
			} catch (SQLException e2) {

				e2.printStackTrace();
			}
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student findByStudentId(int studentId) {
		Student student = null;
		try {
			student = dao.readStudent(studentId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

//	@Override	
//	public List<Student> findAllStudents() {
//		List<Student> list = null;
//		try {
//			 list = dao.readAllStudents();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

	@Override
	public List<Student> findAllList() {
		// TODO Auto-generated method stub
		return null;
	}

}
