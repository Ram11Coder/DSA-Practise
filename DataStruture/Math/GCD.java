package Math;
/**
 * GCD -Greatest common divisor/HCF - Highest common factor
Ex: 12, 16

Need to find the max number that can divide the both of the number 

bruteforce

10,15
int ref=0;
for(int i=2;i<10;i++){
if(10%i==0 && 15%i==0)
ref=i;
}
Time complexicity O(min(a,b))

Can we improve the time complexicity?
Time complexity -sqrt(n) -> n- max of (a, b)

finding the prime factorisation of number is O(sqrt(n))
a -> 12
b -> 18
gcd(a,b)

12 -> 2*2*3
18 -> 2*3*3
common factors of both number 2*3 -> 6


Euclidean's mehods of subtraction

gcd(0,a) -> a   -> 0/a -> a
gcd(0,b) -> b

GCD of 2 smaller number don't change if we subtract smaller number from larger

example 
a -> 25, b -> 15

subract smaller number with larger number

a -> 10, b -> 15
a -> 10, b -> 5
a -> 5, b -> 5

if both number is same then return either any of the one


Time complexity -> O(n)

can we optimise this yes!
Euclidean's mehods of division

 * @author thula
 *
 */
public class GCD {
	public static void main(String[] args) {
		int a = 12, b = 16;
		gcd(a, b);
	}

	private static void gcd(int a, int b) {

		System.out.println(euclideanSubtarctorAlgo(a, b));
		System.out.println(euclideanDivisionAlgo(a, b));

	}

	/**
	 * Time complexity - O(n)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int euclideanSubtarctorAlgo(int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a == b)
			return a;
		if (a > b)
			return euclideanSubtarctorAlgo(a - b, b);
		else
			return euclideanSubtarctorAlgo(a, b - a);
	}

	/**
	 * Time complexity -O(log(n))
	 * 
	 * n -> Maximum of a or b
	 * 
	 * 
	 * if a is never gonna be zero then 
	 * if(b==0)
	 * return a;
	 * 
	 * condition is enough
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int euclideanDivisionAlgo(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		return euclideanDivisionAlgo(b, a % b);
	}
}
