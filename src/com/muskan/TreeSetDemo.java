package com.muskan;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TreeSet : gives sorted order of elements.		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(30);
		tree.add(10);
		tree.add(40);
		tree.add(20);
		System.out.println(tree);
	}
}
