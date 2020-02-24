package com.ssafy.java;

import java.util.Scanner;

public class SolvingClub_감소수 {
	static int T;
	static int n;
	static int newNum1, newNum2;
	static int newNum;
	static int[] temp;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			String s = scan.next();
			n = Integer.parseInt(s);
			if (n / 10 == 0) {
				newNum = n * n;
				System.out.println(newNum);
			} 
			else {
				newNum1 = Integer.parseInt(s);
				sb.append(s);
				s = sb.reverse() + "";
				newNum2 = Integer.parseInt(s);
				newNum = newNum1 * newNum2;
			}
			String change = newNum+"";
			boolean isTrue = true;
			
			for (int j = 0; j < change.length()-1; j++) {
				if(Integer.parseInt(change.charAt(j)+"") < Integer.parseInt(change.charAt(j+1)+""))
					isTrue = false;
			}
			System.out.println("#" + i + " " + isTrue);
		}

	}

}