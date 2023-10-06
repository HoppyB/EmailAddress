import java.util.ArrayList;
import java.util.Objects;

/** Seminar class with seminar title, date and students.
 * The students are an aggregation of the Email Address class.
 * 
 * @author Oluwatimilehin Amira
 *
 */

public class Seminar {
	
	//fields
	/**
	 * fields are to be kept as private
	 * 
	 * @param seminarTitle Title of the Seminar
	 * @param seminarDate Date of the Seminar
	 * @param students students that will be present at the seminar.
	 */
	
	private String seminarTitle; //Title of the seminar
	private String seminarDate; // Date the seminar will hold
	private ArrayList<EmailAddress> students; //students that will be present at the seminar
	
	//constructors
	/**
	 * Default Constructor assigning default values to fields
	 */
	public Seminar() {
		this.seminarTitle = "";
		this.seminarDate = "";
		this.students = new ArrayList<EmailAddress>();
	}

	/**
	 * Initialize newly created Seminar object with custom values.
	 * 
	 * @param seminarTitle Title of the Seminar
	 * @param seminarDate Date of the Seminar
	 * @param students students that will be present at the seminar.
	 */
	
	
	public Seminar(String seminarTitle, String seminarDate, ArrayList<EmailAddress> students) {
		super();
		this.seminarTitle = seminarTitle;
		this.seminarDate = seminarDate;
		this.students = students;
	}
	
	
	//Methods
	/** Sets the value of seminar's title of the seminar in that specified in the argument.
	 * @param seminarTitle the String value at which the seminar title of the seminar should be set
	 */
	
	public void setSeminarTitle(String seminarTitle) {
		this.seminarTitle = seminarTitle;
	}
	
	/** Sets the value of seminar's date of the seminar in that specified in the argument.
	 * @param seminarDate the String value at which the seminar's date of the seminar should be set
	 */
	public void setSeminarDate(String seminarDate) {
		this.seminarDate = seminarDate;
	}
	

	/** Sets the value of students to be present in the seminar of that specified in the argument.
	 * @param students the String value at which the students to be present in the seminar 
	 * should be set
	 */
	public void setStudents(ArrayList<EmailAddress> students) {
		this.students = students;
	}
	
	
	/**
	 * Gets the title of the seminar
	 * @return seminarTitle the title of the seminar
	 */
	public String getSeminarTitle() {
		return seminarTitle;
	}
	
	/**
	 * Gets the date of the seminar
	 * @return seminarDate the date of the seminar
	 */
	public String getSeminarDate() {
		return seminarDate;
	}
	
	/** Gets the value of students to be present in the seminar of that specified in the argument.
	 * @return students the String value at which the students to be present in the seminar 
	 * should be set
	 */
	
	public ArrayList<EmailAddress> getStudents() {
		return students;
	}
	
	
	//clear the array list of student using clear() method
	public void clear() {
		students.clear();
	}
	
	/** get the size of the students to be present 
	 * in the seminar
	 * 
	 * @return size the size of the students array list
	 */
	public int getSize() {
		return students.size();
	}
	
	/** to know if there's any email address in the array list 
	 * of student or not
	 * 
	 * @return isEmpty if there is no student present
	 */
	public boolean isEmpty(){
		return students.isEmpty();
	}
	
	
	/**
	 * when a new person wants to register, we need the person's email
	 * This helps us add new email address.
	 * 
	 * @param email email address of the student registering for the seminar.
	 * 
	 * @return true if the student was able to register
	 */ 
	

	public boolean register(EmailAddress email) {
		if (students.add(email) == true){
			return true;
		} else {
			return false;
		}
	}

	
	
	/**
	 * For every seminar, the maximum capacity is 4 i.e you can only add 4 people
	 * into the event
	 * 
	 * @param email email address of the student in the list.
	 * 
	 * @return true if the student was able to add email into the array list of students email 
	 * where the number of students is not more than 4
	 */ 
	
	public boolean list(EmailAddress email) {
		if (students.size() < 4) {
			students.add(email );
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Remove any student email who has initially registered for the seminar
	 * 
	 * @param email email address of the student we are about to remove
	 * 
	 * @return true if the student to be removed was found in the array list of students 
	 * and removed 
	 */
	
	public boolean deregister(EmailAddress email) {
		return students.remove(email);
	}
	
	/** Returns a textual representation of the seminar title, date and array list of students email 
	 * who will be there
	 * 
	 * @return a textual representation of the Seminar.
	 */
	
	@Override
	public String toString() {
		return "Seminar Title: " + seminarTitle + "\tSeminar Date: " + seminarDate + "\nStudents: " + students.toString();
	}
	
	

	/** Compares this seminar to the specified object. The result is true if and 
	 * only if the argument is not null and is a Seminar object that has the same
	 * seminar title, seminar date and students as this object.
	 * 
	 * @param obj the object to compare this Seminar against.
	 * 
	 * @return true if the given object represents a Seminar equivalent to this order line, false otherwise.
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seminar other = (Seminar) obj;
		return Objects.equals(seminarDate, other.seminarDate) && Objects.equals(seminarTitle, other.seminarTitle)
				&& Objects.equals(students, other.students);
	}

}
