package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//https://www.codechef.com/problems/CHEFRECP
public class CHEFRECP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
//APproach 1

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			Map<Integer, Integer> countChecker = new HashMap<Integer, Integer>();
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (countChecker.containsKey(entry.getValue())) {
					countChecker.put(entry.getValue(), countChecker.get(entry.getValue()) + 1);
				} else {
					countChecker.put(entry.getValue(), 1);
				}
			}
			int flag = 0;
			for (Entry<Integer, Integer> countMap : countChecker.entrySet()) {
				if (countMap.getValue() > 1) {
					flag = 1;
					break;
				}
			}

			if (flag == 1) {
				System.out.println("No");
				continue;
			}
			int count = 1;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] != arr[i]) {
					if (count != map.get(arr[i - 1])) {
						flag = 1;
						break;
					} else
						count = 1;
				} else
					count++;
			}
			if (flag == 0) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}

		// Approach 2
		/*
		 * while (t-- > 0) { int n = sc.nextInt(); int m = 1000; int arr[] = new int[n],
		 * freq[] = new int[m + 1], uniq[] = new int[m + 1]; for (int i = 0; i < n; i++)
		 * { arr[i] = sc.nextInt(); }
		 * 
		 * for (int i = 0; i < arr.length; i++) { freq[arr[i]]++; } int flag = 0; for
		 * (int i = 0; i < m + 1; i++) { if (freq[i] > 0) uniq[freq[i]]++; } for (int i
		 * : uniq) { if (i > 1) { flag = 1; break; } }
		 * 
		 * if (flag == 1) { System.out.println("No"); } else { int vistied[] = new int[m
		 * + 1]; vistied[arr[0]] = 1; int i = 0; for (i = 1; i < n; i++) { if (arr[i] ==
		 * arr[i - 1]) continue;
		 * 
		 * if (vistied[arr[i]] == 1) break; vistied[arr[i]] = 1; } if (i == n)
		 * System.out.println("Yes"); else System.out.println("No");
		 * 
		 * }
		 * 
		 * }
		 */
		sc.close();
	}
}
