	package model;

	import java.util.ArrayList;

import model.Product;
import data.ReadandWrite;

	public class ProductDatabase {

    public ArrayList <Product> bike = new ArrayList<Product>();	
	ArrayList<Product> database;

	public ProductDatabase(){
		database = ReadandWrite.getAllProductDetails();
		}

	public ArrayList<Product> getProductList() {
		
		return database;
	}
	

		
	public boolean isProduct(int product) {
		
		for(int i=0; i < this.bike.size(); i++) { 	
			if (product == this.bike.get(i).getId())
				return true;
		}
		return false;
	}
	
	public void findBike(int i) {
		System.out.println("You have chosen the following product: "  );		
		System.out.println(this.bike.get(i).getProductName() +"\t ID: " + this.bike.get(i).getId() +"\t Price:  " +
				this.bike.get(i).getPrice() +  "\t Stock:  "); //+	this.bike.get(i).getStockAvailable() ); 
	}

	
	public void printProduct(int id) {

		for(int i=0; i < this.bike.size(); i++) { 	
			if (id == this.bike.get(i).getId()) {
				findBike(i);
				return;
			}
		}
	}}

