package SWE;

public class checka {
	
    checka(){
    	System.out.println("Constructor");
    }
    
    {
    	System.out.println("non static initializer");
    }
    
    public static void main() {
    	System.out.println("Main method");
    	checka c1 = new checka();
    }
}
