package Math;

public class StringModulo {
	public static void main(String[] args) {

		String num = "123456781234567812345678";
		int mod = 4;
		mod(num, mod);
	}

	private static void mod(String n, int m) {
		int sum = 0;
		for (int i = 0; i < n.length(); i++)
			sum = (sum * 10 + n.charAt(i) - '0') % m;

		System.out.println(sum);
	}
}
