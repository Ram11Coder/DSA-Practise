package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 6, 9, 8, 7 };

		sort(arr, arr.length);

	}

	private static void sort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
