package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/AMR15A
public class AMR15A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		solution(arr);
		sc.close();
	}

	private static void solution(int[] arr) {

		int lucky = 0, notLucky = 0;
		for (int i : arr)
			if (i % 2 == 0)
				lucky++;
			else
				notLucky++;

		if (lucky > notLucky)
			System.out.println("READY FOR BATTLE");
		else
			System.out.println("NOT READY");
	}
}
