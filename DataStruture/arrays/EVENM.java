package arrays;

class Parent {
	Parent() {
		System.out.println("Parent is " + this);
	}
}

class Child extends Parent {
	Child() {
		System.out.println("Child is " + this);
	}
}

public class EVENM {
	public static void main(String[] args) {
		new Child();
		/*
		 * try { int a=10,b=10; System.out.println(a/b); int x=10,y=10;
		 * System.out.println(x/y); } catch (ArithmeticException e) { // TODO: handle
		 * exception } catch (ArithmeticException e) { // TODO: handle exception }
		 */
		String s1="Hello",s2="World";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1=s2;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s2=s1.concat(s2);//It will create new object pointing to s2
		System.out.println(s2);
		System.out.println(s1.concat(s2));
	}
}
