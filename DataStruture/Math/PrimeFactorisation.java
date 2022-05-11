package Math;

public class PrimeFactorisation {
	public static void main(String[] args) {
		factorisation(10000000);
	}

	private static void factorisation(int n) {
		int sqrt = (int) Math.sqrt(n);

		for (int i = 2; i <= sqrt; i++) {
			int count = 0;
			while (n % i == 0) {

				count++;
				n /= i;
			}
			if(count>0)
			System.out.print(i + "^" + count+" ");
		}
		if (n != 1)
			System.out.print(n+"^"+1);
	}
}
