package Math;

import java.util.Scanner;

public class MXMLCM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcases = sc.nextInt();

		while (testcases-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
			solution(arr, m);

		}
		sc.close();
	}

	private static void solution(int[] arr, int m) {

		int freq[] = new int[m + 1];
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			for (int j = 2; j <= Math.sqrt(ele); j++) {

				if (ele % j == 0) {
					int powerCount = 0;
					while (ele % j == 0) {
						powerCount++;
						ele /= j;
					}
					freq[j] = Math.max(powerCount, freq[j]);
				}
				if (ele == 1)
					break;
			}
			if (ele != 1)
				freq[ele] = Math.max(1, freq[ele]);
		}

		int value = 1;
		int maxValue = 1;

		for (int i = 2; i <= m; i++) {
			int ele = i;
			int localMax = 1;
			for (int j = 2; j <= Math.sqrt(ele); j++) {

				if (ele % j == 0) {
					int powerCount = 0;
					while (ele % j == 0) {
						powerCount++;
						ele /= j;
					}
					if (powerCount > freq[j]) {
						localMax = localMax * (int) Math.pow(j, powerCount - freq[j]);
					}
				}

			}
			if (ele != 1 && freq[ele] == 0)
				localMax *= ele;

			if (localMax > maxValue) {
				maxValue = localMax;
				value = i;
			}

		}
		System.out.println(value);
	}
}
