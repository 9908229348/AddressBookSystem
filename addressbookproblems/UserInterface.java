package addressbookproblems;

import java.util.Set;

import java.util.Scanner;

public class UserInterface {
	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
		}
	}

	void edit(AddressBook contact) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Edit the details firstName,lastName,address,city,state,zip,phoneNumber,email respectively");
		contact.setFirstName(sc.nextLine());
		contact.setLastName(sc.nextLine());
		contact.setAddress(sc.nextLine());
		contact.setCity(sc.nextLine());
		contact.setState(sc.nextLine());
		contact.setZip(sc.nextLine());
		contact.setPhoneNumber(sc.nextLine());
		contact.setEmail(sc.nextLine());
	}
}
