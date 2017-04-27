package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.ProductDatabase;
import model.Cart;
import view.ProductView;

public class CartView {
	
		ProductDatabase db = new ProductDatabase();

		public ArrayList<Cart> basket;

		public void selectingBikes(){
			// Selection of products by customer and placing them to basket
			Scanner input = new Scanner (System.in);
			db.getProductList();
			boolean shopping = false;
			int productSelect;
			int quantitySelect;

			while (!shopping) {
				System.out.println("\n=====================================");
				System.out.print("\n Please enter the ID of the bike you want to rent: ");
				System.out.println("=====================================");

				productSelect = input.nextInt();

				if (db.isProduct(productSelect)) {
					db.printProduct(productSelect);

					System.out.println("=====================================");
					System.out.print("\n Please enter the amount of of bikes of this model: ");
					System.out.println("=====================================");

					quantitySelect = input.nextInt();
					insertInBasket(productSelect, quantitySelect); //TODO

					System.out.println("\n Would you like to continue shopping? Press 1 to continue and 2 for exiting ");
					int continueShopping = input.nextInt();
					switch (continueShopping) {
					case 1:
						db.getProductList();
						break;
					case 2:
						shopping = true;
						break;

					}
				} else
					System.out.print("Product was not found");

			}
		}

		public CartView(){
			this.basket = new ArrayList<Cart>();
		}

		public void insertInBasket(int id, int quantity) {
			this.basket.add(new Cart(id,quantity));
		}

		public void printBasket() {
			System.out.println("=====================================");
			System.out.println("\n Products in your Shopping Basket : ");
			System.out.println("=====================================\n");
			for(int i=0; i < basket.size(); i++) { 

				if (this.basket.get(i).getProductId() > 100 && this.basket.get(i).getProductId()<200) 
					System.out.print("Ebikes in your shopping basket\n");
				else if (this.basket.get(i).getProductId() > 200 &&  this.basket.get(i).getProductId()<300)
					System.out.print("Normal bikes in your shopping basket \n");
				else
					System.out.print("Bike offers in your shopping basket \n");

				System.out.println("\t ID: " + this.basket.get(i).getProductId() +"\t Quantity:  " +
						this.basket.get(i).getQuantity() + "\n");
//				System.out.println("=====================================");
//				System.out.println("The total sum of your orders is " this.basket.get(i).getPrice()*this.basket.get(i).getQuantity()  );
			}

		}


	}

