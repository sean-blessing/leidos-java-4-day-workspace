import java.util.Scanner;

public class ContactManagerApp {

	public static void main(String[] args) {
		// type 'sysout' then hit cntl-space
		System.out.println("Welcome to the Contact Manager!");
		
		Contact tommy = new Contact();
		tommy.setFirstName("Tommy");
		tommy.setLastName("Brown");
		tommy.setEmail("tommy@test.com");
		tommy.setPhoneNumber("867-5309");
		
		tommy.printContactSummary();
		System.out.println("tommy's phone:"+tommy.getPhoneNumber());
		
		Contact sally = new Contact("Smith", "Sally", "sally@test.com", "513-555-4444");
		System.out.println("sally's info: "+sally);
		
		System.out.println("try to access methods of Contact in a static way...");
		//System.out.println(Contact.getPhoneNumber());  <- won't work!
		System.out.println(Contact.NUMBER);
		
		System.out.println(tommy);
		
		
		// Use the Scanner class to get user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a whole number: ");
		int nbr = sc.nextInt();
		System.out.println("You entered the number: "+nbr);
		System.out.println("bye");

	}

}
