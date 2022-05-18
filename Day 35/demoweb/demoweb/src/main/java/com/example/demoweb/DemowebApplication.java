package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemowebApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = SpringApplication.run(DemowebApplication.class, args);
		studentDetails st;
		
		st=context.getBean(studentDetails.class);
		st.setdata();
		st.shodata();
		
	}

}
