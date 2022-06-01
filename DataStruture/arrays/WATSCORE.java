package arrays;

//https://www.codechef.com/problems/WATSCORE
public class WATSCORE {
	public static void main(String[] args) {

		int problem[] = { 5, 4, 2, 7, 5, 2, 4, 7, 8, 9, 2, 10 },
				sol[] = { 50, 30, 10, 20, 80, 20, 5, 15, 40, 10, 15, 100 };

		solution(problem, sol);
	}

	private static void solution(int[] p, int[] s) {
		int map[] = new int[11];
		for (int i = 0; i < p.length; i++)
			if (p[i] <= 8 && map[p[i]] < s[i])
				map[p[i]] = s[i];

		int sum = 0;
		for (int i = 1; i <= 8; i++) {
			sum += map[i];
		}
		System.out.println(sum);
	}
}
