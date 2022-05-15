package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 6, 9, 8, 7, 2 };
		mergesort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergesort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		mergesort(arr, left, mid);
		mergesort(arr, mid + 1, right);
		merge(arr, left, right, mid);
	}

	private static void merge(int[] arr, int left, int right, int mid) {
		int n1 = mid - left + 1, n2 = right - mid;
		int leftArr[] = new int[n1], rightArr[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			leftArr[i] = arr[i + left];
		}

		for (int i = 0; i < n2; i++) {
			rightArr[i] = arr[i + mid + 1];
		}
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j])
				arr[k++] = leftArr[i++];
			else
				arr[k++] = rightArr[j++];
		}

		while (i < n1)
			arr[k++] = leftArr[i++];

		while (j < n2)
			arr[k++] = rightArr[j++];

	}
}
