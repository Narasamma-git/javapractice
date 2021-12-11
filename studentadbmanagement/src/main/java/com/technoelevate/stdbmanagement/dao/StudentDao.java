package com.technoelevate.stdbmanagement.dao;

import java.util.List;

import com.technoelevate.stdbmanagement.dto.Student;

public interface StudentDao {

	public List<Student> getAllStudent();
	public Student getStudent(int id);
	public boolean addStudent(Student std,int id,String name,String password);
	public boolean updateStudent(int id);
	public boolean deleteStudent(int id);
	
	

}
