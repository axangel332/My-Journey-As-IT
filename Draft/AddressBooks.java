package xzx;

import java.util.Scanner;

public class AddressBooks {
	private AddressBookEntry[] entries;
	private int numEntries;

	public AddressBooks() {
		entries = new AddressBookEntry[5];
		numEntries = 0;
		
	}

	public void addEntry(AddressBookEntry entry) {
		if (numEntries < entries.length) {
			entries[numEntries] = entry;
			numEntries++;
		} else {
			System.out.println("Address book is full.");
		}
	}

	public AddressBookEntry getEntry(int index) {
		if (index < 0 || index >= numEntries) {
			return null;
		} else {
			return entries[index];
		}
	}

	public int getNumEntries() {
		return numEntries;
	}

	public static void main(String[] args) {
		AddressBooks addressBook = new AddressBooks();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("==Welcome To Sumalan's Application==");
			System.out.println("\nEnter 5 people details  " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Address: ");
			String address = scanner.nextLine();
			System.out.print("Postal Code: ");
			String zipcode = scanner.nextLine();
			System.out.print("Phone number: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("         (Date)/(Month)/(Year) ");
			System.out.print("\nBirthday: ");
			String birthday = scanner.nextLine();
			AddressBookEntry entry = new AddressBookEntry(name, address, phoneNumber, birthday, zipcode);
			addressBook.addEntry(entry);
			
		}

		for (int i = 0; i < addressBook.getNumEntries(); i++) {
			System.out.println(addressBook.getEntry(i));
		}
	}
}
