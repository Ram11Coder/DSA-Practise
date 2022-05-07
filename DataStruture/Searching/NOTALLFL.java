package Searching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NOTALLFL {
	public static void main(String[] args) {
		// int arr[] = { 1, 2, 3, 1, 1, 2, 3, 2, 1, 1, 3 };
		int arr[] = { 1, 1, 2, 2, 3, 1, 2, 3, 1, 1, 2 };
		System.out.println(solution1(arr, 3));
		System.out.println(solution2(arr, 3));
		System.out.println(optimisedSolution(arr, 3));
	}

//Using set
	public static int solution1(int[] arr, int k) {
		int max = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				if (set.size() == k) {
					if (max < (j - i - 1))
						max = j - i - 1;
					break;
				} else {
					set.add(arr[j]);
				}
			}
			set.clear();
		}
		return max;
	}

	// Using hashmap
	public static int solution2(int[] arr, int k) {
		int max = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int diff = 0;
			for (int j = i; j < arr.length; j++) {
				if (map.containsKey(arr[j])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					diff++;
					map.put(arr[j], 1);
				}
				if (diff == k) {
					if (max < j - i)
						max = j - i;
					break;
				}
			}
			map.clear();
		}
		return max;
	}

//2 pointer - sliding window
	public static int optimisedSolution(int[] arr, int k) {
		int currentCount = 0, previousElement = 0;
		int start = 0, end = 0, max = 0;
		int[] freq = new int[100001];
		k = k - 1;
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
			if (freq[arr[i]] == 1)
				currentCount++;
			while (currentCount > k) {
				freq[arr[previousElement]]--;
				if (freq[arr[previousElement]] == 0)
					currentCount--;
				previousElement++;
			}
			if (i - previousElement + 1 >= end - start + 1) {
				end = i;
				start = previousElement;
			//	System.out.println((i - previousElement + 1) + " " + (end - start + 1));
				if (max < i - previousElement + 1)
					max = i - previousElement + 1;
			}

		}

		return max;
	}
}
