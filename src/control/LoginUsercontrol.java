package control;

import view.LoginUser;
import view.ProductView;



// hi bilal
public class LoginUsercontrol {
	private LoginUser myLoginUser = new LoginUser(); // used to show login user
	private static ProductView myProductView = new ProductView();												// menu

	public void loginUserController() {

		boolean Luser = true;
		while (Luser) {
			int choice = myLoginUser.loginCostumerChoice();

			switch (choice) {
			case 1:
				myProductView.showProductList();
				
				break;
			case 2:
				System.out.println("Here is your booking");
				break;
			case 3:
				System.out.println("Your booking has been deleted");
				break;
			case 4:
				System.out.println("Look all bikes");
				break;
			case 5:
				Luser = false;
				break;
			default:
				System.out.println("You have put an invalid choice");

			}// switch

		} // While
	} // AdminController
}
