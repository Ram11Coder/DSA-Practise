package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 9, 8, 7, 2, 1 };
		sort(arr, arr.length);
	}

	private static void sort(int[] arr, int n) {
		int min, temp;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (i != min) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
