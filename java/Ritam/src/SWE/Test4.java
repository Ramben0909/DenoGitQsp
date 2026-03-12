package SWE;

class E{
	int cc;
}

class Cb{
	E e;
	public void getE() {
		this.e= new E();
	}
}

public class Test4 {
    
    public static void main() {
    	Cb c = new Cb();
    	c.getClass();
    	System.out.println(c.e);
    }
}
