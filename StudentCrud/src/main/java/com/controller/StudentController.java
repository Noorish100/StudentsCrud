package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Students;
import com.services.StudentServices;

@RestController
@RequestMapping("Student/")
public class StudentController {

	@Autowired
	private StudentServices studentServices;
	
	@PostMapping("add")
	public Students addStudents(@RequestBody Students students) {
		
		Students addStudent = studentServices.addStudent(students);
		
		return addStudent;
	}
	
	
	@GetMapping("list")
   public List<Students> getStudents() {
		
		List<Students> allStudents = studentServices.getAllStudents();
		
		return allStudents;
	}
	
	@PutMapping("updating")
	 public String updateStudent(@RequestParam("id") Integer id) {
			
			 String updateStudent = studentServices.updateStudent(id);
			
			return updateStudent;
		}
	 
	 @DeleteMapping("del")
	 public String deleteStudent(@RequestParam("id") Integer id ) {
			
		 String delStudent = studentServices.deleteStudent(id);
		
		return delStudent;
	}
	
	
	
	
}
