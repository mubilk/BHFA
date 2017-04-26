	package model;

	import java.util.ArrayList;

	import data.ReadandWrite;

	public class ProductDatabase {

	
	ArrayList<Product> database;

	public ProductDatabase(){
		database = ReadandWrite.getAllProductDetails();
		}

	public ArrayList<Product> getProductList() {
		
		return database;
	}
		

	}


