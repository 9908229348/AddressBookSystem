package addressbookproblems;

import java.util.Scanner;
import java.util.Set;

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

		AddressBookTwo contactTwo = new AddressBookTwo();
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

		UserInterfaceTwo use = new UserInterfaceTwo();
		use.print(contactStore.getContactListTwo());

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check == true) {
			System.out.println("Enter choice 1.Add the new contact\n 2.Edit Existing contact 3.Remove the contact");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter 1 to add details to AddressBook and 2 to add to AddressBookTwo");
				int select = sc.nextInt();
				if (select == 1) {
					AddressBook contact = new AddressBook();
					user.addContact(contact);
					contactStore.add(contact);
					System.out.println("Contact List after add");
					user.print(contactStore.getContactList());
					use.print(contactStore.getContactListTwo());
				} else if (select == 2) {
					AddressBookTwo contact = new AddressBookTwo();
					use.addContact(contact);
					contactStore.add(contact);
					System.out.println("Contact List after add");
					user.print(contactStore.getContactList());
					use.print(contactStore.getContactListTwo());
				}
				break;
			case 2:
				Scanner s = new Scanner(System.in);
				System.out.println("Enter name of contact you want to edit");
				String name = s.nextLine();
				if (contactOne.getFirstName().equalsIgnoreCase(name) == true)
					user.edit(contactOne);
				else if (contactTwo.getFirstName().equalsIgnoreCase(name) == true)
					use.edit(contactTwo);
				System.out.println("Contact List after edit");
				user.print(contactStore.getContactList());
				use.print(contactStore.getContactListTwo());
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
				use.print(contactStore.getContactListTwo());
				break;
			default :
				System.out.println("Invalid choice and Exited");
				check = false;
			}	
		}
	}
}
