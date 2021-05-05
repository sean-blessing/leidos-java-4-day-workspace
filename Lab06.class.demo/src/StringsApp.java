
public class StringsApp {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to the Strings App");
		
		// creates an instance of string
		String str1 = "hello there";
		
		// doesn't change the string object, creates a new one
		str1 = "goodbye";
		
		String cSharpString1 = "abc";
		//string cSharpString2 = "def";  -> doesn't work in Java
		
		int n1 = 5;
		// using a static method to create an instance
		Integer n2 = Integer.valueOf(n1);
		
		//can call methods on Integer (n2), but not on ints (n1)
		double d2 = n2.doubleValue();

		str1 = str1 + ".";
		
		str1 += "  have a nice day";
		
		System.out.println("str1 = "+str1);
		
		// StringBuilder
		StringBuilder welcomeMsg = new StringBuilder(20);
		welcomeMsg.append("Welcome to our application!  \n");
		welcomeMsg.append("Hope you are having a great day!");
		
		String name = new String("Bob");
		System.out.println(name);
		System.out.println(welcomeMsg);
		
		// comparing strings - Thien's question
		// should NOT use == to compare strings... use .equals instead
		String str2 = "abc";
		String str3 = "abc";
		String str4 = "abc";
		String str5 = "abc";
		
		if (str2 == str3) {
			System.out.println("str2 == str3");
		}
		if (str3 == str4) {
			System.out.println("str3 == str4");
		}
		if (str4 == str5) {
			System.out.println("str4 == str5");
		}
		if (str5 == str2) {
			System.out.println("str5 == str2");
		}
		
		String val1= "bob";
		String val2= "bob";
		if (val1 == val2)
		 System.out.println("true"); 
		else
		 System.out.println("false"); 
		String val3 = "mat";
		String val4 = "mat";
		if (val3 == val4)
		 System.out.println("true"); 
		else
		 System.out.println("false");
		
		
		
		
		
		System.out.println("Bye");
	}

}
