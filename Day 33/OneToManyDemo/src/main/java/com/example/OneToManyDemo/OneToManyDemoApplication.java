package com.example.OneToManyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class OneToManyDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(OneToManyDemoApplication.class, args);
		CartRepository cart;
		cart = context.getBean(CartRepository.class);
		
		ItemsRepository items;
		items= context.getBean(ItemsRepository.class);
		
//		Cart r1 = new Cart(1,"Mouse");
//		cart.save(r1);
//		
	
		
	}

}
