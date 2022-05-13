package Math;

public class ModularProperty {
	public static void main(String[] args) {

		modularArithmetic();

	}

	private static void modularArithmetic() {

		int n = 1000000;

		long total = (long) n * (n + 1) / 2;// one of the way to avoid integer overflow
		System.out.println(total);

		long a = 10000000000L;// 10^10
		long b = 10000000000L;
		System.out.println(a * b);// Overflow

		int m = 1000000007;
		System.out.println(((a % m) * (b % m)) % m);
	}
}
