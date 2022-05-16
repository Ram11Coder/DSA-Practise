package DivideAndConquer;

public class ClosestElement {
	public static void main(String[] args) {

		int target = 1;

		int arr[] = { 2, 5, 6, 7, 10, 11 };

		System.out.println(closestElement(arr, target));

		System.out.println(closestElement_Recursive(arr, 0, arr.length - 1, target));

	}

	private static int closestElement(int[] arr, int target) {

		int low = 0, high = arr.length - 1;

		if (arr[low] > target)
			return arr[low];
		else if (arr[high] < target)
			return arr[high];

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target)
				return arr[mid];
			if (arr[mid] < target) {
				if (mid > 0 && arr[mid + 1] > target)
					return arr[mid];
				low = mid + 1;
			} else {
				if (arr[mid - 1] < target)
					return arr[mid];
				high = mid - 1;

			}

		}

		return -1;
	}

	/**
	 * Implementation Pending
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @param target
	 * @return
	 */
	private static int closestElement_Recursive(int[] arr, int low, int high, int target) {
		int mid = low + (high - low) / 2;
		if (low >= high) {
			return arr[low];
		}

		if (arr[mid] == target)
			return arr[mid];
		if (arr[mid] < target) {
			if (mid > 0 && arr[mid + 1] > target)
				return arr[mid];
			return closestElement_Recursive(arr, mid + 1, high, target);
		} else {
			if (arr[mid - 1] < target)
				return arr[mid-1];
			return closestElement_Recursive(arr, low, mid - 1, target);
		}

	}
}
