package Math;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 27;
		bruteForce(n);
		optimised_bruteForce(n);
		prime_Sqrt(n);
	}

	/**
	 * Time complexity - O(n)
	 * 
	 * @param n
	 */
	private static void bruteForce(int n) {
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not a prime number");

	}

	/**
	 * Time complexity - O(n/2) ~ O(n)
	 * 
	 * @param n
	 */
	private static void optimised_bruteForce(int n) {
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not a prime number");

	}

	/**
	 * n is a non-prime
	 * 
	 * n=a*b example n -> 36 factors : a -> 6, b-> 6 a -> 4 b-> 9
	 * 
	 * 1<=a<=b<n n=a*b =4*9 >a^2 -> 4^2 - 16
	 * 
	 * 
	 * 
	 * we have 2 factor a-> smaller factor , b-> Greater factor smaller factor of n
	 * is always be less than or equal sqrt(n)
	 * 
	 * n>=a^2 1.Smaller factor a<=sqrt(n)
	 * 
	 * n=a*b
	 * 
	 * 2.Larger factor b=n/a
	 * 
	 * 
	 * note : if we are not able to find any factor in below sqrt(n) then there is
	 * no possibility to find larger factor in (sqrt(n)+1 to n) Beacuse bigger
	 * factor dependng upon smaller factor
	 * 
	 * Time complexity - O(sqrt(n))
	 * 
	 * @param n
	 */
	private static void prime_Sqrt(int n) {
		boolean flag = false;
		//we can write i*i<=n also
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not a prime number");

	}
}
