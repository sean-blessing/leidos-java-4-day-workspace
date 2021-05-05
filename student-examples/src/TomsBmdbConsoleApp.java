import java.util.Scanner;

public class TomsBmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter movie data:");
			System.out.println("ID");
			int movieId = sc.nextInt();
			System.out.println("Title:");
			String title = sc.next();
			System.out.println("cont?");
			choice = sc.next();
		}
		System.out.println("Bye");
	}

}
