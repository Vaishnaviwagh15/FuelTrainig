package com.example.demoweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class studentDetails{

	private student stud;
	@Autowired
	public studentDetails(student stud) {
		this.stud=stud;
	}

	void setdata() {
		stud.setId(200);
		stud.setName("xyz");
}
	void shodata() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());

	}
}