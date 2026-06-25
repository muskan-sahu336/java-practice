package com.muskan;

import java.util.Vector;

public class Movies {
	public static void main(String[] args) {
		Vector<String> movies = new Vector<String>();
		movies.add("movie 1");
		movies.add("movie 1");
		movies.add("movie 3");
		movies.add("movie 4");
		movies.add("movie 5");
		System.out.println("Original movies list : "+movies);
		movies.set(1,"movie 2");
		System.out.println("Updated  movies list :"+movies);
	}
}
