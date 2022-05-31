package strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

//https://www.codechef.com/problems/SC31
public class SC31 {

	/**
	 * Use single char array to solve problem
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str[] = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = sc.next();
			}
			solution(str);
		}
		sc.close();
	}

	private static void solution(String[] str) {
		String init = str[0];
		for (int i = 1; i < str.length; i++) {
			init = calculate(init, str[i]);
		}
		int c = 0;
		for (char s : init.toCharArray()) {
			if (s == '1')
				c++;
		}
		System.out.println(c);
	}

	private static String calculate(String s1, String s2) {
		String s = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i))
				s += 0;
			else
				s += 1;
		}
		return s;
	}
}
