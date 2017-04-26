package view;
//Bilal Here
import java.util.ArrayList;
import java.util.Scanner;

import model.Bike;
import model.Customer;
import model.ElectricBike;
import data.ReadandWrite;

public class AdminView {
	private ArrayList<Customer>customerDetails;
	
	public AdminView(){
		
	}
	
	public int AdminChoice(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi Admin  - What do you want to do?");
		System.out.println("-----------------------");
		System.out.println("|1| View customer list ");
		System.out.println("|2| delete a customer ");
		System.out.println("|3| View bikes");
		System.out.println("|4| add a bike ");
		System.out.println("|5| View bookings ");
		System.out.println("|6| Quit");
		System.out.println("-----------------------");
		
		int answer = input.nextInt();

	   return answer;
	}// AdminChoice	
	
	public void AdminCustomerView(){
		customerDetails = ReadandWrite.getAllCustomerDetails();
		for(int i = 0; i < customerDetails.size(); i++){
			System.out.println(customerDetails.get(i));
			
			} // for
					
	} // AdminCustomerView
	
    public void AdminCustomerdelete(){
		
	} // AdminCustomerdelete

    public void AdminBikeView(){
	
    } // AdminbikeView
	
    public Bike AdminAddBikeView(){		
    	
    	
    			Scanner input = new Scanner(System.in);
    			input = new Scanner(System.in);
    			String details;
    			Bike b = new Bike();
    			
    			
    			boolean correct = false;
    			while (!correct) {
    			System.out.print("type the product id : ");
    			details = input.nextLine();
    			
    			
    			if (details.matches("[0-9]+")) { 
        		int productId = Integer.parseInt(details);

    			b.setProductId(productId);  
    			correct = true;
    				}
    			}
    			
    			
    			correct = false;
    			while (!correct) {
    			System.out.print("Enter your product name: ");
    			details = input.nextLine();
    			if (details.length() > 0) {
    			b.setName(details);			
    			correct = true;
    			}
    			}
    			
    			correct = false;
    			while (!correct) {
    			System.out.println("Enter your product colour:");
    			details = input.nextLine();
    			if ((details.length() > 0)) {
    			    b.setColour(details);
    			correct = true;
    			}
    		
    			
    			correct = false;
    			while (!correct) {
    			System.out.println("Enter the gear of the product :");
    			details = input.nextLine();
    			if (details.matches("[0-9]+")) {
        			int gear = Integer.parseInt(details);
    			    b.setGear(gear); 
    			correct = true;
    			}
    			
    			
    			correct = false;
    			while (!correct) {
    			System.out.println("Enter product price :");
    			details = input.nextLine();
    			if (details.matches("[0-9]+")) {
        			Double price = Double.parseDouble(details);
    			    b.setPrice(price); // 
    			correct = true;
    			}
    			
    			
    			b.writetoFile();
    							
    					}
    				}
    			}
				return b;
    			}
    
    
		  public ElectricBike AdminAddElectricBikeView(){		
		  

  			Scanner input = new Scanner(System.in);
  			input = new Scanner(System.in);
  			String details;
  			ElectricBike eb = new ElectricBike();
  			
  			
  			boolean correct = false;
			while (!correct) {
			System.out.print("type the product id : ");
			details = input.nextLine();
			
			
			if (details.matches("[0-9]+")) { 
    		int productId = Integer.parseInt(details);

			eb.setProductId(productId);  
			correct = true;
				}
			}
			
			
			correct = false;
			while (!correct) {
			System.out.print("Enter your product name: ");
			details = input.nextLine();
			if (details.length() > 0) {
			eb.setName(details);			
			correct = true;
			}
			}
			
			correct = false;
			while (!correct) {
			System.out.println("Enter your product colour:");
			details = input.nextLine();
			if ((details.length() > 0)) {
			    eb.setColour(details);
			correct = true;
			}
		
			
			correct = false;
			while (!correct) {
			System.out.println("Enter the hp of the product :");
			details = input.nextLine();
			if (details.matches("[0-9]+")) {
    			int hp = Integer.parseInt(details);
			    eb.setHp(hp); 
			correct = true;
			}
			
			
			correct = false;
			while (!correct) {
			System.out.println("Enter product price :");
			details = input.nextLine();
			if (details.matches("[0-9]+")) {
    			Double price = Double.parseDouble(details);
			    eb.setPrice(price); // 
			correct = true;
			}
			
			
			eb.writetoFile();
							
					}
				}
			}
			return eb;
			}
  			
	
     // AdminAddBikeView
 	
    public void AdminBookingView(){
	
    } // AdminBookingView

}//class AdminView
