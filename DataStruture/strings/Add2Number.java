package strings;

public class Add2Number {
	public static void main(String[] args) {
		add2Numbers("9999456", "756");
		add2Numbers("1", "1");
		add2Numbers("9", "9");
		add2Numbers("1111111", "11111111");

		add2Numbers("999999", "999999");
		add2Numbers("900009", "99990");
		add2Numbers("0987654321", "1234567890");

	}

	private static void add2Numbers(String s1, String s2) {
		int n1 = s1.length() - 1, n2 = s2.length() - 1;
		int carry = 0, sum = 0;
		String res = "";

		/**
		 * It will handle sum of number greater than 9
		 */
		while (n1 >= 0 && n2 >= 0) {
			sum = carry + s1.charAt(n1) - '0' + s2.charAt(n2) - '0';
			res = sum % 10 + res;
			carry = sum / 10;
			n1--;
			n2--;
		}

		while (n1 >= 0) {
			sum = carry + s1.charAt(n1) - '0';
			res = sum % 10 + res;
			carry = sum / 10;
			n1--;
		}

		while (n2 >= 0) {
			sum = carry + s2.charAt(n2) - '0';
			res = sum % 10 + res;
			carry = sum / 10;
			n2--;
		}
		if (carry != 0)
			res = carry + res;
		System.out.println(res);
	}
}
