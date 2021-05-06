package com.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.business.Movie;

public class MovieListApp {
	static List<Movie> movies = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie List App");

		List<String> bands = new ArrayList<>();
		bands.add("The Police");
		bands.add("Harry Styles");
		bands.add("Boston");
		bands.add("Foo Fighters");
		
		System.out.println("List of bands: "+bands);
		
		System.out.println("band in position 1: "+bands.get(1));
		
		System.out.println("removing position 1: "+bands.remove(1));
		
		System.out.println("List of bands: "+bands);
		
		System.out.println("contains Boston? "+bands.contains("Boston"));
		
		System.out.println(bands.set(1, "Grateful Dead"));
		
		System.out.println("List of bands: "+bands);
		
		bands.add(1, "The Eagles");
		
		System.out.println("List of bands: "+bands);
		
		Collections.sort(bands);
		
		System.out.println("List of bands: "+bands);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(7);
		numbers.add(11);
		numbers.add(3);
		
		System.out.println("List of numbers: "+numbers);
		System.out.println("Numbers at index 2: "+numbers.get(2));
		Collections.sort(numbers);
		System.out.println("List of numbers: "+numbers);
		
		System.out.println("ArrayList of Movies");

		movies.add(new Movie(1, "Star Wars", 1977, "PG", "George Lucas"));
		movies.add(new Movie(2, "Guardians of the Galaxy", 2014, "PG-13", "James Gunn"));
		movies.add(new Movie(3, "Ferris Bueller's Day Off", 1986, "PG-13", "John Hughes"));
		System.out.println("Movies:  "+movies);
		//Collections.sort(movies);  implement Comparable interface
		System.out.println("Movie for id 2 = "+getMovieById(2));
		

		System.out.println("Bye");
	}
	
	private static Movie getMovieById(int id) {
		Movie m = null;
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				m = movie;
			}
		}
		
		return m;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
