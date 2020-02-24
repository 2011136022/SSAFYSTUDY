package com.ssafy.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_토마토 {
	static class Point {
		int y, x;

		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	static int M, N;
	static int[][] map;
	static boolean[][] visited;
	static int[] sx, sy;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int count;
	static int result;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		sy = new int[N*M];
		sx = new int[N*M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = scan.nextInt();
				if(map[i][j] == 1) {
					sy[count] =i;
					sx[count] =j;
					count++;
				}
			}
		}
		
		Queue<Point> q = new LinkedList<>();
		for (int i = 0; i < count; i++) {
			
			q.add(new Point(sy[i],sx[i]));
			visited[sy[i]][sx[i]] = true;
		}
		result = 0;
	 while(!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Point p = q.poll();
				for (int d = 0; d < 4; d++) {
					int ny = p.y + dy[d];
					int nx = p.x + dx[d];
					if(ny >= 0 && ny < N && nx >= 0 && nx < M && map[ny][nx] == 0 && visited[ny][nx] == false) {
						visited[ny][nx] = true;
						map[ny][nx] = 1;
						q.add(new Point(ny,nx));
					}
					
				}
			}
			
			result++;
			
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 0)
					result = 0;
			}
		}
		
		System.out.println(result-1);
	}
}