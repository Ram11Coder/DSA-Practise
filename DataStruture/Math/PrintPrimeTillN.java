package Math;

public class PrintPrimeTillN {
	public static void main(String[] args) {
		bruteForce(10);
		System.out.println();
		sieveOfEratosthenes(1000);
	}

	/**
	 * 
	 * 
	 * Using this algorithm reduce the time complexity into O(n*log(log(sqrt(n))))
	 * 
	 * we can iterate till sqrt(n)
	 * 
	 * Limitation - Maximum we can create 10^8 size of array to store prime numbers
	 * 
	 * @param num
	 */
	private static void sieveOfEratosthenes(int num) {
		int sieve[] = new int[num + 1];

		sieve[1] = 0;
		for (int i = 2; i <= num; i++) {
			sieve[i] = 1;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (sieve[i] == 1) {
				for (int j = i * i; j <= num; j += i) {
					sieve[j] = 0;
				}
			}
		}
		for (int i = 2; i < sieve.length; i++)
			if (sieve[i] == 1)
				System.out.print(i + " ");
	}

	/**
	 * Time complexity -> O(n*sqrt(n)) --> O(n^(3/2))
	 * 
	 * @param n
	 */
	private static void bruteForce(int n) {
		for (int j = 2; j <= n; j++)
			if (isPrime(j))
				System.out.print(j + " ");

	}

	private static boolean isPrime(int num) {

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}
