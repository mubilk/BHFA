package control;

import model.Customer;
import view.CustomerView;
import view.LoginView;

public class CustomerController {

	   private Customer myCustomer = new Customer();
	   private LoginView welcome = new LoginView();
	   private CustomerView myView = new CustomerView();
		
	   public CustomerController(Customer myCustomer, CustomerView myView){
			this.myCustomer = myCustomer;
			this.myView = myView;
		}
		
		public void createCustomer(){
			myCustomer = myView.getCustomerDetails();
		}
		
		public void print(){
			myView.printCustomerDetails(myCustomer);
		}
			
	}
