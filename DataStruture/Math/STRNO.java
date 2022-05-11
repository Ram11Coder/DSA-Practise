package Math;

import java.util.Scanner;

//https://www.codechef.com/problems/STRNO

public class STRNO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(solution(x, k));
		}

	}

	private static int solution(int x, int k) {
		if (calculatePrimeFactor(x) >= k)
			return 1;
		else
			return 0;
	}

	private static int calculatePrimeFactor(int x) {

		int count = 0;
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				while (x % i == 0) {
					count++;
					x /= i;
				}
			}
		}
		if (x > 2)
			count++;

		return count;
	}

}
