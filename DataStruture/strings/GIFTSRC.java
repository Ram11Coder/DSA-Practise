package strings;

public class GIFTSRC {
	public static void main(String[] args) {

		String str = "LRULLUDU";
		int x = 0, y = 0;
		char cc = '0';
		if (str.charAt(0) == 'R') {
			x++;
			cc = 'R';
		} else if (str.charAt(0) == 'L') {
			x--;
			cc = 'L';
		} else if (str.charAt(0) == 'U') {
			y++;
			cc = 'U';
		} else if (str.charAt(0) == 'D') {
			y--;
			cc = 'D';
		}

		for (int i = 1; i < str.length(); i++) {
			if (cc == 'L' || cc == 'R') {

				if (str.charAt(i) == 'U') {
					cc = 'U';
					y++;
				} else if (str.charAt(i) == 'D') {
					cc = 'D';
					y--;

				}
			} else {

				if (str.charAt(i) == 'R') {
					cc = 'R';
					x++;
				} else if (str.charAt(i) == 'L') {
					cc = 'L';
					x--;
				}
			}
		}
		System.out.println(x + "," + y);
	}
}