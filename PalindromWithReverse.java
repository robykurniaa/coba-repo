package com.juaracoding.logikapemrograman;

public class palindrom {

	public static void main(String[] args) {
		String cekPalindrom = "ibu ratna antar ubi";
		
		StringBuilder build = new StringBuilder(cekPalindrom);
		build.reverse();
		String text = build.toString();
		
		System.out.println("Original String " + cekPalindrom);
		System.out.println("Reverse String : " + text);
		if (cekPalindrom.equalsIgnoreCase(text)) {
		System.out.println("Palindrome");
		}else {
			System.out.println("Bukan Palindrome");
		}
				

	}

}
