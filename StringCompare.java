package com.example.demo;

public class StringCompare {
	
	public static void main(String[] args) {
		String str1 = "Hello Sid";
		String str2 = "Hello SID";
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		if(str1.equals(str2)) {
			System.out.println("String are Same");
		}
		else {
			System.out.println("String are different");
		}
	}
	public StringCompare() {
		// TODO Auto-generated constructor stub
	}

}
