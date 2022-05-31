package Backtracking;

import java.util.Arrays;

public class NQueen {
	public static void main(String[] args) {
		int chess[][] = new int[4][4];

		nQueen(chess, 0);
		/*
		 * for (int[] c : chess) System.out.println(Arrays.toString(c));
		 */
	}

	private static int nQueen(int[][] chess, int row) {
		if (row == chess.length) {
			for (int[] c : chess)
				System.out.println(Arrays.toString(c));
			return 1;
		}
		for (int i = 0; i < chess.length; i++) {
			if (isValid(chess, row, i)) {
				chess[row][i] = 1;

				if (nQueen(chess, row + 1) == 1) {
					return 1;
				}
				chess[row][i] = 0;
			}
		}
		return 0;
	}
//Add diagonal 
	private static boolean isValid(int[][] chess, int r, int c) {
		for (int i = 0; i < chess.length; i++) {
			if (chess[i][r] == 1 || chess[i][c] == 1)
				return false;
		}
		int x = r, y = c;
		while (x < chess.length && y < chess.length) {
			if (chess[x][y] == 1)
				return false;
			x++;
			y++;
		}
		while (r >= 0 && c >= 0) {
			if (chess[r][c] == 1)
				return false;
			r--;
			c--;
		}

		return true;
	}
}
