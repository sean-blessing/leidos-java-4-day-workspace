package com.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the HashMapApp");
		
		//store spanish - english translation map
		Map<String, String> spanishEnglishMap = new HashMap<>();
		spanishEnglishMap.put("uno", "one");
		spanishEnglishMap.put("dos", "two");
		spanishEnglishMap.put("quatro", "four");
		spanishEnglishMap.put("cinco", "five");
		spanishEnglishMap.put("tres", "three");
		spanishEnglishMap.put("1", "one");
		System.out.println("spanishEnglishMap: "+spanishEnglishMap);
		spanishEnglishMap.remove("1");
		System.out.println("spanishEnglishMap: "+spanishEnglishMap);
		
		Set<String> keys = spanishEnglishMap.keySet();
		for (String key: keys) {
			System.out.println(key + ": "+ spanishEnglishMap.get(key));
		}
		

		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
