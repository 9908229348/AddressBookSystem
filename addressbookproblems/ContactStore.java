package addressbookproblems;

import java.util.HashSet;

import java.util.Set;

public class ContactStore {
	private Set<Object> contactList = new HashSet<>();
	private Set<Object> contactListTwo = new HashSet<>();

	public Set<Object> getContactList() {
		return contactList;
	}

	public void add(AddressBook contact) {
		contactList.add(contact);
	}

	public void remove(AddressBook contact) {
		contactList.remove(contact);
	}

	public Set<Object> getContactListTwo() {
		return contactListTwo;
	}

	public void add(AddressBookTwo contact) {
		contactListTwo.add(contact);
	}

	public void remove(AddressBookTwo contact) {
		contactListTwo.remove(contact);
	}
}
