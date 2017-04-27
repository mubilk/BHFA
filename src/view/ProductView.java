package view;

import java.util.ArrayList;

import model.Product;
import model.ProductDatabase;
import view.CartView;

public class ProductView {

	public void showProductList() {
		ProductDatabase Pd = new ProductDatabase();
		CartView cv = new CartView();
		
		ArrayList <Product> AllProducts = Pd.getProductList();
		
		for (Product product1 : AllProducts) 
		{
			System.out.println(product1);
		
		}
		
		cv.selectingBikes();
		cv.printBasket();
		
		
		
	}

}
