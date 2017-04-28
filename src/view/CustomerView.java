	// Java Bikes
	package view;


	import java.util.Scanner;

	import model.CreditCard;

	import model.Customer;
	
	public class CustomerView {

	private Scanner input;

	Customer RC = new Customer();
	public CustomerView(){
			
		}
		  
			
	public  Customer getCustomerDetails(){
			input = new Scanner(System.in);
			String details;
			
			LoginView LV = new LoginView();

			
			boolean correct = false;
			while (!correct) {
			System.out.print("Enter your first name: ");
			details = input.nextLine();
			
			if (details.length() > 0) {
			RC.setFirstName(details);
			correct = true;
			}
			}
			
			
			correct = false;
			while (!correct) {
			System.out.print("Enter your surname: ");
			details = input.nextLine();
			if (details.length() > 0) {
			RC.setSurname(details);			
			correct = true;
			}
			}
			
			correct = false;
			while (!correct) {
			System.out.println("Enter your Phone Number (8 digits):");
			details = input.nextLine();
			if (details.matches("[0-9]+") && details.length()==8) {
			    RC.setPhoneNumber(details);
			correct = true;
			}
			else
			System.out.println("Invalid number");
			}
			
			
			correct = false;
			while (!correct) {
			System.out.println("Enter your email :");
			details = input.nextLine();
			if (details.matches("[a-zA-Z_0-9._%+-]+@+[a-zA-Z_0-9._%+-]+.+[a-zA-Z]")) {
			    RC.setEmail(details);
			correct = true;
			}
			else
			System.out.println("Invalid email");
			}
			
			RC.generateUsername();
			RC.writetoFile();
			
			System.out.println(" Dear Customer"); 
			System.out.println(" You have now succesfully created a account in CPH Java Bike Sharing"); 
			System.out.println(" Your Username and Password is displayed below: ");
			System.out.println("Username: " + RC.getUsername() + "and you password" + RC.getPassword());
		//	printCustomerDetails(RC);
			LV.Reload();
			LV.login();
			
			return RC;
				
			}

	
			public void printCustomerDetails(Customer RC) {
				
				System.out.println(RC.toString());
			}


			public void getCustomerViewDetails() {
				
				
			}
		}
