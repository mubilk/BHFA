package control;

	import model.Customer;
	import model.ProductDatabase;
	import view.CustomerView;
	import view.LoginView;
	import view.WelcomeView;

   

	public class WebShopping {

		
			private static Customer myCustomer = new Customer();
			private static WelcomeView welcome = new WelcomeView();
			private static CustomerView myView = new CustomerView();
			private static LoginView logIn = new LoginView();
			private static AdminControl myAdminControl = new AdminControl();
			private static LoginUsercontrol loginCustomer = new LoginUsercontrol();
			
			public static void main(String[] args) {
		        System.out.println("**");
				boolean shopping = true;
				while (shopping)  {
					int choice = welcome.menuChoice();
					
					switch (choice){
					case 1: myCustomer = myView.getCustomerDetails();
					        break;
					        
					case 2:	if (logIn.login())
						    System.out.println(" Existing customer - Login ");
					//		if (myCustomer.getrole() == admin)				Function has to be bade
					//			myAdminControl.AdminController();
					//		else
					//			loginCustomer.loginUserController();
					break;
				//	case 3: myAdminControl.AdminController();
				//	break;
				//	case 4: loginCustomer.loginUserController();
				//	break;
					case 3: shopping = false;
					break;
					default : System.out.println("You have put an invalid choice");
					

					}//switch
				}//while 

			}//main method

			

		}//class

