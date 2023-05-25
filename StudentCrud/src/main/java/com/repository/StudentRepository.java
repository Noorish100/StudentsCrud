package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {

	 void deleteById(Integer id) ;
		// TODO Auto-generated method stub
		
	
}
