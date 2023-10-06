/**
 * imports the Scanner class to allow us collect input from the user
 */
import java.util.Scanner;

/** 
 * This test class is initiated to test
 *  the constructors and methods in EmailAddress class
 *  and also testing the composition of relation of the seminar class
 *  to the Email Address Class
 * 
 * @author Oluwatimilehin Amira
 */


public class EmailAddressTest {

	// main method
	/**
	 * 
	 * @param args argument in which the methods are being stored
	 */
	public static void main(String[] args) {
		System.out.println("Testing default constructor initialisation and toString method...");
		
		EmailAddress user1 = new EmailAddress();
		
		System.out.println("Expected empty string for real name and Null Email for Email "
				+ "also expects it to print \none of either first name, last name or user ID isn't"
				+ " present, so email can't be generated: \nActual: " + user1.toString());
		
		System.out.println("Testing set and get method for first name and last name"
				+ " and user ID");
		user1.setFirstName("Tunde");
		user1.setLastName("Fayo");
		System.out.println("Expected Tunde: Actual: " + user1.getFirstName());
		System.out.println("Expected Fayo: Actual: " + user1.getLastName());
	
		System.out.println("Expected Tunde Fayo and Null Email with output one of either first "
				+ "name, last name or user \nID isn't present, so email can't be generated"
				+ " Actual: " + user1.toString());
		
		System.out.println("Testing get method for Real name: ");
		System.out.println("Expected Tunde Fayo: Actual:" + user1.getRealName());
		
		System.out.println("Testing set and get method for userID and Domain and toString ");
		user1.setUserID(75);
		System.out.println("Expected my365.dmu.ac.uk: Actual: " + user1.getDomain());
		System.out.println("Expected TFayo75@mydmu.ac.uk: Actual: " + user1.getEmail());
		System.out.println("Expected 75: Actual: " + user1.getUserID());
		System.out.println("Expected Real Name: Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk: "
				+ "Actual: \n" + user1.toString());
		
		System.out.println("Testing get method for email only ");
		EmailAddress user2 = new EmailAddress("Jordan", "Arthur", 81);
		System.out.println("Expected: JArthur81@my365.dmu.ac.uk, Actual: "+user2.getEmail());
		
		/* 
		 * Using object array to store element in Email Address class
		 * and the existing reference types
		 * 
		 */
		System.out.println("Using object array, we hereby print array of email address holding"
				+ " four objects ");
		//declare array to hold 4 EmailAddress objects
		EmailAddress[] users = new EmailAddress[4];

		//create EmailAddress object and assign references into array
		EmailAddress user3 = new EmailAddress("Joe", "Biden", 25);
		users[0] = user3;

		//create EmailAddress objects and assign reference directly into array
		users[1] = new EmailAddress("Fred", "Benson", 15);
		users[2] = new EmailAddress("Diti", "Fegnon", 91);
		users[3] = new EmailAddress("Bulsar","Raymond", 54);

		//loop through each element
		for(int i = 0; i < users.length; i++) {
			//use access method to output first email address of each
			System.out.println(users[i].getEmail());
		}
		
		/** How to read input of users from keyboard using a scanner
		 * Hereby creating a scanner object for keyboard input
		 */
		Scanner sc = new Scanner(System.in);
		
		/**
		 * @param fNmae first name of this particular user in the scanner
		 * @param lName last name of this particular user in the scanner
		 * @param id the identity number of the user 
		 * @param dom the domain of this user, usually fixed
		 * @param fNameInitial the initial letter of the user's first name
		 * @param eMail Email Address of this user.
		 */
		
		System.out.println("Type your first name and press enter: ");
		String fName = sc.nextLine(); //read a whole line
		System.out.println("Your first name is: " + fName);
		
		System.out.println("Type your last name and press enter: ");
		String lName = sc.nextLine(); //read a whole line
		System.out.println("Your last name is: " + lName);
	
		System.out.println("Type your user ID and press enter: ");
		int id = sc.nextInt(); //read the next token as an int
		System.out.println("Your user ID is: " +id); 
		
		
		sc.nextLine();
		System.out.println("Write out the domain and press enter: ");
		String dom = sc.nextLine(); //read the whole line
		System.out.println("Domain is: " + dom);
		
		System.out.println("Here is your email address below; ");
		//we now try to get the initial of the first name
		char fNameInitial = fName.charAt(0);
		
		//we concatenate the first name initial, last name, id and domain
		//to get the email address
		String eMail = fNameInitial + "" + lName + "" + id + "@" + dom;
		
		//we now form an email address based on these information provided
		System.out.println(eMail);
		
		sc.close(); //close the scanner
		
		
		//to test the boolean method, hereby comparing user2 and user 3 
		System.out.println("Testing boolean method: ");
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		
		boolean comparison = user2.equals(user3);
		System.out.println("user2.equal(user3) is: " + comparison); //end of the boolean method
		
		//to test the override equals method.
		System.out.println("Testing the override equals method ");
		EmailAddress user4 = new EmailAddress("John", "Paul" , 52);
		EmailAddress user5 = new EmailAddress("John", "Paul" , 52);
		System.out.println("user2==user3 is: " + (user4==user5));
		System.out.println("user2.equals(user3) is: " + user4.equals(user5));
		
		//to test the array list 
		//we are creating a new Seminar
		System.out.println("Testing the Array List: ");
		Seminar seminar = new Seminar();
		//we want to print this seminar
		System.out.println(seminar.toString()); //created the seminar as the seminar title and date 
		//are null and there is no student added to this seminar
		
		seminar.register(user1);
		System.out.println(seminar.toString()); //when we register user1, user1's real name and email
		//will be registered in the seminar 
		
		seminar.setSeminarTitle("CEM Placement Opportunity"); //set seminar title
		seminar.setSeminarDate("19th, November 2021"); //set seminar date.
		System.out.println(seminar.toString()); 
		
		seminar.register(user2);
		System.out.println(seminar.toString()); //when we register user2, the real name and email
		//with the seminar title and date being displayed.
		
		seminar.register(user3);
		seminar.register(user4);
		System.out.println(seminar.toString()); //when we register user 3, 4 and 5, it prints out
		//the 4 users registered.
		
		seminar.deregister(user3);
		System.out.println(seminar.toString()); //when we deregister user 3, we expect user 1,2 
		//and 4 only to remain
		
		seminar.deregister(user1);
		System.out.println(seminar.toString()); //when we deregister user 1, we expect to see only
		//user 2 and 4
		
		seminar.clear();
		System.out.println(seminar.toString()); //to clear the existing array list and change it to null
		
		seminar.register(user3); //now add user3 and wait for the answer, you will get user3's email details
		
		System.out.println(seminar.toString()); //end of the test
	}

}
