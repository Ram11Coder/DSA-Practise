package sorting;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 2, 6, 3, 1, 2, 4, 5 };
		int k = 6;
		countingsort(arr, arr.length, k);
	}

	private static void countingsort(int[] arr, int n, int k) {
		int hash[] = new int[k + 1];

		for (int i = 0; i < n; i++) {
			hash[arr[i]]++;
		}

		for (int i = 1; i < hash.length; i++) {
			hash[i] += hash[i - 1];
		}
		int result[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			result[hash[arr[i]] - 1] = arr[i];
			hash[arr[i]]--;
		}
		System.out.println(Arrays.toString(result));
	}
}