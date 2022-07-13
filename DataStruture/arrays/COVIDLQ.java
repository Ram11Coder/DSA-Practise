package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/COVIDLQ
public class COVIDLQ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

//1st Approach		
		/*
		 * while (t-- > 0) { int n = sc.nextInt(); int arr[] = new int[n];
		 * 
		 * for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt();
		 * 
		 * } int prevIndex = -1, currentIndex = -1, flag = 0; for (int i = 0; i <
		 * arr.length; i++) { if (arr[i] == 1) { if (prevIndex != -1) { currentIndex =
		 * i; int diff = currentIndex - prevIndex; if (diff < 6) { flag = 1; break; }
		 * prevIndex = currentIndex; } else { prevIndex = i; }
		 * 
		 * } }
		 * 
		 * if (flag == 1) System.out.println("No"); else System.out.println("Yes"); }
		 */
//2nd Approach		

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int ele, j = 0;
			for (int i = 0; i < arr.length; i++) {
				ele = sc.nextInt();
				if (ele == 1)
					arr[j++] = i;
			}
			int flag = 0;
			for (int i = j-1; i >= 1; i--) {
				if (arr[i] - arr[i - 1] < 6) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				System.out.println("No");
			else
				System.out.println("Yes");
		}

		sc.close();
	}
}
