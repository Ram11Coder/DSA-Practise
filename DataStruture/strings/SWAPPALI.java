package strings;

import java.util.Scanner;

public class SWAPPALI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			char carr[] = sc.next().toCharArray();
			int count = 0;
			boolean flag = true;
			boolean visited[] = new boolean[n];
			for (int i = 0; i < n / 2; i++) {
				if (carr[i] != carr[n - i - 1]) {
					if (carr[i + 1] == carr[n - i - 1] && !visited[i] && !visited[i + 1] && i + 1 != n - i - 1) {
						swap(carr, i, i + 1);
						count++;
						visited[i] = visited[i + 1] = true;
					} else if (carr[i] == carr[n - i - 2] && !visited[n - i - 1] && !visited[n - i - 2]
							&& i != n - i - 2) {
						swap(carr, n - i - 1, n - i - 2);
						count++;

						visited[n - i - 1] = visited[n - i - 2] = true;
					} else {
						flag = false;
						break;
					}
				}

			}
			if (flag) {
				System.out.println("YES\n" + count);
			} else {
				System.out.println("NO");
			}

		}
		sc.close();
	}

	private static void swap(char[] carr, int i, int j) {
		char t = carr[i];
		carr[i] = carr[j];
		carr[j] = t;
	}
}

/**
 * Code backup: public static void main(String[] args) { Scanner sc = new
 * Scanner(System.in); int t = sc.nextInt(); while (t-- > 0) { int n =
 * sc.nextInt(); char carr[] = sc.next().toCharArray(); int visited = 0, count =
 * 0; for (int i = 0; i < n / 2; i++) { if (carr[i] != carr[n - i - 1] &&
 * visited != i) { if (carr[i + 1] == carr[n - i - 1]) { swap(carr, i, i + 1);
 * count++; visited = i + 1; } else if (carr[i] == carr[n - i - 2] && visited !=
 * n - i - 2 + 1) { swap(carr, n - i - 1, n - i - 2); count++; visited = n - i -
 * 2; } else { visited = -1; break; } }
 * 
 * } if (visited != -1) { System.out.println("YES\n" + count); } else {
 * System.out.println("NO"); }
 * 
 * } }
 */
