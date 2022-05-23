package strings;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "bcadbcae";
		bruteForce(str);
		optimised(str);
	}

	private static void optimised(String str) {
		int freq[] = new int[26];
		char[] cArr = str.toCharArray();
		for (char c : cArr)
			freq[c - 'a']++;
		boolean flag = false;
		for (char c : cArr) {
			if (freq[c - 'a'] == 1) {
				System.out.println("First non repeating character :" + c);
				flag = true;

				break;
			}
		}
		if (!flag)
			System.out.println("No non repeating elements");

	}

	/**
	 * Time complexity O(n^2)
	 * 
	 * @param str
	 */
	private static void bruteForce(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			int flag = 0;
			for (int j = 0; j < n; j++) {
				if (j != i && str.charAt(j) == c) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("First non repeating character :" + c);
				break;
			}
		}
	}
}
