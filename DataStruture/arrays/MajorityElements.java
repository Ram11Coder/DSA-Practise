package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElements {
	public static void main(String[] args) {
		int[] arr = { 7, 2, 3, 7, 2, 7, 7 };

		int n = arr.length;
		bruteForce(arr, n);
		bruteforceWithSort(arr, n);
		hashApproach(arr, n);
		mooresVotingAlo(arr, n);
	}

	/**
	 * Time complexity - O(n^2)
	 * 
	 * Space complexity - O(1)
	 * 
	 * @param arr
	 * @param n
	 */
	private static void bruteForce(int[] arr, int n) {
		int major = 0, maxCount = n / 2;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (maxCount < count) {
				major = i;
			}
		}
		System.out.println("Majority element : " + arr[major]);
	}

	/**
	 * Time complexity - O(n*log(n))
	 * 
	 * Space complexity - O(1)
	 * 
	 * @param arr
	 * @param n
	 */
	private static void bruteforceWithSort(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println("Majority element : " + arr[n / 2]);
	}

	/**
	 * Time complexity - O(n)
	 * 
	 * Space complexity - O(1)
	 * 
	 * @param arr
	 * @param n
	 */
	private static void mooresVotingAlo(int[] arr, int n) {

		int major = 0;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[major] == arr[i]) {
				count++;
			} else
				count--;
			if (count == 0) {
				major = i;
				count = 1;
			}
		}
		System.out.println("Majority element : " + arr[major]);
	}

	/**
	 * Time complexity -O(n)
	 * 
	 * Space complexity -O(n)
	 * 
	 * @param arr
	 * @param n
	 */
	private static void hashApproach(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);

			} else {
				map.put(arr[i], 1);
			}
		}

		int limit = n / 2;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > limit) {
				System.out.println("Majority element : " + entry.getKey());
				break;
			}
		}
	}
}
