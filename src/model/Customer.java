package model;

import data.ReadandWrite;

public class Customer {

private String firstName, surname, phoneNumber, email, username, password;

public Customer(){
	
}


public Customer(String fname, String sname, String phnu, String crca, String ema){
   firstName = fname;
   surname = sname;
   phoneNumber = phnu;
   email = ema;

   
}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}


public String getPhonenumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}



public void generateUsername() {
	this.username = firstName.substring(0, 3)+surname.substring(0, 3);
	this.password = surname.substring(0, 3) + phoneNumber.substring(2, 5);
}


public String toString(){
	return (firstName+ " " + surname + " " + phoneNumber +" " + " "+ email); //Denne metode printer kundeoplysninger 
}


public void writetoFile(){
	String details = surname+ ";" + firstName + ";" + getUsername() + ";" + getPassword() + ";" + phoneNumber +";"+ email+ ";";
	ReadandWrite.WriteDetails("customer.txt", details);
	 
}

}
