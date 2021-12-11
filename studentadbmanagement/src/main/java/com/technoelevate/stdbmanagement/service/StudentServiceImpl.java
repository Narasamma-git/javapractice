package com.technoelevate.stdbmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technoelevate.stdbmanagement.dao.StudentDaoImpl;
import com.technoelevate.stdbmanagement.dto.Student;
@Component
public class StudentServiceImpl  implements StudentService{
	@Autowired
	StudentDaoImpl student;
	@Override
	public List<Student> getAllStudent() {
		List list=student.getAllStudent();
		return list;
	}
	public boolean deleteStudent(int id) {
	boolean b=student.deleteStudent(id);
	
		if(b==true){
		return true;
		}
		else {
			return false;
		}
	}

}
