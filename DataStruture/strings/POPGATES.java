package strings;

public class POPGATES {
	public static void main(String[] args) {
		int k = 3;
		System.out.println(findHeads(new char[] { 'H', 'T', 'T', 'H', 'T' }, k));
		System.out.println(findHeadsOPtimised(new char[] { 'H', 'T', 'T', 'H', 'T' }, k));
		System.out.println(findHeadsOPtimised(new char[] { 'H', 'H', 'T', 'T', 'T', 'H', 'H' }, k));
		System.out.println(findHeadsOPtimised(new char[] { 'T', 'H', 'T', 'H', 'T', 'T' }, k));

	}

	/**
	 * Time complexity -O(n) Observation - 1) if the (n-k)th char is T then we do
	 * not need to filp just find the 'H' in the 0 to till n-k example { 'H', 'H',
	 * 'T', 'T', 'T', 'H', 'H' } k=3
	 * 
	 * n-k the value 'T' then 0 to till n-k 2 H are there
	 * 
	 * output : 2
	 * 
	 * 2) if the (n-k)th char is T then we do not need to filp just find the 'H' in
	 * the 0 to till n-k example { 'H', 'H', 'T', 'H', 'T', 'H', 'H' } k=4
	 * 
	 * n-k the value 'H' then flip 0 to till n-k or find the T
	 * 
	 * o/P - 1
	 * 
	 * 
	 * 
	 * 
	 * @param cArr
	 * @param k
	 * @return
	 */
	private static int findHeadsOPtimised(char[] cArr, int k) {

		char c = (cArr[cArr.length - k] == 'T') ? 'H' : 'T';
		int count = 0;

		for (int i = 0; i < cArr.length - k; i++)
			if (cArr[i] == c)
				count++;
		return count;

	}

	/**
	 * Time complexity -O(n^2)
	 * 
	 * @param cArr
	 * @param k
	 * @return
	 */
	private static int findHeads(char[] cArr, int k) {
		for (int i = cArr.length - 1; i >= cArr.length - k; i--) {
			if (cArr[i] == 'H') {
				for (int j = 0; j < i; j++) {
					cArr[j] = (cArr[j] == 'H') ? 'T' : 'H';
				}
			}
		}
		int count = 0;
		for (int i = 0; i < cArr.length - k; i++) {
			if (cArr[i] == 'H')
				count++;
		}
		return count;
	}
}
