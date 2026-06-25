package com.muskan;

class person{
	String name;
}

public class Student extends person{
	
	String course;
	
	Student(String name, String course){
		this.course = course;
		this.name = name;
		System.out.println("Name :"+name+"\tCourse :"+course);
}	
	public static void main(String[] args) {
		Student st1 = new Student("Muskan","CSE");
	}
}
