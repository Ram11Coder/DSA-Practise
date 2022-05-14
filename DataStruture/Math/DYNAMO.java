package Math;

import java.util.Scanner;

//https://www.codechef.com/problems/DYNAMO
public class DYNAMO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();

		while (t-- > 0) {
			long n = sc.nextLong();

			long a = sc.nextLong();
			long val = (long) (Math.pow(10, n) - 1);

			long s = 2 * val + a + 2;
			System.out.println(s);
			long b = sc.nextLong();

			long c = s - (a + b) - val - 1;
			System.out.println(c);

			long d = sc.nextInt();

			long e = s - (a + b + c + d);
			System.out.println(e);
			int result = sc.nextInt();
			if (result == -1)
				System.exit(0);

			// sc.next();// clear buffer

		}
		sc.close();
	}
}
