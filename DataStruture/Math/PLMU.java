package Math;

import java.util.Scanner;

//https://www.codechef.com/problems/PLMU
public class PLMU {
	public static void main(String[] args) {
		/*
		 * int n = 3; int arr[] = { 2, 3, 2 };
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			solution(n, arr);
		}
		sc.close();
	}

	/**
	 * There is 0 and 2 only satisfy below condition
	 * 
	 * arr[i]+arr[j]==arr[i]*arr[j]
	 * 
	 * Once calculate the count of 2's and 0's count
	 * 
	 * apply combination ncr =n!/(n-r!)*r! here r is 2
	 * 
	 * so nc2=n!/(n-2!)*2!
	 * 
	 * n!= n*(n-1)*(n-2)! =n*(n-1)*(n-2)! /(n-2!)*2! nc2=n*(n-1)/2
	 * 
	 * 
	 * @param n
	 * @param arr
	 */
	private static void solution(int n, int[] arr) {
		int zeroCount = 0, twosCount = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 0)
				zeroCount++;
			else if (arr[i] == 2)
				twosCount++;
		int result = ((zeroCount * (zeroCount - 1)) / 2) + ((twosCount * (twosCount - 1)) / 2);

		System.out.println(result);

	}
}
