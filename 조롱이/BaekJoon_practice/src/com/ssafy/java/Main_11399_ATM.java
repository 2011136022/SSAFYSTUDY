package com.ssafy.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11399_ATM {
	static int arrLen;
	static int[] waitTerm;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		arrLen = scan.nextInt();
		waitTerm = new int[arrLen];
		
		for (int i = 0; i < arrLen; i++) {
			waitTerm[i] = scan.nextInt();
		}
		Arrays.sort(waitTerm);
		int last = 1;
		int total = 0;
		for (int i = 0; i < arrLen; i++) {
			for (int j = 0; j < last; j++) {
				total += waitTerm[j];
			}
			last++;
		}
		System.out.println(total);
	}

}
