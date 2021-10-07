package addressbookproblems;

import java.util.Scanner;
import java.util.Set;

public class UserInterfaceTwo {
	void print(Set<Object> contactList) {
		for (Object string : contactList) 
		{
			System.out.println(string);
		}
	}
	
	void edit(AddressBookTwo contact) {
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

	void addContact(AddressBookTwo contactThree) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of new person firstName,lastName,address,city,state,zip,phoneNumber,Email respectively");
		contactThree.setFirstName(sc.nextLine());
		contactThree.setLastName(sc.nextLine());
		contactThree.setAddress(sc.nextLine());
		contactThree.setCity(sc.nextLine());
		contactThree.setState(sc.nextLine());
		contactThree.setZip(sc.nextLine());
		contactThree.setPhoneNumber(sc.nextLine());
		contactThree.setEmail(sc.nextLine());
	}
}
