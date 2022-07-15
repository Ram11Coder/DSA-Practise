package arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.codechef.com/problems/CHCBOX
public class CHCBOX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1];
		int max = -1;

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		// ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (arr[i] != max) {
				count++;
			} else {
				list.add(count);
				count = 0;
			}
		}
		if (count != 0)
			list.set(0, count + list.get(0));
		// stack.addFirst(stack.getFirst()+count);
		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			result += Math.max(list.get(i) - (n / 2) + 1, 0);
		}
		System.out.println(result);
		sc.close();

	}
}
