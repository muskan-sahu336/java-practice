package com.muskan;

import java.util.ArrayList;

public class Marks {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(67);
		marks.add(64);
		marks.add(78);
		marks.add(92);
		marks.add(84);
		System.out.println("Original marks : "+marks);
		marks.set(2,95); // update value 
		System.out.println("Updated Makrs : "+marks);
	}
}
