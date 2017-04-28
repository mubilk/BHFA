package control;

import model.Customer;
import view.LoginUser;
import view.ProductView;
import view.CustomerView;
import control.CustomerController;

// hi bilal
public class LoginUsercontrol {
	private LoginUser myLoginUser = new LoginUser(); // used to show login user
	private static ProductView myProductView = new ProductView();												// menu
	private CustomerView myCustomerView = new CustomerView();
	private CustomerController myCustomerController = new CustomerController(); 
	public void loginUserController() {

		boolean Luser = true;
		while (Luser) {
			int choice = myLoginUser.loginCostumerChoice();

			switch (choice) {
			case 1:
				myProductView.showProductList();
				
				
				break;
			case 2:
				System.out.println("Here is your account details");
			 //  myCustomerView.printCustomerDetails(LoginUser);
			//	
			//	myCustomerController.print();
				
				myCustomerController.GetCustomer(Logedinuservar.logedinusername);
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
	} // loginUserController
}
