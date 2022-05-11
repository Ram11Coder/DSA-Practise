package Math;

public class FactorsCount {
	public static void main(String[] args) {

		factCount(12);
		factCount(31);

	}

	private static void factCount(int num) {
		int count = 0;

		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (num / i == i)
					count += 1;
				else
					count += 2;
			}
		}
		System.out.println("Factor count of "+num +" is "+count);
	}
}
