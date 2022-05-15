package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 6, 9, 8, 7, 2 };
		sort(arr, arr.length);

	}

	private static void sort(int[] arr, int n) {

		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
