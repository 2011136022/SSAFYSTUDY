package com.ssafy.java;

import java.util.Scanner;

public class Main_적록색약 {
	static char[][] map;
	static char[][] mapForBlind;
	static boolean[][] visited;
	static int N;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static int countM, countMFB;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		map = new char[N][N];
		mapForBlind = new char[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String s = scan.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = s.charAt(j);
				mapForBlind[i][j] = s.charAt(j);
				if(mapForBlind[i][j] == 'G') {
					mapForBlind[i][j] = 'R';
				}
			}
		}
		countM = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j] == false) {
					visited[i][j] = true;
					dfsM(i, j);
					countM++;
				}
			}
		}
		visited = new boolean[N][N];
		countMFB = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j] == false) {
					visited[i][j] = true;
					dfsMFB(i, j);
					countMFB++;
				}
			}
		}
		System.out.println(countM + " " + countMFB);

	}
	public static void dfsM(int y, int x) {
		for (int d = 0; d < 4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			
			if(ny >= 0 && ny < N && nx >= 0 && nx < N && map[ny][nx] == map[y][x] && visited[ny][nx] == false) {
				visited[ny][nx] = true;
				dfsM(ny,nx);
			}
		}
	}
	public static void dfsMFB(int y, int x) {
		for (int d = 0; d < 4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			
			if(ny >= 0 && ny < N && nx >= 0 && nx < N && mapForBlind[ny][nx] == mapForBlind[y][x] && visited[ny][nx] == false) {
				visited[ny][nx] = true;
				dfsMFB(ny,nx);
			}
		}
	}

}
