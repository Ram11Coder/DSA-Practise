package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/CASH
public class CASH{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < n; i++)
				sum += sc.nextInt();

			System.out.println(sum % k);

		}
		sc.close();
	}

}
