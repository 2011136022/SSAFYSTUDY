package com.ssafy.java;
import java.util.Scanner;

public class Main_색종이2 {
	static int T;
	static int map[][];
	static int[] dy = { -1, 1, 0, 0 }; // �긽�븯醫뚯슦
	static int[] dx = { 0, 0, -1, 1 };
	static int y, x;
	static int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		map = new int[102][102];
		// �깋醫낆씠 �쁺�뿭�뿉 1 梨꾩썙 �꽔湲�
		for (int iT = 0; iT < T; iT++) {
			y = scan.nextInt();
			x = scan.nextInt();

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					map[y + i][x + j] = 1;
					
				}
				
			}
		
		}
		
		for (int y = 0; y < 100; y++) {
			for (int x = 0; x < 100; x++) {
				for (int i = 0; i < 4; i++) {
					if(map[y][x] == 1) {
						if(map[y+dy[i]][x+dx[i]]==0)
							count++;
					}
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}
