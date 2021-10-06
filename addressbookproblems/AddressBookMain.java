package addressbookproblems;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook Program");

		AddressBook contactOne = new AddressBook();
		contactOne.setFirstName("Kallavai");
		contactOne.setLastName("Sravanthi");
		contactOne.setAddress("2-5");
		contactOne.setCity("Anantapur");
		contactOne.setState("AP");
		contactOne.setZip("515611");
		contactOne.setPhoneNumber("9908229348");
		contactOne.setEmail("kala@gmail.com");

		AddressBook contactTwo = new AddressBook();
		contactTwo.setFirstName("Maligi");
		contactTwo.setLastName("Sailaja");
		contactTwo.setAddress("3-5");
		contactTwo.setCity("Kadapa");
		contactTwo.setState("AP");
		contactTwo.setZip("102932");
		contactTwo.setPhoneNumber("8639012896");
		contactTwo.setEmail("sailaja@gmail.com");
		
		AddressBook contactThree = new AddressBook();
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

		ContactStore contactStore = new ContactStore();
		contactStore.add(contactOne);
		contactStore.add(contactTwo);
		contactStore.add(contactThree);

		UserInterface user = new UserInterface();
		user.print(contactStore.getContactList());
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of contact you want to edit");
		String name = s.nextLine();
		if(contactOne.getFirstName().equalsIgnoreCase(name) == true)
			user.edit(contactOne);
		else if(contactTwo.getFirstName().equalsIgnoreCase(name) == true)
			user.edit(contactTwo);
		else if(contactThree.getFirstName().equalsIgnoreCase(name) == true)
			user.edit(contactThree);
		System.out.println("Contact List after edit");
		user.print(contactStore.getContactList());
		
		System.out.println("Enter name of person you want to delete");
		String contactName = sc.nextLine();
		if(contactOne.getFirstName().equalsIgnoreCase(contactName) == true)
			contactStore.remove(contactOne);
		else if(contactThree.getFirstName().equalsIgnoreCase(contactName) == true)
			contactStore.remove(contactThree);
		else if(contactTwo.getFirstName().equalsIgnoreCase(contactName) == true)
			contactStore.remove(contactTwo);
		System.out.println("Contact List after deletion");
		user.print(contactStore.getContactList());

		
	}
}
