package model;

import model.Product;

public class Cart extends Product {
	
	private int quantity;

	
	//getters and setters
	public Cart(int id, int quantity) {
		setId(id);
	
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString(){
		return (" ID " + this.getId() + " Quantity " + this.getQuantity());
	}	
}
