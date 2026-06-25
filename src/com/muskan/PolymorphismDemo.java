package com.muskan;
// Polymorphism type 2 : method overriding : same method name in different class , but different working or implementation .
class Women{
	void work() {
		System.out.println("Women is working!");
	}
}

class Teacher extends Women{
	void work() {
		System.out.println("Woemn is teaching!");
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		Women w = new Women();
		Teacher t = new Teacher();
		w.work();
		t.work();
	}
}
