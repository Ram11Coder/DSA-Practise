package recursion;

import java.util.Arrays;

public class PrintBinary {
	public static void main(String[] args) {
		int n = 3;
		int[] arr = new int[n];
		solution(arr, n, 0);
	}

	private static void solution(int[] arr, int n, int p) {
		if (p == n) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int i = p; i <= p; i++) {
				arr[i] = 0;
				solution(arr, n, p + 1);
				arr[i] = 1;
				solution(arr, n, p + 1);
			}
		}
	}
}
