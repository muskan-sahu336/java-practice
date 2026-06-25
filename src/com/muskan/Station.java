package com.muskan;

import java.util.LinkedList;

public class Station {
	public static void main(String[] args) {
		LinkedList<String> stations = new LinkedList<String>();
		stations.add("Nagpur railway station");
		stations.add("Congress nagar");
		stations.add("Boriwali");
		stations.add("telephone exhcange");
		stations.add("prajapati metro station");
		System.out.println("Original station list : "+stations);
		stations.remove(0);
		System.out.println("Updated station list : "+stations);
	}
}
