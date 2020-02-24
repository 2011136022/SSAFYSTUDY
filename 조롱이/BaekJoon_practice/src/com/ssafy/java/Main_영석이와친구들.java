package com.ssafy.java;
import java.util.Scanner;

public class Main_영석이와친구들 {
	static int N;
	static int M;
	static int L;
	static int[] play;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		L = scan.nextInt();
		play = new int[N];
		int index = 0;
		int count = 0;
		play[0] = 1;
		while (true) {
			if (play[index] == M)
				break;
			if (play[index] % 2 == 1) {
				index += L;
				if (index >= N) {
					index -= N;
					
				}

				play[index]++;
				count++;

			} 
			else {
				index -= L;
				if (index < 0) {
					index += N;
				}
	
				play[index]++;
				count++;

			}
		}
		System.out.println(count);

	}

}
