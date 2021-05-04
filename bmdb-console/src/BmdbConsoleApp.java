
public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("==========================================");
		System.out.println("Welcome to the BMDB Console Application!\n");
//		Movie m1 = new Movie();
//		m1.setId(1);
//		m1.setTitle("Star Wars");
//		m1.setYear(1977);
//		m1.setRating("PG");
//		m1.setDirector("George Lucas");
		Movie m1 = new Movie(1, "Star Wars", 1977, "PG", "George Lucas");
//		Movie m2 = new Movie();
//		m2.setId(2);
//		m2.setTitle("Guardians of the Galaxy");
//		m2.setYear(2014);
//		m2.setRating("PG-13");
//		m2.setDirector("James Gunn");
		Movie m2 = new Movie(2, "Guardians of the Galaxy", 2014, "PG-13", "James Gunn");
//		Movie m3 = new Movie();
//		m3.setId(3);
//		m3.setTitle("Ferris Bueller's Day Off");
//		m3.setYear(1986);
//		m3.setRating("PG-13");
//		m3.setDirector("John Hughes");
		Movie m3 = new Movie(3, "Ferris Bueller's Day Off", 1986, "PG-13", "John Hughes");
		
		Movie m4 = new Movie();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println("\nBye!");
		System.out.println("==========================================");
	}

}
