package Math;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int rotate = sc.nextInt();
		// bruteForceApproach(arr, rotate);
		//rotateArray(arr, rotate);
		optimisedrotateArray(arr, rotate);
		sc.close();
	}

	private static void optimisedrotateArray(int[] arr, int r) {
		int n = arr.length;
		rotate(0, r-1, arr);
		rotate(r, n - 1, arr);
		rotate(0, n - 1, arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int i, int j, int[] arr) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	private static void rotateArray(int[] arr, int r) {
		int n = arr.length;
		for (int i = 0; i < r; i++) {
			int temp = arr[0];
			for (int j = 0; j < n - 1; j++)
				arr[j] = arr[j + 1];

			arr[n - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void bruteForceApproach(int[] arr, int r) {
		int n = arr.length;
		int[] temp = new int[r];
		for (int i = 0; i < r; i++) {
			temp[i] = arr[i];
		}

		for (int i = 0; i < n - r; i++) {
			arr[i] = arr[i + r];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[n - r + i] = temp[i];
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(arr));
	}
}
