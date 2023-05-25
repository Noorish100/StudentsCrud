package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Students;
import com.repository.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	private StudentRepository studentRepository; 
	
	
	@Override
	public List<Students> getAllStudents() {
		List<Students> studentList = studentRepository.findAll();
	
		return studentList;
	}

	@Override
	public Students addStudent(Students student) {
		Students addedStudent = studentRepository.save(student);
		return addedStudent;
	}

	
	@Override
	public String updateStudent(Integer id) {
		Optional<Students> studentbyId = studentRepository.findById(id);
		if(studentbyId.isPresent()) {
			Students s=studentbyId.get();
			s.setMarks(s.getMarks()+20);
			studentRepository.save(s);
			return "student with id "+id+" has been updated";
		}
		
		return "no student found with id "+id;
	}

	@Override
	public String deleteStudent(Integer id) {
		
		Optional<Students> delStudent = studentRepository.findById(id);
		if(delStudent.isPresent()) {
			studentRepository.delete(delStudent.get());
			return "student deleted";
		}
		
		return "no student found with the given id";
	}

}
