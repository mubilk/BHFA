	// Java Bikes
	package model;

	import model.Product;
import data.ReadandWrite;

		public class ElectricBike extends Product{ 
			private String colour;
			private int hp; // horsepower
			
			
		public ElectricBike(){
		}

			
		public ElectricBike(int productId, String productName, String colour, int hp, double price) {
			super(productId, productName, price);
			this.colour = colour;
			this.hp = hp;
		}


		public String getColour() {
			return colour;
		}


		public void setColour(String colour) {
			this.colour = colour;
		}


		public int getHp() {
			return hp;
		}


		public void setHp(int hp) {
			this.hp = hp;
		}
		

		@Override
		public String toString() {
			return getProductName()+ " [colour=" + colour + ", hp=" + hp + ", id=" +getProductId() 
			+ ", price=" + getPrice() + ", stock=" + "]";
		}								
		
		public void writetoFile() {
			String details = getProductId() + ";" + getProductName() + ";" + colour + ";" + hp + ";" + getPrice() +";";
			ReadandWrite.WriteDetails("product.txt", details);
				
		}
		}