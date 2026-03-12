package SWE;


class A{
	int a =10;
}

class B extends A{
	int b = 20;
	public void access() {
		System.out.println(super.a);
		System.out.println(this.a);
	}
}

class C extends B{
	
}

class D extends B{
	int a = 30;
}

public class Test2 extends A{
   public static void main(String[] args) {
	   System.out.println("Hello");
	   D obj = new D();
	   obj.access();
	   return;
   }
}
