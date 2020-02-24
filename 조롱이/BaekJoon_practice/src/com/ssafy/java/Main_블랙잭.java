package com.ssafy.java;
import java.util.Arrays;
import java.util.Scanner;

public class Main_블랙잭 {
	static int card;
	static int standard;
	static int[] resultDeck;
	static int[] fillDeck;
	static int max=0;
	static int result;
	static int min;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		card = scan.nextInt();
		standard = scan.nextInt();
		fillDeck = new int[card];
		resultDeck = new int[3];
		for (int i = 0; i < card; i++) {
			fillDeck[i] = scan.nextInt();
		}
		combi(card,3,0,0);
		System.out.println(max);
	}
	public static void combi(int n, int r, int start, int count) {
		if(count==r) {
			for (int i = 0; i < 3; i++) {
				result += resultDeck[i];	
				
			}
			if(max<result && result <= standard)
				max = result;
			result=0;
			
			return;
		}
		for (int i = start; i < n; i++) {
			resultDeck[count] = fillDeck[i];
			combi(n,r,i+1,count+1);
		}
	}

}
