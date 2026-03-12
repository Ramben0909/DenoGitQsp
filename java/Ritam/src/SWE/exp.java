package SWE;

class demo1{
	int a;
	public static void m1() {
		demo1 d = new demo1();
		System.out.println(d.a);
	}
	public void m2() {
		System.out.println(a);
	}
}

public class exp {
	public static void main() {
		demo1 ab = new demo1();
		demo1 ab1 = new demo1();
		demo1 ab2 = new demo1();
		ab1.a=20;
		System.out.println(ab.a);
		System.out.println(ab1.a);
		System.out.println(ab2.a);
	}

}
