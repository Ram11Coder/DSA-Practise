package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/PRICECON
public class PRICECON {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			int arr[] = new int[n];
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] > p)
					sum += arr[i] - p;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
