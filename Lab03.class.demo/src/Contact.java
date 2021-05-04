
public class Contact {
	// define properties / variables
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	// this has nothing to do with this class, just demo purposes
	public static final int NUMBER = 111111;
	
	public Contact() {
		super();
	}

	public Contact(String fn, String ln, String e, String pn) {
		firstName = fn;
		lastName = ln;
		email = e;
		phoneNumber = pn;
	}
	
	// getters and setters - right click - source - generate getters/setters
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// define printContactSummary() method
	void printContactSummary() {
		System.out.println("Contact Summary: "+lastName+", "+firstName+
						   " "+phoneNumber);
	}

	// right click - source - generate toString()
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}

	
}
