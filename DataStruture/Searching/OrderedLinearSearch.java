package Searching;

public class OrderedLinearSearch {
	/**
	 * Time complexity 
	 * Best case - O(1)
	 * Worst case - O(n)
	 * 
	 * Space Complexity - O(1)
	 * 
	 * Advantage: 
	 * Array is sorted so if the array element greater than key then return -1
	 * No need to iterate whole array to check if the element present or not
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int arr[] = { 2, 7, 8, 10, 15 };
		int key = 2;
		System.out.println(solution(arr, key));
		System.out.println(solution(arr, 3));
		System.out.println(solution(arr, 40));
		System.out.println(solution(arr, 15));

	}

	private static int solution(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) 
				return i;

			if (arr[i] > key)
				return -1;
		}
		return -1;
	}
}
