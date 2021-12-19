package common;

import java.util.*;
import java.util.Scanner;
import entity.Contact;
import interfaces.IContact;
import services.ContactImp;

import java.util.Scanner;
public class AddressBookManagementSystemMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook Management System");
		ContactImp contact = new ContactImp();
		
		System.out.println("Creat New Contact");
		contact.createContact();
	}
}
