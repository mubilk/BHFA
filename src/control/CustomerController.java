package control;

import java.util.ArrayList;

import data.ReadandWrite;
import model.Customer;
import view.CustomerView;
import view.LoginView;

public class CustomerController {
	   private ArrayList<Customer>customerDetails;
	   private Customer myCustomer = new Customer();
	   private LoginView welcome = new LoginView();
	   private CustomerView myView = new CustomerView();
		
	   public CustomerController(Customer myCustomer, CustomerView myView){
			this.myCustomer = myCustomer;
			this.myView = myView;
		}
		
		public CustomerController() {
		// TODO Auto-generated constructor stub
	}

		public void createCustomer(){
			myCustomer = myView.getCustomerDetails();
		}
		
		public void print(){
			myView.printCustomerDetails(myCustomer);
		}
		
		public void GetCustomer(int thiscustomer){  // getting a specificic customer from the customer.txt file
			customerDetails = ReadandWrite.getAllCustomerDetails();
			myView.printCustomerDetails(customerDetails.get(thiscustomer));
		}
			
	}
