package services;

import java.util.*;
import entity.Contact;
import java.util.Scanner;
import interfaces.IContact;

public class ContactImp implements IContact {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> list = new ArrayList<Contact>();
	Contact contacts = new Contact();

	public void createContact() {
		Contact contacts = new Contact();

		System.out.println("First Name");
		String firstName = sc.next();

		System.out.println("Last Name");
		String lastName = sc.next();

		System.out.println("Email Id");
		String emailId = sc.next();

		System.out.println("Phone Number");
		long phoneNumber = sc.nextInt();

		System.out.println("State");
		String state = sc.next();

		System.out.println("City");
		String city = sc.next();

		System.out.println("Zip");
		long zip = sc.nextInt();

		System.out.println("Contact Created");
		
		System.out.println("FirstName:" + firstName + " " + "LastName:" + lastName + " " + "Email:" + emailId + " "
				+ "PhoneNumber:" + phoneNumber + " " + "State:" + state + " " + "City:" + city + "  " + "Zip" + zip);
	}
}
