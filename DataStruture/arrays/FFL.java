package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/FFL
public class FFL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int amt = sc.nextInt();

			int prices[] = new int[n], position[] = new int[n];

			for (int i = 0; i < prices.length; i++) {
				prices[i] = sc.nextInt();
			}
			for (int i = 0; i < position.length; i++) {
				position[i] = sc.nextInt();
			}
			int pos[] = new int[2];
			for (int i = 0; i < pos.length; i++) {
				pos[i] = Integer.MAX_VALUE;
			}
			for (int i = 0; i < position.length; i++) {
				if (prices[i] < pos[position[i]]) {
					pos[position[i]] = prices[i];
				}
			}
			int total = 0;
			for (int i = 0; i < pos.length; i++) {
				total += (pos[i] != Integer.MAX_VALUE) ? pos[i] : 0;// If only one position is choosen
			}
			if (amt + total <= 100)
				System.out.println("Yes");
			else
				System.out.println("No");

		}

		sc.close();

	}
}
