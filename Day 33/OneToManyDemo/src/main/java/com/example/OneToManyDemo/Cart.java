package com.example.OneToManyDemo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int cart_id;
	private String Uname;

	@OneToMany(mappedBy = "cartobj")
	private Set<Items> items;

	public Cart() {

	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public Cart(int cart_id, String uname, Set<Items> items) {
		super();
		this.cart_id = cart_id;
		Uname = uname;
		this.items = items;
	}
	
	

	 

	
	
	

}
