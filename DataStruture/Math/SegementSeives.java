package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author thula
 *
 */
public class SegementSeives {
	public static void main(String[] args) {
		int lowerBound = 51, higherBound = 100;
		solution(lowerBound, higherBound);

	}

	private static void solution(int lowerBound, int higherBound) {

		List<Integer> seives = createSeives((int) Math.sqrt(higherBound));

		int size = higherBound - lowerBound + 1;
		int[] primesList = new int[size];
		System.out.println(seives);
		for (int i = 0; i < size; i++)
			primesList[i] = 1;

		for (int i : seives) {

			for (int j = lowerBound; j <= higherBound; j++) {
				if (i == j)
					continue;
				if (j % i == 0)
					primesList[j - lowerBound] = 0;
			}
		}

		for (int i = 0; i < size; i++) {
			if (primesList[i] == 1)
				System.out.println(i + lowerBound);
		}
	}

	private static List<Integer> createSeives(int num) {
		List<Integer> seives = new ArrayList<Integer>();
		System.out.println(num);
		int primes[] = new int[num];

		for (int i = 2; i < num; i++)
			primes[i] = 1;

		for (int i = 2; i < num; i++) {
			if (primes[i] == 1) {
				for (int j = i * i; j < num; j += i) {
					primes[j] = 0;
				}
			}
		}

		for (int i = 2; i < num; i++)
			if (primes[i] == 1)
				seives.add(i);

		return seives;
	}
}
