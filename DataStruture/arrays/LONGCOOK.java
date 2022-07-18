package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/LONGCOOK
public class LONGCOOK {
	public static void main(String[] args) {
		boolean leap[] = new boolean[401];

		for (int i = 1; i < leap.length; i++) {
			if (i % 4 == 0) {
				if (i % 100 == 0) {
					if (i % 400 == 0)
						leap[i] = true;
				}
			}
		}

		int febDate[] = new int[401];
		febDate[1] = 2;
		for (int i = 2; i < febDate.length; i++) {
			if (leap[i - 1]) {
				febDate[i] = febDate[i - 1] - 2;
				if (febDate[i] <= 0)
					febDate[i] = (febDate[i] + 7) % 8;
			} else {
				febDate[i] = febDate[i - 1] - 1;
				if (febDate[i] <= 0)
					febDate[i] = (febDate[i] + 7) % 8;
			}
		}

		int overLap[] = new int[401];
		for (int i = 1; i < overLap.length; i++) {
			if (overLap[i] == 7) {
				overLap[i] = 1;
			} else if (overLap[i] == 6) {
				if (!leap[i])
					overLap[i] = 1;
			}
		}

		for (int i = 1; i < 401; i++) {
			overLap[i] += overLap[i - 1];
		}
		int val = overLap[400] - overLap[0];
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			long result = 0;
			int m1 = sc.nextInt();
			int y1 = sc.nextInt();
			int m2 = sc.nextInt();
			int y2 = sc.nextInt();

			if (m1 > 2) {
				y1++;
			}
			if (m2 < 2)
				y2--;

			long val1 = overLap[y2 % 400] + (long) (y2 / 400) * val;
			long val2 = overLap[(y1 - 1) % 400] + (long) ((y1 - 1) / 400) * val;
			result = val1 - val2;
			System.out.println(result);
		}
		sc.close();
	}
}
