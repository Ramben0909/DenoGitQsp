package SWE;
class Parent {
	Parent(int a){
		System.out.println("Parent");
	}
	public void pr() {
		System.out.println("parent method");
	}
}

class child extends Parent{
	child(int a){
		super(a);
		System.out.println("child ist");
	}
	child(boolean b){
		super(9);
		System.out.println("child 2nd");
	}
	child(double d){
		super(9);
		System.out.println("child 3rd");
	}
	@Override
	public void pr() {
		System.out.println("child method");
	}
}

class Relience{
	int a =2;
}

class Laptops extends Relience{
	int c=3;
}

class Phones extends Relience{
	
}


public class Test3 {
	public static void main(String[] args) {
		
//		System.out.println("Main starts");
//		child c = new child(2.0); 
//		Parent p = new child(3);
//        System.out.println(p instanceof child);
//        child c1 = null;
//        if(p instanceof child) {
//        	c= (child)p;
//        	System.out.println("Downcasted");
//        }
//        System.out.println("main ends");
		
//		Relience p = new Laptops();
//		Relience r= new Laptops();
//		Laptops l = (Laptops)p;
//		System.out.println(l.c);
//		Parent c2= new Parent(5);
		
        Parent c2 = new child(4);
		c2.pr();
		
		
		
	}
}
