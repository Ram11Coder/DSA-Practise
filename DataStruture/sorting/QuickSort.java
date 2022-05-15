package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 9, 8, 7, 2 };
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = partition(arr, left, right);
		quicksort(arr, left, pivot - 1);
		quicksort(arr, pivot + 1, right);
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1, temp;
		for (int j = left; j <= right - 1; j++) {
			if (pivot >= arr[j]) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		temp = arr[right];
		arr[right] = arr[i + 1];
		arr[i + 1] = temp;

		return i + 1;
	}
}
