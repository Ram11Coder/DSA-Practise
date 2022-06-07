package strings;

public class PRFXGD {
	public static void main(String[] args) {

		solution("abcdefagahai", 0, 1);
		solution("abcdefagahai", 1, 1);
		solution("abcdefagahai", 2, 1);

	}

	private static void solution(String str, int k, int r) {
		int freq[] = new int[26];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
			if (freq[str.charAt(i) - 'a'] > r) {
				if (k-- > 0) {
					freq[str.charAt(i) - 'a']--;
				} else
					break;
			} else
				count++;
		}

		System.out.println(count);
	}

}
