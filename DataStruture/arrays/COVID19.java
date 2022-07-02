package arrays;
//https://www.codechef.com/problems/COVID19

public class COVID19 {
	public static void main(String[] args) {

		int n = 5, d = 3;
//int peoples[]=new int[n];
		int peoples[] = { 1, 2, 5, 6, 7 };
		int count = 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 1; i < peoples.length; i++) {
			int distance = peoples[i] - peoples[i - 1];
			if (distance > d - 1) {
				if (min > count)
					min = count;

				if (max < count)
					max = count;
				count = 1;
			} else
				count++;
		}
		if (min > count)
			min = count;

		if (max < count)
			max = count;

		System.out.println("Min - " + min + "\n" + "Max - " + max);
	}
}
