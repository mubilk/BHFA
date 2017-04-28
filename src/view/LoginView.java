	// Java Bikes
	package view;

	import java.util.ArrayList;
import java.util.Scanner;

import control.Logedinuservar;
import control.LoginUsercontrol;
import model.Customer;
import data.ReadandWrite;
	import control.Logedinuservar;
	public class LoginView {
		public String logedinuser;		
		private ArrayList<Customer>customerDetails;
			
			
		public LoginView(){
				customerDetails = ReadandWrite.getAllCustomerDetails();
			}
		
		public void Reload()
		{
			customerDetails = ReadandWrite.getAllCustomerDetails();
		}
			
			
		public boolean login(){
			
			LoginUsercontrol LC = new LoginUsercontrol();
			
			
			String password = "";
			String username = "";
			

			Scanner input = new Scanner(System.in);
			
			
			int numbersOfTries = 3;  //The number of tries to log-in.
			int counterTries = 0;  //The counter for the loop
			boolean loggedIn = false;  //Sentinel value - breaks the loop
			
			
			do{
				
				counterTries++;
				
				System.out.println("Type in your username: "); 
				username = input.nextLine();
				
				
				System.out.println("Type in your password: "); 
				password = input.nextLine();
						
				
				//boolean userFound = false;


				for(int i = 0; i < customerDetails.size() && !loggedIn; i++){
					//
					if(username.equalsIgnoreCase(customerDetails.get(i).getUsername()) && 
							password.equalsIgnoreCase(customerDetails.get(i).getPassword())){
						System.out.println("you are logged in");
						
						LC.loginUserController();
						loggedIn = true;
						// Logedinuservar.logedinusername = customerDetails.get(i).getUsername() ;
						
						
					}
					int p =i; // use p in order not to tickel with counter in for loop 
					p++;
					Logedinuservar.setLogedinusername(p);	
				}
				
				if(!loggedIn){
					System.out.println("try again");
				}
				
			}while(counterTries < numbersOfTries && !loggedIn);
			
			return loggedIn;	
		}
		
		}
