package com.ssafy.java;
import java.util.Scanner;

public class Main_크로스워드 {
	static char[][] word;
	static int a,b;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		//boolean is = true;	
		word = new char[s2.length()][s1.length()];
		
		f:for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					b=i;
					a=j;
					
					break f;
				}
			}
			
		}
		
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if(j==b) {
					System.out.print(s2.charAt(i));
				}
				else if(i==a) {
					System.out.print(s1.charAt(j));
				}
				else {
					System.out.print('.');
				}
				
			}
			System.out.println();
		}
	}

}
