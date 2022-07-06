package arrays;

import java.util.Scanner;

public class CHFICRM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int c = 0, c1 = 0, flag = 0;
			for (int i = 0; i < n; i++) {
				int x = arr[i];
				if (x == 5) {
					c++;
				} else if (x == 10) {
					if (c != 0) {
						c--;
						c1++;
					} else {
						flag = 1;
					}

				} else {
					if (c1 != 0)
						c1--;
					else if (c >= 2)
						c = -2;
					else
						flag = 1;
				}
			}
			if (flag == 1)
				System.out.println("NO");
			else
				System.out.println("YES");

		}
		sc.close();
	}
}
