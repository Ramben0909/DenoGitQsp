package SWE;

class Calculator{
	public static void add(double num1,double num2) {
		System.out.println(num1+num2);
	}
	public static void add(double num1,double num2,double num3) {
		System.out.println(num1+num2+num3);
	}
	public static void add(double num1,double num2,double num3,double num4) {
		System.out.println(num1+num2+num3+num4);
	}
	public static void add(double num1,double num2,double num3,double num4,double num5) {
		System.out.println(num1+num2+num3+num4+num5);
	}
	
	public static void m(int a,int b) {
		System.out.println("One main");
	}
	public static void m(int a,double b) {
		System.out.println("three main");
	}
	public static void m(int a,long b) {
		System.out.println("two main");
	}
	public static void main() {
		m(5,6.0);
	}
}
