package recursion;

import java.util.Arrays;

//https://mycode.prepbytes.com/problems/recursion/BINARY1
public class BINARY1 {
	/**
	 * Print Binary number
	 * 
	 * No consecutive 1 in lexicographical order
	 * 
	 */

	public static void main(String[] args) {
		int n = 4;
		int[] arr = new int[n];
		arr[0] = 0;// Lexicographic order
		binary(arr, n, 1);
		arr[0] = 1;
		binary(arr, n, 1);
	}

	private static void binary(int[] arr, int n, int k) {
		if (k == n) {
			System.out.println(Arrays.toString(arr));

		} else {
			if (arr[k - 1] != 1) {
				arr[k] = 0;
				binary(arr, n, k + 1);
				arr[k] = 1;
				binary(arr, n, k + 1);
			} else {
				arr[k] = 0;
				binary(arr, n, k + 1);
			}
		}

	}
}
