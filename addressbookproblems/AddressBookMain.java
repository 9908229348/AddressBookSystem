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
		
		AddressBook address = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of new person firstName,lastName,address,city,state,zip,phoneNumber,Email respectively");
		address.setFirstName(sc.nextLine());
		address.setLastName(sc.nextLine());
		address.setAddress(sc.nextLine());
		address.setCity(sc.nextLine());
		address.setState(sc.nextLine());
		address.setZip(sc.nextLine());
		address.setPhoneNumber(sc.nextLine());
		address.setEmail(sc.nextLine());
		sc.close();

		ContactStore contactStore = new ContactStore();
		contactStore.add(contactOne);
		contactStore.add(contactTwo);
		contactStore.add(address);

		UserInterface user = new UserInterface();
		user.print(contactStore.getContactList());
	}
}
