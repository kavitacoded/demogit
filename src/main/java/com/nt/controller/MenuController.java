package com.nt.controller;

import org.hibernate.annotations.DynamicInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Menu;
import com.nt.service.IMenuService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/menu")
@DynamicInsert
public class MenuController {

	@Autowired
	private IMenuService menuService;

	@PostMapping("/add")
	public ResponseEntity<String> addMenu(@RequestBody Menu menu) {
		try {
			Long id = menuService.addMenu(menu);
			return new ResponseEntity<String>("Menu is Added " + id, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Menu is not added !");
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}//catch
	}//add
	
	
	//TODO :
	
	
}//class
