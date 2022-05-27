package arrays;

import java.util.Arrays;
//https://www.codechef.com/problems/HRDSEQ
public class HRDSEQ {
	public static void main(String[] args) {
		int n = 127;
		solution(n);
	}

	private static void solution(int val) {
		int visited[] = new int[256];// as per constraints
		int arr[] = new int[129];
		for (int i = 2; i < 129; i++) {
			if (visited[arr[i - 1]] != 0)
				arr[i] = i - 1 - visited[arr[i - 1]];
			visited[arr[i - 1]] = i - 1;
		}
		/*
		 * System.out.println(Arrays.toString(arr));
		 * System.out.println(Arrays.toString(visited));
		 */
		int count = 0;

		for (int i = 1; i <= val; i++) {
			if (arr[val] == arr[i])
				count++;
		}
		System.out.println(count);
	}
}
