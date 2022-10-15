package com.trishulMahadev.GeeksForGeeks;

public class reverseString{
	public static void main(String[] args) {
		
		String value = "Hello";
		String rev = "";
		char [] ch = value.toCharArray();

		for (int i = ch.length -1; i >= 0 ; i--) {
			rev += ch[i];
		}

		System.out.println(rev);

	}
}