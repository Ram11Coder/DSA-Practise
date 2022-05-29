package arrays;

import java.util.Scanner;

//https://www.codechef.com/problems/CLEANUP
public class CLEANUP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int jobs[] = new int[n + 1];
			int m = sc.nextInt();
			int finsihedJobs[] = new int[m];
			for (int i = 0; i < finsihedJobs.length; i++)
				jobs[sc.nextInt()] = 1;

			int unfinishedJobs[] = new int[n - finsihedJobs.length];
			for (int i = 1, j = 0; i < jobs.length; i++)
				if (jobs[i] == 0)
					unfinishedJobs[j++] = i;

			for (int i = 0; i < unfinishedJobs.length; i += 2)
				System.out.print(unfinishedJobs[i] + " ");
			System.out.println();

			for (int i = 1; i < unfinishedJobs.length; i += 2)
				System.out.print(unfinishedJobs[i] + " ");
			System.out.println();
		}
		sc.close();
	}
}
