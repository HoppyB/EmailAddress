import java.util.Objects;

/** An email address is made up of a real name which comprise of 
 *  a first name and last name, then a user id and a domain.
 *  An option to create an Email that comprise of the combination 
 *  of all these.
 *  
 * @author Oluwatimilehin Amira
 */


public class EmailAddress {
	
	//Fields
	/**
	 * Fields are meant to be kept private.
	 * 
	 * @param firstName First Name of the user
	 * @param lastName Last Name of the user.
	 * @param userID ID of the user.
	 */
	private String firstName; //first name of the user to form the email address
	private String lastName; //last name of the user to form the email address
	private String domain; //domain, which is set to be fixed for the email address
	private int userID; // the identify of the user to form the email address
	
	//Constructors
	/** Default constructors assigning default values to the fields. */
	public EmailAddress() {
		firstName = "";
		lastName = "";
		userID = 0;
		domain = "my365.dmu.ac.uk";
	}
	
	/**
	 * Initialize newly created EmailAdress object with custom values.
	 * 
	 * @param firstName First Name of the user
	 * @param lastName Last Name of the user.
	 * @param userID ID of the user.
	 */

	public EmailAddress(String firstName, String lastName, int userID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userID = userID;
		domain = "my365.dmu.ac.uk";
	}
	
	//Methods
	/** Sets the value of first name to form the Email Address to that specified in the argument.
	 * @param firstName the String value at which the first name of the user should be set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/** Sets the value of last name to form the Email Address to that specified in the argument.
	 * @param lastName the String value at which the Last name of the user should be set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	/** Sets the value of userID to form the Email Address to that specified in the argument.
	 * @param userID the int value at which the userID should be set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	/** Sets the value of domain to form the Email Address to that specified in the argument.
	 * @param domain the String value at which the domain should be set
	 * This domain is a general value, i just created this set method.
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	/**
	 * Gets the First name of the user
	 * @return firstName the First name of the user
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Gets the last name of the user
	 * @return lastName the last name of the user
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Gets the ID of the user
	 * @return userID the ID of the user
	 */
	public int getUserID() {
		return userID;
	}
	
	/**
	 * Gets the domain of the user
	 * @return domain the domain of the user
	 * This domain is a general value.
	 */
	public String getDomain() {
		return domain;
	}
	
	/**
	 * Gets the Real name of the user
	 * @return concatenate first name and the last name of the user to produce the real name
	 */
	public String getRealName() {
		return firstName + " " + lastName; 
	}
	
	/** Returns the current value of the Email Address by combining the Real name with the userID and the domain
	 * @return the current value of the Email Address 
	 */
	public String getEmail() {
		char initial = 0;
		if (!firstName.equals("") && !lastName.equals("") && userID > 0) {
			initial = firstName.charAt(0);
			return initial + "" + lastName + "" + userID + "@" + domain;
		} else {	System.out.println("One of either first name, last name or user ID isn't present, so email can't be generated");
			return "Null Email";
		}
		
	}
	
	/**
	 * returns the textual representation of the email address showing 
	 * the user's real name and the email address
	 * @return string representation of the email address information
	 */
	
	@Override
	public String toString() {
		return "[Real Name:" + getRealName() + ", Email: " + getEmail() + "]";
	}

	/** Compares this EmailAddress to the specified object. The result is true if and 
	 * only if the argument is not null and is an EmailAddress object that contains the same
	 * Real name, user ID and Domain as this object.
	 * 
	 * @param obj the object to compare this EmailAddress against.
	 * 
	 * @return true if the given object represents an EmailAddress equivalent to this EmailAddress, false otherwise.
	 */
	
	@Override
	public boolean equals(Object obj) {
		
		// test exceptional cases, i.e. obj is an EmailAddress, and not null
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailAddress other = (EmailAddress) obj; // cast to an EmailAddress object
		
		// uses == for primitive types and .equals for reference types
		return Objects.equals(domain, other.domain) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && userID == other.userID;
	}

}
