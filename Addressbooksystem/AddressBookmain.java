package Addressbooksystem;

import java.util.Scanner;

public class AddressBookmain {
	public static void main(String[] args){
		// print welcome message
				System.out.println("WELCOME  TO ADDRESS BOOK PROGRAM");
				
				// create object for taking input from console9
				Scanner scanner = new Scanner(System.in);

				// create object for contact One
				AddressBook contactOne = new AddressBook();
				contactOne.setFirstName("Rahul");
				contactOne.setLastName("yadav");
				contactOne.setAddress("talwade");
				contactOne.setCity("pune");
				contactOne.setState("Maharashtra");
				contactOne.setZip("222001");
				contactOne.setPhoneNumber("123456");
				contactOne.setEmail("Rahulyadav@gmail.com");
				
				// Create object for contact two
				AddressBook contactTwo = new AddressBook();
				contactTwo.setFirstName("Rohan");
				contactTwo.setLastName("mishra");
				contactTwo.setAddress("aliganj");
				contactTwo.setCity("jaunpur");
				contactTwo.setState("Utter pradesh");
				contactTwo.setZip("222002");
				contactTwo.setPhoneNumber("8639096");
				contactTwo.setEmail("Rohanmishra123@gmail.com");

				// create object for contactStore
				ContactStore contactStore = new ContactStore();

				// add contact data into contact store
				contactStore.add(contactOne);
				contactStore.add(contactTwo);

				// create object for userInterface
				UserInterface userInterface = new UserInterface();

				// print contact details
				userInterface.print(contactStore.getContactList());
				
				// initialize boolean variable and store true 
				boolean check = true;
				
				// check condition
				while (check == true) {
					// message for user choice
					System.out.println("------ Enter your choice ------- \n 1.Add the new contact\n 2.Edit Existing contact\n 3.Remove the contact");
					// take value from user
					int choice = scanner.nextInt();
					switch (choice) {
						case 1:
							// create object
							AddressBook contact = new AddressBook();
							// call method
							userInterface.addContact(contact);
							// store contact information
							contactStore.add(contact);
							System.out.println("----- Contact List after add -------");
							userInterface.print(contactStore.getContactList());
							break;
						case 2:
							// print message for user
							System.out.println("Enter name of contact you want to edit");
							// take name from user
							String name = scanner.nextLine();
							// check condition for edit
							if (contactOne.getFirstName().equalsIgnoreCase(name) == true)
								userInterface.edit(contactOne);
							else if (contactTwo.getFirstName().equalsIgnoreCase(name) == true)
								userInterface.edit(contactTwo);
							System.out.println("-------Contact List after edit--------");
							userInterface.print(contactStore.getContactList());
							break;
						case 3:
							// print message for user
							System.out.println("Enter name of person you want to delete");
							//take input from user
							String contactName = scanner.nextLine();
							// check condition for delete
							if (contactOne.getFirstName().equalsIgnoreCase(contactName) == true)
								contactStore.remove(contactOne);
							else if (contactTwo.getFirstName().equalsIgnoreCase(contactName) == true)
								contactStore.remove(contactTwo);
							System.out.println("Contact List after deletion");
							userInterface.print(contactStore.getContactList());
							break;
						default:
							check = false;
							System.out.println("Invalid choice and Exited ");
					}
				}
			}
		}