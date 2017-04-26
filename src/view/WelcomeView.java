	// Java Bikes
	
	package view;

	import java.util.Scanner;

	public class WelcomeView {
			
		public WelcomeView(){
			
			}
			
			public int menuChoice(){
				Scanner input = new Scanner(System.in);
				System.out.println("------------------------------------------");
				System.out.println("   WELCOME TO CPH JAVA BIKES SHARING!   ");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("What do you want to do? Press the respective number.");
				System.out.println("");
				System.out.println("-----------------------");
				System.out.println("|1| Register as a New Customer ");
				System.out.println("|2| Log In ");
				System.out.println("|3| Admin Log In");
				System.out.println("|4| Quit");
				System.out.println("-----------------------");
				
				int answer = input.nextInt();
			
			   return answer;
			}//method menuChoice	
			
		}//class WelcomeView


