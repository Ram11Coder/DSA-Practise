package Math;

class Point {
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

/**
 * Using extended euclidean algorithm to find out modular multiplication inverse
 * 
 * @author thulasiraman
 *
 */
public class ExtendedEuclideanDivisor {

	public static void main(String[] args) {
		int b = 3, m = 7;
		Point x = new Point(), y = new Point();

		int result = euclideanGCD(b, m, x, y);
		if (result != 1) {
			System.out.println("Not able to find MMI");
		} else {

			System.out.println("MMI " + x.getX());
		}

	}

	static int euclideanGCD(int a, int b, Point x, Point y) {
		if (b == 0) {
			x.setX(1);
			y.setX(0);

			return a;
		}
		Point x1 = new Point(), y1 = new Point();

		int result = euclideanGCD(b, a % b, x1, y1);
		x.setX(y1.getX());
		y.setX(x1.getX() - (a / b) * y1.getX());
		return result;
	}
}
