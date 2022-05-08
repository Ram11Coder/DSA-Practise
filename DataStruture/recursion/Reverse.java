package recursion;

public class Reverse {

	public static void main(String[] args) {
		String str = "hello";
		printReverse(str, 0);
	}

	private static void printReverse(String str, int length) {
		if (length == str.length()) {
			return;
		}
		printReverse(str, length + 1);
		System.out.print(str.charAt(length));
		// printReverse(str, length+1);
	}
}