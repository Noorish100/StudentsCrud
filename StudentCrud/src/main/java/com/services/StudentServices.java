package com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Students;


public interface StudentServices {
	
	List<Students> getAllStudents();
	
	Students addStudent(Students student);
	
	String updateStudent(Integer id);
	
	String deleteStudent(Integer id);
	

}
