package arrays;

import java.util.Arrays;

//https://www.codechef.com/problems/CLEANUP
public class CLEANUP {
	public static void main(String[] args) {
		int n = 3;
		int jobs[] = new int[n + 1];
		int finsihedJobs[] = { 3,2 };

		for (int i : finsihedJobs) {
			jobs[i] = 1;
		}
		int unfinishedJobs[] = new int[n - finsihedJobs.length];
		for (int i = 1, j = 0; i < jobs.length; i++) {
			if (jobs[i] == 0)
				unfinishedJobs[j++] = i;
		}
		System.out.println(Arrays.toString(unfinishedJobs));

		for (int i = 0; i < unfinishedJobs.length; i += 2) {
			System.out.print(unfinishedJobs[i] + " ");
		}
		System.out.println();
		for (int i = 1; i < unfinishedJobs.length; i += 2) {
			System.out.print(unfinishedJobs[i] + " ");
		}
		if (unfinishedJobs.length == 1)
			System.out.println();
	}
}
