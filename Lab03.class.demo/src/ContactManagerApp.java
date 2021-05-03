
public class ContactManagerApp {

	public static void main(String[] args) {
		// type 'sysout' then hit cntl-space
		System.out.println("Welcome to the Contact Manager!");
		
		Contact tommy = new Contact();
		tommy.printContactSummary();
		System.out.println("tommy's phone:"+tommy.getPhoneNumber());
		
		
		System.out.println(tommy);
		System.out.println("bye");

	}

}
