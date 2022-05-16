package arrays;

import java.util.Arrays;

/**
 * Given height of n buildings, find out hoe many units of water can be stored
 * in between the buildings. Consider width of each building to be 1 unit
 * 
 * Trapping rain water
 * 
 * @author thulasiraman
 *
 */
public class RainWater {
	public static void main(String[] args) {

		int[] heights = { 0, 1, 2, 0, 0, 3, 1, 0, 3 };
		bruteForce(heights, heights.length);
		solution(heights, heights.length);
	}

	private static void solution(int[] heights, int n) {
		int left[] = new int[n], right[] = new int[n];
		// To find and update left Max
		left[0] = heights[0];
		for (int i = 1; i < n; i++) {
			if (heights[i] >= left[i - 1])
				left[i] = heights[i];
			else
				left[i] = left[i - 1];
		}
		// System.out.println(Arrays.toString(left));
		// To find and update Right Max
		right[n - 1] = heights[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (heights[i] >= right[i + 1])
				right[i] = heights[i];
			else
				right[i] = right[i + 1];
		}
		// System.out.println(Arrays.toString(right));
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			result += Math.min(left[i], right[i]) - heights[i];
		}
		System.out.println(result);
	}

	/**
	 * Time complexity - O(n^2) Space complexity - O(1)
	 * 
	 * @param heights
	 * @param n
	 */
	private static void bruteForce(int[] heights, int n) {
		int result = 0;
		for (int i = 1; i < n - 1; i++) {
			int leftMax = heights[i], rightMax = heights[n - 1];
			// find the leftMax
			for (int j = i - 1; j >= 0; j--) {
				if (heights[j] >= leftMax) {
					leftMax = heights[j];
				}

			}
			// find the rigthMax
			for (int j = i; j <= n - 1; j++) {
				if (heights[j] >= rightMax) {
					rightMax = heights[j];
				}
			}

			result += Math.min(leftMax, rightMax) - heights[i];
		}
		System.out.println(result);
	}

}
