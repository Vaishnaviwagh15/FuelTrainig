package com.example.OneToManyDemo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Items {
	int item_id;
	String item_dese;
	int item_cost;
	
	@ManyToOne
	@JoinColumn(name= "cart_id")
	private Cart cartobj;
	
	public Items() {
		
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_dese() {
		return item_dese;
	}

	public void setItem_dese(String item_dese) {
		this.item_dese = item_dese;
	}

	public int getItem_cost() {
		return item_cost;
	}

	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}

	public Cart getCartobj() {
		return cartobj;
	}

	public void setCartobj(Cart cartobj) {
		this.cartobj = cartobj;
	}

	public Items(int item_id, String item_dese, int item_cost, Cart cartobj) {
		super();
		this.item_id = item_id;
		this.item_dese = item_dese;
		this.item_cost = item_cost;
		this.cartobj = cartobj;
	}
	


}
