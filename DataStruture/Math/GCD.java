package Math;

public class GCD {
	public static void main(String[] args) {
		int a = 12, b = 16;
		gcd(a, b);
	}

	private static void gcd(int a, int b) {

		System.out.println(euclideanSubtarctorAlgo(a, b));
		System.out.println(euclideanDivisionAlgo(a, b));

	}

	/**
	 * Time complexity - O(n)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int euclideanSubtarctorAlgo(int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a == b)
			return a;
		if (a > b)
			return euclideanSubtarctorAlgo(a - b, b);
		else
			return euclideanSubtarctorAlgo(a, b - a);
	}

	/**
	 * Time complexity -O(log(n))
	 * 
	 * n -> Maximum of a or b
	 * 
	 * 
	 * if a is never gonna be zero then 
	 * if(b==0)
	 * return a;
	 * 
	 * condition is enough
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int euclideanDivisionAlgo(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		return euclideanDivisionAlgo(b, a % b);
	}
}
