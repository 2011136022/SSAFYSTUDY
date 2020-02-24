package com.ssafy.java;

import java.util.Scanner;

public class Main_2941_크로아티아알파벳 {
	static String compare[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		input = scan.next();

		for (int i = 0; i < 8; i++) {
			if(input.contains(compare[i])) {
				input = input.replace(compare[i], "0");
			}
		}
		System.out.println(input.length());	
	}
}
