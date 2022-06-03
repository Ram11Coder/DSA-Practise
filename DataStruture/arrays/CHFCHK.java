package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/CHFCHK
public class CHFCHK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[100];
		while (t-- > 0) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			if (arr[0] < Integer.MAX_VALUE)
				System.out.println(arr[0]);
		}
		sc.close();
	}
}
