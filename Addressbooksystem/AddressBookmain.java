package Addressbooksystem;

public class AddressBookmain {
	public static void main(String[] args) {
		// print welcome message
				System.out.println("WELCOME  TO ADDRESS BOOK PROGRAM");
				AddressBook c1 = new AddressBook();
				c1.setFirstName("Rahul");
				c1.setLastName("yadav");
				c1.setAddress("talwade");
				c1.setCity("pune");
				c1.setState("Maharashtra");
				c1.setZip("222001");
				c1.setPhoneNumber("123456");
				c1.setEmail("Rahulyadav@gmail.com");
				
				AddressBook c2= new AddressBook();
				c2.setFirstName("Rohan");
				c2.setLastName("mishra");
				c2.setAddress("aliganj");
				c2.setCity("jaunpur");
				c2.setState("utterpradesh");
				c2.setZip("222002");
				c2.setPhoneNumber("125368");
				c2.setEmail("rohan@gmail.com");
				
				ContactStore contactStore =new ContactStore();
				contactStore.add(c1);
				contactStore.add(c2);
				
				UserInterface userInterface = new UserInterface();
				userInterface.print(contactStore.getContactList());
				
				
				
			}

		}
				