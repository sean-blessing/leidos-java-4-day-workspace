
public class DataTypesApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		int n1 = 5;
		int n2 = 12;
		int sum = n1 +n2;
		System.out.println("sum is: "+sum);
		
		System.out.println("This is on 1 line, \nthis is on new line.");
		System.out.println("These\twords\tare\ttabbed.");
		
		double price1 = 14.99;
		// add sales tax
		double total = price1 * 1.075;
		System.out.println("total = "+total);
		
		System.out.println("9 / 2 = "+(9 / 2));
		System.out.println("9 % 2 = "+(9 % 2));
		
		if (total == 15) {
			System.out.println("15");
		}
		else if (total > 16) {
			System.out.println("yes");
		}
		
		String firstName = "Bob";
		String middleName = "Nesta";
		String lastName = "Marley";
		
		String fullName = firstName+" "+middleName+" "+lastName;
		System.out.println(fullName);
		
		System.out.println("Bye");

	}

}
