package Searching;
/**
 * Binary search 
 * Note:
 *  low + (high - low) / 2 - Used to avoid integer overflow
 *
 */
public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9, 13 };
		System.out.println("Iterative approach");
		System.out.println(iterative(arr, 5));
		System.out.println(iterative(arr, 13));
		System.out.println(iterative(arr, 8));
		System.out.println(iterative(arr, 11));

		System.out.println("Recursive approach");
		System.out.println(recursive(arr, 5, 0, arr.length - 1));

		System.out.println(recursive(arr, 13, 0, arr.length - 1));
		System.out.println(recursive(arr, 8, 0, arr.length - 1));
		System.out.println(recursive(arr, 11, 0, arr.length - 1));

	}

	/**
	 * Time complexity - O(log n) Space Complexity -O(1)
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int iterative(int[] arr, int key) {

		int low = 0, high = arr.length - 1, mid = 0;
		while (low <= high) {
			/* mid = (i + j) / 2; */
			mid = low + (high - low) / 2;
			if (arr[mid] == key)
				return mid;

			if (arr[mid] > key)
				high = mid - 1;
			if (arr[mid] < key)
				low = mid + 1;
		}

		// If we want the position where element should present then return i
		return -1;
	}

	/**
	 * Time complexity - O(log n) Space Complexity -O(log n)
	 * 
	 * @param arr
	 * @param key
	 * @param low
	 * @param high
	 * @return
	 */
	public static int recursive(int[] arr, int key, int low, int high) {
		if (low > high)
			return -1;
		int mid = low + (high - low) / 2;
		if (arr[mid] == key)
			return mid;

		if (arr[mid] > key)
			return recursive(arr, key, low, mid - 1);

		return recursive(arr, key, mid + 1, high);

	}
}
