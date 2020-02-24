package com.ssafy.java;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_2583 {
	static int row, col;
	static int forFor;
	static int[][] map;
	static boolean[][] visited;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static int width;
	static int count;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		row = scan.nextInt();
		col = scan.nextInt();
		map = new int[row][col];
		visited = new boolean[row][col];
		forFor = scan.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < forFor; i++) {
			int startX = scan.nextInt();
			int startY = scan.nextInt();
			int finishX = scan.nextInt();
			int finishY = scan.nextInt();
			for (int j = startY; j < finishY; j++) {
				for (int k = startX; k < finishX; k++) {
					map[j][k] = 1;
				}
			}
		}
//		for (int j = 0; j < row; j++) {
//			for (int k = 0; k < col; k++) {
//				System.out.print(map[j][k]);
//			}
//			System.out.println();
//		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] == 0 && visited[i][j] == false) {
					visited[i][j] = true;
					width = 1;
					dfs(i,j);
					
					count++;
					pq.add(width);
					
				}
				
			}
			
		}
		
		System.out.println(count);
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+" ");
		}
		
	}
	public static void dfs(int y, int x) {
		for (int d = 0; d < 4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			
			if(ny >= 0 && ny < row && nx >= 0 && nx < col &&
					map[ny][nx] == 0 && visited[ny][nx] == false) {
				visited[ny][nx] = true;
				width++;
				dfs(ny,nx);
				
			}
		}
	}

}
