package view;

import java.util.Scanner;

public class LoginUser {

	public LoginUser() {

	} // LoginUser

	public int loginCostumerChoice() {
		Scanner input = new Scanner(System.in);

		System.out.println("Hi - You've Successfully LoggedIn?");
		System.out.println("-----------------------");
		System.out.println("|1| Browse the Bike Catalogue ");
		System.out.println("|2| View My Account Details");
		System.out.println("|3| Quit");
		System.out.println("-----------------------");

		int answer = input.nextInt();

		return answer;
	}// loginCostumerChoice

}
