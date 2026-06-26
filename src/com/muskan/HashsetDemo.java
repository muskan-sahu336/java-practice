package com.muskan;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		
		// HashSet : does not allow duplicate , does not maintains insertion order also .
		HashSet<String> names = new HashSet<String>();
		
		names.add("Aditya");
		names.add("Sia");
		names.add("Dia");
		names.add("Aditya");
		
		System.out.println(names);
	}

}
