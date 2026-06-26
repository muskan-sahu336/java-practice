package com.muskan;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
//		Hashmap : 
//		->it is key:value pair where values can be duplicate but key must be unique. 
//		-> does not maintain insertion order .
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer, String>();
		
		map.put(1,"Muskan");
		map.put(2,"Mehek");
		map.put(3,"Muskan");
		map.put(4,"Palak");
		map.put(5,"Sia");
		
		System.out.println(map);
	}
}
