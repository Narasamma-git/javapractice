package com.technoelevate.stdbmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.technoelevate.stdbmanagement.dao.StudentDaoImpl;
import com.technoelevate.stdbmanagement.dto.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
}
