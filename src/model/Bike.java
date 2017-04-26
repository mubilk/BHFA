	// Java Bikes
	package model;

	import model.Product;
import data.ReadandWrite;

		public class Bike extends Product{ 
			private String colour;
			private int gear;
			
			
		public Bike(){
			
		}

			
		public Bike(int productId, String productName, String colour, int gear, double price) {
			super(productId, productName, price);
			this.colour = colour;
			this.gear = gear;
		}


		public String getColour() {
			return colour;
		}


		public void setColour(String colour) {
			this.colour = colour;
		}


		public int getGear() {
			return gear;
		}


		public void setGear(int gear) {
			this.gear = gear;
		}
		
		

		@Override
		public String toString() {
			return getProductName() + " [colour=" + colour + ", gear=" + gear + ", id=" + getProductId()
			+ ", price=" + getPrice() + ", stock=" +"]";
		}


		
		public void writetoFile() {
			String details = getProductId() + ";" + getProductName() + ";" + colour + ";" + gear + ";" + getPrice() +";";
			ReadandWrite.WriteDetails("product.txt", details);
			
		}			
				
	}