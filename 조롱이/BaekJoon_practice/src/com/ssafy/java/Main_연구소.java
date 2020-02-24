package com.ssafy.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_연구소 {
	static class Point {
		int y, x;

		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	static int N, M;
	static int[][] fixmap, map;
	static boolean[][] visited;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int[] num;
	static int cnt;
	static int max = Integer.MIN_VALUE;
	static ArrayList<Point> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		fixmap = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				fixmap[i][j] = scan.nextInt();
				if (fixmap[i][j] == 0)
					list.add(new Point(i, j));
			}
		}
		num = new int[3];
		combi(list.size(), 3, 0, 0);
		System.out.println(max);

	}

	public static void combi(int n, int r, int start, int count) {
		if (count == r) {
			visited = new boolean[N][M];
			map = new int[N][M];
			cnt = 0;
			for (int i = 0; i < N; i++)
				System.arraycopy(fixmap[i], 0, map[i], 0, M);
			for (int i = 0; i < num.length; i++) {
				Point p = list.get(num[i]);
				map[p.y][p.x] = 1;
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(map[i][j] == 2 && visited[i][j] == false) {
						dfs(i,j);
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(map[i][j] == 0)
						cnt++;
					
				}
			}
			if(max < cnt)
				max = cnt;
			return;
		}
		for (int i = start; i < n; i++) {
			num[count] = i;
			combi(n, r, i + 1, count + 1);
		}
	}
	
	public static void dfs(int y, int x) {
		for (int d = 0; d < 4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			if(ny >= 0 && ny < N && nx >= 0 && nx < M && map[ny][nx] == 0 && visited[ny][nx] == false) {
				visited[ny][nx] = true;
				map[ny][nx] = 2;
				dfs(ny,nx);
			}
		}
	}

}
