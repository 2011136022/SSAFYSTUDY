package com.ssafy.java;

import java.util.Scanner;

public class Main_직사각형을만드는법 {
	static int n;
	static int total;
	static int index;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		if(n==1)
			total = 1;
		else if(n==2)
			total = 2;
		else if(n==3)
			total = 3;
		else if(n%2 == 0)
			total = 2 + (n/2-1)*3;
		else {
			total = n + n/3;
		}
		System.out.println(total);

	}

}
