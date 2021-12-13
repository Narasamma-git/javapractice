package com.testyantra.fsproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.testyantra.fsproject.dao.StudentRepository;
import com.testyantra.fsproject.dto.Student;

import antlr.collections.List;

@Service
public class StudentService {
	@Autowired
	StudentRepository srepo;

	public Student registerStudent(Student student) {
		srepo.save(student);
		
		return student;
	}

public Iterable<Student> registerStudents(Iterable<Student> students){
	return srepo.saveAll(students);
}

public Student getStudentByid(int id) {
	return srepo.findById(id).orElse(null);
}
	public Iterable<Student> getAllStudents(){
		return srepo.findAll();
	}
	
	
public String deleteStudent(int id) {
	srepo.deleteById(id);
	return "student record removed!!";
}	



public String deleteAllStudent() {
	srepo.deleteAll();
	return "all records deleted";
}
	public Student updatestudent(Student student,int id) {
		Student existingStudent=srepo.findById(student.getId()).orElse(null);
		
		existingStudent.setName(student.getName());
		existingStudent.setUsername(student.getUsername());
		existingStudent.setPassword(student.getPassword());
		return srepo.save(existingStudent);

		
	}
	

}
