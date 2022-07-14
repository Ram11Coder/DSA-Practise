package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/CHFDORA
public class CHFDORA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int arr[][] = new int[n][m];
		int count = m * n;

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < m - 1; j++) {
				int min1 = Math.min(n - 1 - i, m - 1 - j);
				int min2 = Math.min(i, j);
				int min3 = Math.min(min1, min2) + 1;
				for (int k = 1; k < min3; k++) {
					if (arr[i][j - k] == arr[i][j + k] && arr[i - k][j] == arr[i + k][j])
						count++;
					else
						break;
				}
			}
		}
		System.out.println(count);
		sc.close();

	}
}
