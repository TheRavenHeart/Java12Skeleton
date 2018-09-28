import java.util.Scanner;

class PhoneEntry {
	String name; // name of a person
	String phone; // their phone number
	String address; // the address
	String city; // the city
	String province; // the province
	String postal; // their postal code

	PhoneEntry(String n, String p, String a, String c, String superp, String ultrap) {
		name = n;
		phone = p;
		address = a;
		city = c;
		province = superp;
		postal = ultrap;
	}
}

class PhoneBook {
	PhoneEntry[] phoneBook;

	PhoneBook() // constructor
	{// all the information of all the people
		phoneBook = new PhoneEntry[5];
		phoneBook[0] = new PhoneEntry("James Barclay", "(418)665-1223", "4517 Sunny Day Drive", "Riverside",
				"California", "92501"); 
		phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860)399-3044", "1865 Petunia Way", "Birmingham", "Alabama",
				"35203");
		phoneBook[2] = new PhoneEntry("Paul Kratides", "(815)439-9271", "142 Cerullo Road", "Lexington", "Kentucky",
				"40507");
		phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223-1937", "4395 Reppert Coal Road", "Washington",
				"Michigan", "48094");
		phoneBook[4] = new PhoneEntry("John Wood", "(913)883-2874", "1387 Thrash Trail", "Longview", "Texas", "75601");
	}

	PhoneEntry searchName(String targetName) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].name.equals(targetName)) // makes sure the name entered is the same as the one in the directory
				return phoneBook[j];
		}
		return null;
	}

	PhoneEntry searchAdd(String targetAddress) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].address.equals(targetAddress)) // makes sure the address entered is the same as the one in the directory
				return phoneBook[j];
		}
		return null;
	}

	PhoneEntry searchPhone(String targetPhone) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].phone.equals(targetPhone)) // makes sure the phone entered is the same as the one in the directory
				return phoneBook[j];
		}
		return null;
	}

	PhoneEntry searchCity(String targetCity) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].city.equals(targetCity)) // makes sure the city entered is the same as the one in the directory
				return phoneBook[j];
		}
		return null;
	}

	PhoneEntry searchState(String targetState) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].province.equals(targetState)) // makes sure the province or state entered is the same as the one in the directory
				return phoneBook[j];
		}
		return null;
	}

	PhoneEntry searchPostal(String targetPostal) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].postal.equals(targetPostal)) // makes sure the postal code entered is the same as the one in the directory
				return phoneBook[j];
		}
		return null;
	}
}

class PhoneBookTester {
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		Scanner sc = new Scanner(System.in); // makes a new scanner
		
		while(true){ // loops until someone enters 0
		System.out.print("enter 0 to exit, press 1 to enter their name, 2 to enter their phone number, 3 to to enter the address, 4 to enter the city, 5 to enter the state, and 6 to enter the postal code");
		int searchChoice = sc.nextInt();
		sc.nextLine();
		PhoneEntry entry;
		
		
		String searchQuery;
		
		switch (searchChoice) {
		case 0:
			System.out.println("Exiting");
			System.exit(0);
		case 1:
			System.out.println("Please Enter the Name of the person who's phone number you need");
			 searchQuery = sc.nextLine(); // takes the name 
			 entry = pb.searchName(searchQuery); // checks it 
			break;
		case 2:
			System.out.println("Enter the phone number of the desired person.");
			searchQuery = sc.nextLine(); // takes the phone number
			entry = pb.searchPhone(searchQuery);//checks it 
			break;
		case 3:
			System.out.println("Enter the address of the person you need.");
			 searchQuery = sc.nextLine();//same as above for address and so on and so forth
			 entry = pb.searchAdd(searchQuery);
			break;
		case 4:
			System.out.println("Enter the City that the person lives in.");
			 searchQuery = sc.nextLine();
			 entry = pb.searchCity(searchQuery);
			break;
		case 5:
			System.out.println("Enter the State or Province that the person lives in.");
			 searchQuery = sc.nextLine();
			 entry = pb.searchState(searchQuery);
			break;
		case 6:
			System.out.println("Enter the Postal or Zipcode that the person lives in.");
			searchQuery = sc.nextLine();
			entry = pb.searchPostal(searchQuery);
			break;
			default:
			entry = null; // if the entry does not corralate with any others in the directory it makes it null
		}
		

		if (entry != null)// prints this if entry is not null
			System.out.println(entry.name + ": " + entry.phone + ": " + entry.address + ": " + entry.city + ": " + entry.province + ": " + entry.postal);
		else
			System.out.println("Entry not found");
	}
	}
}