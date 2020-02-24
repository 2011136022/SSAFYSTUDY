package com.ssafy.java;

import java.util.Scanner;

public class Main_섬의개수 {
	static int w, h;
	static int[][] map;
	static boolean[][] visited;
	static int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if(h==0 && w ==0) {
				break;
			}
			map = new int[h][w];
			visited = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			
			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && visited[i][j] == false) {
						visited[i][j] = true;
						
						dfs(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

	public static void dfs(int y, int x) {
		for (int d = 0; d < 8; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			if (ny >= 0 && ny < h && nx >= 0 && nx < w && map[ny][nx] == 1 && visited[ny][nx] == false) {
				visited[ny][nx] = true;
	
				dfs(ny, nx);
			}
		}
	}

}
