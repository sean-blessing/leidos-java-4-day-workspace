import java.util.Scanner;

public class ControlFlowApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Control Flow App!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		// continue until user enters anything other than 'y'
		while (choice.equalsIgnoreCase("y")) {
			
			// prompt the user for a whole number
			System.out.print("Enter a whole #: ");
			int nbr = sc.nextInt();
			
			// even - odd check
			// Note the absence of curly braces... they 
			// are optional with one statement
			if (nbr % 2 == 0) 
				System.out.println(nbr+" is even!");
			else 
				System.out.println(nbr+" is odd!");
			
			// check nbr as a grade (0% - 100%)
			if (nbr > 100) {
				System.out.println("invalid grade... too high");
			}
			else if (nbr >= 90) {
				System.out.println("A");
			}
			else if (nbr >= 80) {
				System.out.println("B");
			}
			else if (nbr >= 70) {
				System.out.println("C");
			}
			else if (nbr >= 60) {
				System.out.println("D");
			}
			else if (nbr >= 0) {
				System.out.println("F");
			}
			else {
				System.out.println("invalid grade...  too low");
			}			
			
			// evaluate odd and > 20??
			if (nbr %2 == 1 && nbr > 20) {
				System.out.println("odd and greater than 20!");
			}
			
			// evaluate even || > 100
			if (nbr %2 == 0 || nbr > 100) {
				System.out.println("even or greater than 100!");
			}
			
			// switch statement - grades by switch
			System.out.println("switch on nbr for 25, 50, 75, 100");
			switch (nbr) {
				case 25:
					System.out.println("25");
					break;
				case 50:
					System.out.println("50");
					break;
				case 75:
					System.out.println("75");
					break;
				case 100:
					System.out.println("100");
					break;
				default:
					System.out.println("not in switch criteria");
					break;			
			}
			
			// for loop (indexed for)
			// print even #s from 0 to 100
			for (int i = 0; i <= 100; i += 2) {
				System.out.print(i+" ");
			}
			System.out.println();
			
			System.out.print("Continue? ");
			choice = sc.next();
		}
		
		
		sc.close();
		System.out.println("Bye");
	}

}
