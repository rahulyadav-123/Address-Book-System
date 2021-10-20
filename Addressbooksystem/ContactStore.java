package Addressbooksystem;
import java.util.HashSet;
import java.util.Set;

public class ContactStore {
	private Set<AddressBook> contactList = new HashSet<>();

	public Set<AddressBook> getContactList() {
		return contactList;
	}

	public void add(AddressBook address) {
		contactList.add(address);
	}

}
