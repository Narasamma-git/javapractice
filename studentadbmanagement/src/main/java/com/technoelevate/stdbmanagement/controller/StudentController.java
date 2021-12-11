package com.technoelevate.stdbmanagement.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.stdbmanagement.dto.Student;
import com.technoelevate.stdbmanagement.service.StudentServiceImpl;
@Controller
public class StudentController {
	@Autowired
	StudentServiceImpl service;
	
	@GetMapping("/register")
	public String getLogin(ModelMap map) {
		return "register";
	}
	
//	@GetMapping("/fetchallstudents")
//		public String fetchAllStudents() {
//		
//		return "redirect:/fetch";
//		
//	}
//
	
	@GetMapping("/getallstudent")
	public String getAllStudent(ModelMap map,Student student) {
		map.addAttribute("mystudentdetails",service.getAllStudent());
		return "getallstudents";
	}
	
	@PostMapping("/deletestudent")
	public String delete(ModelMap map,Student std) {
		boolean bb=service.deleteStudent(std.getId());
		map.addAttribute("msg","deleted from database successfully");
		if(bb==true) {
			return true;
		}
		return null;
	}
	
}
