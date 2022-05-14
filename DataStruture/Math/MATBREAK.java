package Math;
//https://www.codechef.com/problems/MATBREAK
public class MATBREAK {
	public static void main(String[] args) {

		int n = 3;
		int mod = 1000000007;
		long res = 0;
		long a = 2;
		long p;
		for (int i = 1; i <= n; i++) {
			p = power(a, 2 * i - 1, mod);
			res = (res + p) % mod;
			a = (a * p) % mod;
		}
		System.out.println(res);
	}

	private static long power(long x, long y, int m) {
		x %= m;

		if (x == 0) {
			return 0;
		}
		long result = 1;
		while (y > 0) {
			if ((y & 1) == 1)
				result = (((result * x) % m) + m) % m;
			y >>= 1;
			x = (((x * x) % m) + m) % m;
		}

		return result % m;
	}
}
