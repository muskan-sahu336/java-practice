package com.muskan;

import java.util.Vector;

public class EmpInfo {
	public static void main(String[] args) {
		Vector<String> empinfo = new Vector<String>();
		empinfo.add("Muskan");
		empinfo.add("palak");
		empinfo.add("janvi");
		empinfo.add("Pia");
		empinfo.add("sia");
		System.out.println("Is ther employee named pia in list : "+empinfo.contains("Pia"));
	}
}
