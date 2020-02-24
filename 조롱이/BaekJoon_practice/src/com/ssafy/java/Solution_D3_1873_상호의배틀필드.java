package com.ssafy.java;

import java.util.Scanner;

public class Solution_D3_1873_상호의배틀필드 {
	static int T;
	static int H;
	static int W;
	static char[][] map;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static int y,x;
	static int d;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		T = scan.nextInt();
		H = scan.nextInt();
		W = scan.nextInt();
		for (int iT = 1; iT <= T; iT++) {
			d=0;
			for (int i = 0; i < H; i++) {
				String s = scan.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = s.charAt(j);
					if(map[i][j] == '^') {
						y=i;
						x=j;
						d=0;
					}
					else if(map[i][j] == 'v') {
						y=i;
						x=j;
						d=1;
					}
					else if(map[i][j] == '<') {
						y=i;
						x=j;
						d=2;
					}
					else if(map[i][j] == '>') {
						y=i;
						x=j;
						d=3;
					}
				}
			}
//			if()// 명령어 처리
		}
	}
	public static void shoot(int direction) {
		while(map[y+dy[direction]][x+dx[direction]]!='#') {
			map[y+dy[direction]][x+dx[direction]] = '.';
		}
	}
	public static void move(int direction) {
		char temp;
		if(map[y+dy[direction]][x+dx[direction]] =='.' && y+dy[direction]>=0 &&y+dy[direction]<H && x+dx[direction]>=0 &&y+dy[direction]<W) {
			temp = map[y][x];
			map[y][x] = '.';
			y = y+dy[direction];
			x = x+dx[direction];
			map[y][x] = temp;
		}
		
	}

}
