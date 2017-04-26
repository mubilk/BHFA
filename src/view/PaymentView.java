package view;

import java.util.Scanner;
import model.CreditCard;

public class PaymentView {

public PaymentView(){
			}
public CreditCard getCreditCardDetails(){
	

CreditCard CC = new CreditCard();
Scanner input = new Scanner(System.in);
String details;


boolean correct = false;

correct = false;
while (!correct) {
System.out.print("Enter your card number(16 digits: xxxx xxxx xxxx xxxx): ");
details = input.nextLine();
if (details.matches("^(\\d{4} ?\\d{4} ?\\d{4} ?\\d{4})")) {
    CC.setCardNumber(details);
correct = true;
}
else 
System.out.println("you have entered wrong credit card number");
}


correct = false;
while (!correct) {
System.out.print("Enter your expiry month and year(4 digits: xx/xx): ");
details = input.nextLine();
if (details.matches("^(\\d{2}+/+\\d{2})$")) {
    CC.setExpiryEnd(details);
correct = true;
}
else 
System.out.println("you have entered wrong expiry date");
}


correct = false;
while (!correct) {
System.out.print("Enter your cvc(3 digits: xxx): ");
details = input.nextLine();
if (details.matches("[0-9]+") && details.length()==3) {
    CC.setCvc(details);
correct = true;
}
else 
System.out.println("you have entered wrong cvc");
}

return CC;
		}
	}
