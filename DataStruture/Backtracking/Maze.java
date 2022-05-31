package Backtracking;

import java.util.Arrays;

public class Maze {
	public static void main(String[] args) {
		int maze[][] = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 1, 0, 1 }, { 0, 0, 0, 1 } };
		int x = 0, y = 0;
		int result[][] = new int[maze.length][maze.length];
		solveMaze(maze, x, y, result);

		for (int[] res : result) {
			System.out.println(Arrays.toString(res));
		}
	}

	private static int solveMaze(int[][] maze, int x, int y, int[][] result) {

		if (x == maze.length - 1 && y == maze.length - 1) {
			result[x][y] = 1;
			return 1;
		}
		if (isValid(maze, x, y) == 1) {
			result[x][y] = 1;

			if (solveMaze(maze, x + 1, y, result) == 1)
				return 1;

			if (solveMaze(maze, x, y + 1, result) == 1)
				return 1;

			result[x][y] = 0;
		}
		return 0;
	}

	private static int isValid(int[][] maze, int x, int y) {
		if (x >= 0 && x <= maze.length - 1 && y >= 0 && y <= maze.length - 1 && maze[x][y] == 1)
			return 1;
		return 0;
	}
}
