package Searching;

public class TRANSPOINT {
//Question - https://mycode.prepbytes.com/problems/searching/TRANSPOINT
	
	public static void main(String[] args) {
		// int[] arr = { 0, 0, 0, 0, 0 };
		System.out.println(solution(new int[] { 0, 0, 0, 0, 0 }));
		System.out.println(solution(new int[] { 0, 0, 0, 0, 1 }));
		System.out.println(solution(new int[] { 0, 0, 0, 1, 1 }));
		System.out.println(solution(new int[] { 0, 0, 1, 1, 1 }));
		System.out.println(solution(new int[] { 0, 1, 1, 1, 1 }));
		System.out.println(solution(new int[] { 1, 1, 1, 1, 1 }));

	}

	private static int solution(int[] arr) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
				return mid;
			}
			if (arr[mid] == 0) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}
}
