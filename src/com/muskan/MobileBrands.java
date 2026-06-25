package com.muskan;

import java.util.LinkedList;

public class MobileBrands {
	public static void main(String[] args) {
		LinkedList<String> brands = new LinkedList<String>();
		brands.add("Apple");
		brands.add("Realme");
		brands.add("Vivo");
		brands.add("Google pixel");
		System.out.println("First Brand : "+brands.getFirst());
		System.out.println("Last Brand : "+brands.getLast());
	}
}
