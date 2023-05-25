package com.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Students {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    
    private String name;
    
    private Integer age;
    
    private Integer marks;
    
    private String status;

}
