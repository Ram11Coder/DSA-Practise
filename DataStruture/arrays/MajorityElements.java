package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElements {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 3, 7, 7, 2, 7, 7 };

		int n = arr.length;
		bruteForce(arr, n);
	}

	private static void bruteForce(int[] arr, int n) {
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
