package model;

public class CreditCard {

private String cardNumber, expiryEnd, cvc;

public CreditCard(){
	
}

public CreditCard(String caNu, String exEnd, String cv){
		cardNumber = caNu;
		expiryEnd = exEnd;
		cvc = cv;
}


public String getCardNumber() {
	return cardNumber;
}


public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}


public String getExpiryEnd() {
	return expiryEnd;
}


public void setExpiryEnd(String expiryEnd) {
	this.expiryEnd = expiryEnd;
}


public String getCvc() {
	return cvc;
}


public void setCvc(String cvc) {
	this.cvc = cvc;
	}	

}
