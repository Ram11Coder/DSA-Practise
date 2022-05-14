package strings;

import java.util.Scanner;

//https://www.codechef.com/problems/PSHOT
public class PSHOT {
	public static void main(String[] args) {

		// int arr[] = new int[2 * n];

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int n = sc.nextInt();
		String str = sc.next();
		int oddPos = n, evenPos = n;

		int oddCount = 0, evenCount = 0;
		while (t-- > 0) {

			for (int i = 0; i < 2 * n; i++) {

				if (i % 2 == 0) {
					oddCount += str.charAt(i) - '0';
					oddPos--;
				} else {
					evenCount += str.charAt(i) - '0';
					evenPos--;
				}
				if (oddCount > evenCount + evenPos) {
					System.out.println(i + 1);
					break;
				} else if (oddCount + oddPos < evenCount) {
					System.out.println(i + 1);
					break;
				} else if (oddCount == evenCount && i == 2 * n - 1) {
					System.out.println(i + 1);
					break;
				}

			}
		}
		sc.close();
	}

}
