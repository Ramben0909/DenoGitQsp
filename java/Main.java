class demo{
	int a =10;
	static int b =20;
}


public class Main {
     public static void main (String args[]){
             System.out.println("Hello world2");
             demo demo1 = new demo();
             demo1.a=30;
             demo1.b=40;
             System.out.println(demo1.a);
             System.out.println(demo1.b);
     }
}