package recursion;
/**
 *
 * Time complexity -O(N*log(n))
 * Space complexity -logn
 */
public class LexicalCombination {
	/*
	 * p -> To avoid repetition of same combination
	 * 
	 * */
	public static void main(String[] args) {
		String str = "1 ";
		int p = 2, n = 12;
		combination(str, p, n);
	}

	private static void combination(String str, int p, int n) {
		if (n == 1) {
			System.out.println(str);
		} else {
			for (int i = p; i <= n; i++) {
				if (n % i == 0)
					combination(str + i + " ", i, n / i);
			}
		}
	}
}
