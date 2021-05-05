
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App");
		
		System.out.println("Sum of 4 and 8: " + add(4,8));
		System.out.println("Sum of 4, 8, 18: " + add(4,8,18));
		System.out.println("big sum: " + add(4,8,18,65,78,23,45,111,2000));

		
		
		
		System.out.println("Bye");

	}
	
	//vargs method
	private static int add(int... numbers) {
		int sum = 0;
		for (int nbr: numbers) {
			sum += nbr;
		}
		return sum;
	}
//	private static int add(int n1, int n2) {
//		return n1 + n2;
//	}
//	private static int add(int n1, int n2, int n3) {
//		return n1 + n2 + n3;
//	}

}
