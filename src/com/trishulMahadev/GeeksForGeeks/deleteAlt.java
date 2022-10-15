package com.trishulMahadev.GeeksForGeeks;

public class deleteAlt{
	public static void main(String[] args) {
		String value = "ShivaKumar";
		char [] ch = value.toCharArray();
		String rev = "";

		for (int i = 0;i < value.length();i++) {

			if (i % 2 == 0) {
				rev += ch[i];
			}
			
		}

		System.out.println(rev);
	}
}