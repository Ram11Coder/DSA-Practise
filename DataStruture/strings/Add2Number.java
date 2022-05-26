package strings;

public class Add2Number {
	public static void main(String[] args) {

		String s1 = "9999456", s2 = "756";

		int n1 = s1.length() - 1, n2 = s2.length() - 1;
		int carry = 0;
		String res = "";

		/**
		 * It will handle number greater than 9
		 */
		while (n1 >= 0 && n2 >= 0) {
			int sum = carry + s1.charAt(n1) - '0' + s2.charAt(n2) - '0';
			res = sum % 10 + res;
			carry = sum / 10;
			n1--;
			n2--;
		}

		while (n1 >= 0) {
			int sum = carry + s1.charAt(n1) - '0';

			res = sum % 10 + res;
			carry = sum / 10;

			n1--;
		}

		while (n2 >= 0) {
			int sum = carry + s2.charAt(n2) - '0';

			res = sum % 10 + res;
			carry = sum / 10;

			n2--;
		}

		res = carry + res;
		System.out.println(res);
	}
}
