package com.muskan;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	public static void main(String[] args) {
		// LinkedHashSet : does not allow duplicate , maintains insertion order also .
		LinkedHashSet<String> names = new LinkedHashSet<String>();
				
		names.add("Aditya");
		names.add("Sia");
		names.add("Dia");
		names.add("Aditya");
		names.add("Mahir");
				
		System.out.println(names);
	}
}
