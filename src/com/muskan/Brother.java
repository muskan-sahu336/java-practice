package com.muskan;

//Hierarchical Inheritance
class parent{
	public void house() {
		System.out.println("2bhk");
	}
}

class sister extends parent{
}

class sister2 extends sister{
	
}

public class Brother extends parent{
	public static void main(String[] args) {	
		Brother bro = new Brother();
		bro.house();
		sister sis = new sister();
		sis.house();
	}
	
}
