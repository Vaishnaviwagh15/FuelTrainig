package com.example.demoWeb2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	 
	@Autowired
	StudentRepository stud;
	
	@GetMapping("/students")
	public List<student> getAllStudents(){
	return stud.findAll();
		
	}
}
67uujn 