package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/COVIDLQ
public class COVIDLQ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int prevIndex = -1, currentIndex = -1, diff = -1,flag=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {

				if (prevIndex != -1) {
					currentIndex = i;
					diff = currentIndex - prevIndex;
				} else
					prevIndex = i;
				
				if(diff!=-1&& diff<6) {
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
