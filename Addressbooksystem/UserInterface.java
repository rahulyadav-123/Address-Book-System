package Addressbooksystem;

import java.util.Scanner;
import java.util.Set;
public class UserInterface {
	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
		}
	}
	
	void edit(AddressBook contact) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Frist Name: ");
		contact.setFirstName(scanner.nextLine());
		System.out.print("Enter Last Name: ");
		contact.setLastName(scanner.nextLine());
		System.out.print("Enter Address: ");
		contact.setAddress(scanner.nextLine());
		System.out.print("Enter City: ");
		contact.setCity(scanner.nextLine());
		System.out.print("Enter State: ");
		contact.setState(scanner.nextLine());
		System.out.print("Enter Pin: ");
		contact.setZip(scanner.nextLine());
		System.out.print("Enter Phone Number: ");
		contact.setPhoneNumber(scanner.nextLine());
		System.out.print("Enter Email: ");
		contact.setEmail(scanner.nextLine());
	}

	
}