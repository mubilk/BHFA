package view;

import java.util.ArrayList;

import model.Product;
import model.ProductDatabase;
import view.LoginUser;
import control.LoginUsercontrol;

public class ProductView {

	public void showProductList() {
		ProductDatabase Pd = new ProductDatabase();
		
		ArrayList <Product> AllProducts = Pd.getProductList();
		
		for (Product product1 : AllProducts) 
		{
			System.out.println(product1);
		}
	}

}
