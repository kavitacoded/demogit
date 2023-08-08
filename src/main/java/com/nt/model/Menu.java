package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Menu {
	//JPA annotations
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Double price; 
	
}
