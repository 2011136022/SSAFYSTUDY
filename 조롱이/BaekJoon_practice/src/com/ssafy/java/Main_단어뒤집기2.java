package com.ssafy.java;
import java.util.Scanner;
import java.util.Stack;

public class Main_단어뒤집기2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		StringBuffer sb = new StringBuffer();
		String s = scan.nextLine();
		int index = 0;
		while(index<s.length()) {
			if(s.charAt(index) == '<') {
				System.out.print(sb.reverse());
				sb.delete(0, sb.length());
				while(s.charAt(index) != '>') {
					System.out.print(s.charAt(index));
					index++;
				}
				System.out.print(s.charAt(index));
				index++;
			}
			else if(s.charAt(index) == ' ') {
				
				System.out.print(sb.reverse());
				sb.delete(0, sb.length());
				index++;
				System.out.print(' ');
			}
			else {
				sb.append(s.charAt(index));
				if( index == s.length()-1) {
					System.out.println(sb.reverse());
				}
				index++;
			}
			
		}
		
	}

}
