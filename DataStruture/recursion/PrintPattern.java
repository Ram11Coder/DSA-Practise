package recursion;
//https://mycode.prepbytes.com/problems/recursion/PATRN

public class PrintPattern {
	public static void main(String[] args) {
		pattern(10);
		System.out.println();
		pattern(16);
	}

	private static void pattern(int n) {
		System.out.print(n + " ");
		if (n <= 0) {
			return;
		}
		pattern(n - 5);
		System.out.print(n + " ");
	}
}
