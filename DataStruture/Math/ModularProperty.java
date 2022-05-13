package Math;

public class ModularProperty {

	public static void main(String[] args) {

		modularArithmetic();
		System.out.println("Modulo with negative values (-7 % 3 ) -> " + -7 % 3);
		int n = -7, m = 3;
		// To get the correct result with inbuild function
		System.out.println("Correct value : " + (n % m + m) % m);
		System.out.println("Using inbuilt function : " + Math.floorMod(-7, 3));

		modularDivision();
		modularDivisionWithExtendedEuclideanAlgo();
	}

	/**
	 * Naive approach - O(n)
	 */
	private static void modularDivision() {
		int a = 7, m = 5;
		a %= m;
		for (int i = 1; i < m; i++) {
			if (((a % m) * (i % m)) % m == 1) {
				System.out.println("Naive approach to find MMI -> " + i);
				break;
			}
		}
	}

	private static void modularDivisionWithExtendedEuclideanAlgo() {
		int a = 15, b = 3, m = 7;
		Point x1 = new Point(), y1 = new Point();

		int result = ExtendedEuclideanDivisor.euclideanGCD(b, m, x1, y1);
		int x = x1.getX();
		a %= m;
		if (result != 1) {
			System.out.println("MMI doesn't exist so division is not possible");
		} else {
			int inveseB = ((x % m) + m) % m;
			System.out.println("MMI value : " + inveseB);
			System.out.println("Euclidean division final value : " + ((a % m) * (inveseB % m)) % m);
		}
	}

	private static void modularArithmetic() {

		int n = 1000000;

		long total = (long) n * (n + 1) / 2;// one of the way to avoid integer overflow
		System.out.println("Using long data type to avoid integer overflow : " + total);

		long a = 10000000000L;// 10^10
		long b = 10000000000L;
		System.out.println("long overflow : " + a * b);// Overflow

		int m = 1000000007;
		System.out.println("Avoid overflow using modulo " + ((a % m) * (b % m)) % m);
	}
}
