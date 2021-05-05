
public class ArraysApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Arrays App");
		
		// int array
		int[] evenNumbers = new int[10];
		System.out.println("evenNumbers length = "+evenNumbers.length);
		printArray(evenNumbers);
		
		// populate with even numbers
		for (int i = 0; i < evenNumbers.length; i++) {
			evenNumbers[i] = i * 2;
		}
		
		printArray(evenNumbers);
		//System.out.println(evenNumbers[10]);  Throws IndexOutOfBoundsException
		
		int[] oddNumbers = {1,3,5,7,9};
		printArray(oddNumbers);
		
		String[] students = {"Diane", "Keith", "Geoff", "Kim"};
		System.out.println(students[2]);
		
		Contact c1 = new Contact("Bob", "Smith", "bob@test.com", "444-444-4444");
		Contact c2 = new Contact("Ann", "Brown", "ann@test.com", "333-333-3333");
		Contact c3 = new Contact("Jim", "George", "jim@test.com", "777-777-7777");

		Contact[] contacts = {c1, c2, c3};
		
		// print the fname of the contact in 1st idx position
		System.out.println(contacts[1].getFirstName());
		
		// loop through all contacts and print their toString()
		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
		// replace contact in position 2nd idx position
		contacts[2] = new Contact("test", "testerson", "testemail", "123-456-7890");
		// loop through all contacts and print their toString()
		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
		
		System.out.println("print String[] args...");
		//enhanced for loop, or the for each loop
		for (String str: args) {
			System.out.println(str);
		}
		
		System.out.println("Bye");
	}
	
	private static void printArray(int[] intArray) {
		// print array - using a for loop
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i+":"+intArray[i]+" ");
		}
		System.out.println();
	}

}
