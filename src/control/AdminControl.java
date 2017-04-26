package control;
//TEMP CHANGE
import view.AdminView;
import view.ProductView;

public class AdminControl {

	   private AdminView myAdminView = new AdminView(); // used to show Admin menu
	   private static ProductView myProductView = new ProductView();
	   
	   public void AdminController(){
		   
		   boolean admin = true;
			while (admin)  {
		        int choise = myAdminView.AdminChoice();
		        System.out.println(choise); // has to be delete
		        
		        //TODO: Print muligheder
		        
		        switch (choise){
				  case 1: myAdminView.AdminCustomerView();
				  break;
				  case 2: System.out.println("Customer delete");
				  break;
				  case 3:System.out.println("Bike list");
				  myProductView.showProductList();
				  break;
				  case 4: System.out.println("A bike has been added");
				  break;
				  case 5: System.out.println("Here is the bookings");
				  break;
				  case 6: admin = false;
				  break;
				  default : System.out.println("You have put an invalid choice");

				  //NEW LINE
				}//switch
		        
			} // While
		} // AdminController
	
} // End Class
