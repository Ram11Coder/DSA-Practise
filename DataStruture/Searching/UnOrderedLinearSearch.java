package Searching;

public class UnOrderedLinearSearch {
	/*
	 * Time complexity 
	 * Best case - O(1)
	 * Worst case - O(n)
	 * 
	 * Space Complexity - O(1)
	 */
	public static void main(String[] args) {

		int arr[] = { 3, 25, 6, 36, 5 };
		int key = 25;
		System.out.println(solution(arr, key));

	}

	private static int solution(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
