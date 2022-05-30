package arrays;
//maximum sum of k consecutive element in the array

public class SlidingWindowApproach {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 2, 5, 3 };
		int k = 3;
		bruteForce(arr, k);
		optimised(arr, k);
	}

	private static void optimised(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int max = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k] + arr[i];
			if (max < sum)
				max = sum;
		}
		System.out.println(max);

	}

	private static void bruteForce(int[] arr, int k) {
		int n = arr.length, maxSum = 0;
		for (int i = 0; i <= n - k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			if (maxSum < sum) {
				maxSum = sum;
			}
		}
		System.out.println(maxSum);
	}
}
