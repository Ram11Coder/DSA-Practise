package strings;

//https://www.codechef.com/problems/XYSTR
public class XYSTR {
	public static void main(String[] args) {

		String pairs = "xyxxyxx";
		int pairCount = 0;
		// pairs.length()-1 to avoid index out of bound condition
		for (int i = 0; i < pairs.length() - 1; i += 2)
			if (pairs.charAt(i) == 'x' && pairs.charAt(i + 1) == 'y'
					|| pairs.charAt(i) == 'y' && pairs.charAt(i + 1) == 'x')
				pairCount++;
		System.out.println(pairCount);
	}
}
