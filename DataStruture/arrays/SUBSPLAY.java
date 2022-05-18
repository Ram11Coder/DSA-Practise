package arrays;

import java.util.Arrays;

//https://www.codechef.com/problems/SUBSPLAY
public class SUBSPLAY {
	public static void main(String[] args) {
		String s = "gldileifid";
		int n = s.length();
		solution(s, n);

	}

	/**
	 * Time complexity - O(n)
	 * 
	 * Space Complexity -O(1)
	 * 
	 * Approach :
	 * 1. Find the minimum possible repeated element 
	 * 2. maximum possible can pickled by a and b, by condition (m+1<=k)
	 * example :
	 * Input : gldileifid
	 *     0 1 2 3 4 5 6 9	
	 * A-> g l d i l e i d
	 *  
	 *     0 1 2 3 4 5 8 9  
	 * B-> g l d i l e i d
	 * 
	 * k-> total count - > 8
	 *  
	 * m -> count of equal character index in the string
	 * above i -> 6,8 differ so
	 * total (8-1 => 7)
	 * 
	 * m=7,k=8
	 * condition (m+1)>=n -> 7+1 >=18
	 *   
	 * @param s
	 * @param n
	 */
	private static void solution(String s, int n) {
		int chars[] = new int[26];// Last where element is occured
		for (int i = 0; i < chars.length; i++)
			chars[i] = -1;

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			int val = chars[s.charAt(i) - 'a'];
			if (val != -1) {
				int diff = i - val - 1;
				if (min > diff) {
					min = diff;
				}
			}
			chars[s.charAt(i) - 'a'] = i;
		}
		//System.out.println(Arrays.toString(chars));
		System.out.println(n - min - 1);
	}
}
