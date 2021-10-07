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

		ContactStore contactStore = new ContactStore();
		contactStore.add(contactOne);
		contactStore.add(contactTwo);

		UserInterface user = new UserInterface();
		user.print(contactStore.getContactList());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice 1.Add the new contact\n 2.Edit Existing contact 3.Remove the contact");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter how many persons you want to add");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				AddressBook contact = new AddressBook();
				user.addContact(contact);
				contactStore.add(contact);
				System.out.println("Contact List after add");
				user.print(contactStore.getContactList());
			}
			break;
		case 2:
			Scanner s = new Scanner(System.in);
			System.out.println("Enter name of contact you want to edit");
			String name = s.nextLine();
			if (contactOne.getFirstName().equalsIgnoreCase(name) == true)
				user.edit(contactOne);
			else if (contactTwo.getFirstName().equalsIgnoreCase(name) == true)
				user.edit(contactTwo);
			System.out.println("Contact List after edit");
			user.print(contactStore.getContactList());
			break;
		case 3:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter name of person you want to delete");
			String contactName = scanner.nextLine();
			if (contactOne.getFirstName().equalsIgnoreCase(contactName) == true)
				contactStore.remove(contactOne);
			else if (contactTwo.getFirstName().equalsIgnoreCase(contactName) == true)
				contactStore.remove(contactTwo);
			System.out.println("Contact List after deletion");
			user.print(contactStore.getContactList());
			break;
		}
	}
}
