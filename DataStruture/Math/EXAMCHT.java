package Math;
//https://www.codechef.com/problems/EXAMCHT

public class EXAMCHT {
	public static void main(String[] args) {
		examCheat(2, 14);

	}

	private static void examCheat(int x, int y) {
		int count = 0;
		int num = Math.abs(x - y);
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (num / i == i)
					count += 1;
				else
					count += 2;
			}
		}
		System.out.println(count);
	}
}
