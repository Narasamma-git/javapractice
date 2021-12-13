package com.testyantra.fsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.fsproject.dto.Student;
import com.testyantra.fsproject.service.StudentService;

@RestController 
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping ("/addstudent")
@CrossOrigin
	public String addStudent(@RequestBody Student student ) {
		service.registerStudent(student);
		return " "+student.getName()+"->added successfully";
	}
	
	@PostMapping("/addstudents")
	@CrossOrigin
	public Iterable<Student> addStudents(Iterable<Student> students){

		
		return service.registerStudents(students);
	}
	
	@GetMapping("/getstudent/{id}")
	@CrossOrigin
public Student getStudent(@PathVariable("id") int id) {
	return service.getStudentByid(id);
}	
	
@GetMapping("/getallstudents")	
@CrossOrigin
public Iterable<Student> getAllStudents(){
	return service.getAllStudents();
}
	
	@DeleteMapping("/deletestudent/{id}")
	@CrossOrigin
	public String deleteStudent(@PathVariable("id") int id) {
		return service.deleteStudent(id);
	}
	
	
	@DeleteMapping("/deleteallstudents")
	@CrossOrigin
	public String deletestudents() {
		return service.deleteAllStudent();
		}
	@PutMapping("/update/{id}")
	@CrossOrigin
public Student updateStudent(@RequestBody Student student,@PathVariable("id") int id) {
		return service.updatestudent(student, id);
	
}	
	
	
	
}
