package data;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bike;
import model.ElectricBike;
import model.Customer;
import model.Product;
import model.Admin;
import java.io.*;

public class ReadandWrite {

	public static Scanner readDetails(String file) {
		Scanner input = new Scanner(System.in);

		try {
			File ReadFile = new java.io.File(file);

			input = new Scanner(ReadFile);

			// Close the file

		} catch (FileNotFoundException ex) {
			System.out.println("Error reading the file'" + file + "'");
		}
		return input;
	}// readDetails

	public static Customer getCustomer(String line) {
		Customer customerFromFile = new Customer();
		// Look for every ";" and turns the values into strings
		String[] values = line.split(";");

		// Change the String type into the correct format
		customerFromFile.setSurname(values[0]);
		customerFromFile.setFirstName(values[1]);
		customerFromFile.setUsername(values[2]);
		customerFromFile.setPassword(values[3]);
		customerFromFile.setPhoneNumber(values[4]);
		customerFromFile.setEmail(values[5]);

		return customerFromFile;

	}

	/*
	 * public static Admin getAdmin(String line){ Admin adminFromFile = new
	 * Admin(); // Look for every ";" and turns the values into strings String[]
	 * values = line.split(";");
	 * 
	 * // Change the String type into the correct format
	 * adminFromFile.setAdminUsername(values[0]);
	 * adminFromFile.setAdminPassword(values[1]);
	 * 
	 * return adminFromFile;
	 * 
	 * }
	 */

	public static Product getProduct(String line) {

		String[] values = line.split(";");
		if (values[1].equals("Bike")) {
			int productID = Integer.parseInt(values[0]);
			int gear = Integer.parseInt(values[3]);
			double price = Double.parseDouble(values[4]);
			Bike BikeFromFile = new Bike(productID, values[1], values[2], gear, price);

			return BikeFromFile;

		}

		// need to get this explained
		else {
			ElectricBike ElectricBikeFromFile = new ElectricBike(Integer.parseInt(values[0]), values[1], values[2],
					Integer.parseInt(values[3]), Double.parseDouble(values[4]));

			return ElectricBikeFromFile;
		}

	}

	/*
	 * public static ArrayList<Admin> getAllAdminDetails(){ ArrayList<Admin>
	 * adminList = new ArrayList<Admin>(); Scanner input =
	 * readDetails("admin.txt");
	 * 
	 * // checking each line while (input.hasNextLine()) {
	 * adminList.add(getAdmin(input.nextLine())); //passing each line to the
	 * method getCustomer which returns a customer } //then added to a ArrayList
	 * 
	 * 
	 * return adminList; }
	 */

	public static ArrayList<Customer> getAllCustomerDetails() {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Scanner input = readDetails("customer.txt");

		// checking each line
		while (input.hasNextLine()) {
			customerList.add(getCustomer(input.nextLine()));
			// passing each line to the method getCustomer which returns a
			// customer
		} // then added to a ArrayList

		return customerList;
	}

	public static ArrayList<Product> getAllProductDetails() {
		ArrayList<Product> productList = new ArrayList<Product>();
		Scanner input = readDetails("product.txt");

		// checking each line
		while (input.hasNextLine()) {
			String currentLine = input.nextLine();

			if (!currentLine.equals(""))
				productList.add(getProduct(currentLine));// passing each line
															// to the method
															// getProduct which
															// returns a product
		} // then added to a ArrayList

		return productList;
	}

	public static void WriteDetails(String file, String input) {
		try {
			FileWriter fwriter = new FileWriter(file, true);
			PrintWriter output = new java.io.PrintWriter(fwriter);
			// Write formatted output to the file
			output.println(input);
			output.close();
		} catch (IOException ex) {
			// if the file is not accessible, print this message
			System.out.println("Error writing to file '" + file + "'");
		}
	}// WriteDetails

}