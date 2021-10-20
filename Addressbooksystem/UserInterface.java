package Addressbooksystem;

import java.util.Set;
public class UserInterface {
	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
				System.out.println(s);
		}
	}
}