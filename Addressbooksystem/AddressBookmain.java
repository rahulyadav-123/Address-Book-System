package Addressbooksystem;

import java.util.Scanner;

public class AddressBookmain {
	public static void main(String[] args) {
		// print welcome message
				System.out.println(" WELCOME  TO ADDRESS BOOK PROGRAM");

				// create object for customer 1
				AddressBook customer1 = new AddressBook();

				// pass customer 1 data
				customer1.setFirstName("Rahul");
				customer1.setLastName("yadav");
				customer1.setAddress("talwade");
				customer1.setCity("pune");
				customer1.setState("Maharashtra");
				customer1.setZip("222001");
				customer1.setPhoneNumber("123456");
				customer1.setEmail("Rahulyadav@gmail.com");
				
				AddressBook addressBook = new AddressBook();
				Scanner scanner = new Scanner(System.in);
				System.out.println("------- Enter details of new person ---------");

				System.out.print("Enter Frist Name: ");
				addressBook.setFirstName(scanner.nextLine());
				System.out.print("Enter Last Name: ");
				addressBook.setLastName(scanner.nextLine());
				System.out.print("Enter Address: ");
				addressBook.setAddress(scanner.nextLine());
				System.out.print("Enter City: ");
				addressBook.setCity(scanner.nextLine());
				System.out.print("Enter State: ");
				addressBook.setState(scanner.nextLine());
				System.out.print("Enter Pin: ");
				addressBook.setZip(scanner.nextLine());
				System.out.print("Enter Phone Number: ");
				addressBook.setPhoneNumber(scanner.nextLine());
				System.out.print("Enter Email: ");
				addressBook.setEmail(scanner.nextLine());

				// create object for contactStore
				ContactStore contactStore = new ContactStore();

				// add customer data into contact store
				contactStore.add(customer1);
				contactStore.add(addressBook);

				UserInterface userInterface = new UserInterface();
				userInterface.print(contactStore.getContactList());

			}

	}