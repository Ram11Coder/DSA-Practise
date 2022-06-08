package strings;

import java.util.Arrays;

//https://www.codechef.com/problems/CORUS
public class CORUS {
	public static void main(String[] args) {

		String str = "stayinghomesaveslife";
		int freq[] = new int[26];
		int k = 3, count = 0;
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
			if (freq[str.charAt(i) - 'a'] > k)
				count++;

		}
		// System.out.println(Arrays.toString(freq));
		System.out.println(count);
	}
}
