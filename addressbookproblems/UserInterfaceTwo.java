package addressbookproblems;

import java.util.Scanner;
import java.util.Set;

public class UserInterfaceTwo {
	void print(Set<AddressBookTwo> contactList) {
		for (AddressBookTwo string : contactList) {
			System.out.println(string);
		}
	}

	void edit(AddressBookTwo contact) {
		boolean check = true;
		while (check == true) {
			System.out.println("enter 1.firstName 2.lastName 3.address 4.city 5.state 6.zip 7.phonenumber 8.email to edit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your new firstName :");
				Scanner sca = new Scanner(System.in);
				String name = sca.nextLine();
				contact.setFirstName(name);
				break;
			case 2:
				System.out.println("Enter your new lastName : ");
				Scanner scan = new Scanner(System.in);
				String lastName = scan.nextLine();
				contact.setLastName(lastName);
				break;
			case 3:
				System.out.println("Enter your new address :");
				Scanner scann = new Scanner(System.in);
				String address = scann.nextLine();
				contact.setAddress(address);
				break;
			case 4:
				System.out.println("Enter your new city : ");
				Scanner scanne = new Scanner(System.in);
				String city = scanne.nextLine();
				contact.setCity(city);
				break;
			case 5:
				System.out.println("Enter your new state :");
				Scanner s = new Scanner(System.in);
				String state = s.nextLine();
				contact.setCity(state);
				break;
			case 6:
				System.out.println("Enter your new zip : ");
				Scanner scanner = new Scanner(System.in);
				String zip = scanner.nextLine();
				contact.setZip(zip);
				break;
			case 7:
				System.out.println("Enter your new phoneNumber :");
				Scanner scanner1 = new Scanner(System.in);
				String phoneNumber = scanner1.nextLine();
				contact.setPhoneNumber(phoneNumber);
				break;
			case 8:
				System.out.println("Enter your new email : ");
				Scanner scanner2 = new Scanner(System.in);
				String email = scanner2.nextLine();
				contact.setEmail(email);
				break;
			default:
				check = false;
			}
		}
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
