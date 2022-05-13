package Math;

public class ModularExponentiation {
	public static void main(String[] args) {
		int a = 1000, b = 45, m = 90;

		System.out.println(modExpo(a, b, m));
	}

	private static long modExpo(int a, int b, int m) {
		if (a == 0) {
			return 0;
		}
		if (b == 0) {
			return 1;
		}
		long result = 0L;

		if (b % 2 == 0) {
			result = modExpo(a, b / 2, m);
			result = ((result % m) * (result % m)) % m;
		} else {
			result = a % m;
			result = result * modExpo(a, b / 2, m);
		}
		return ((result % m) + m) % m;
	}
}
