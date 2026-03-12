package SWE;

class Iphone{
	private Iphone() {
		
	}
	public static Iphone getObject() {
		return new Iphone();
	}
}

class Phone{
	private Phone() {
		
	}
	static Phone i;
	public static Phone getObject() {
		if(i==null) {
			i=new Phone();
		}
		return i;
	}
}
	
public class Practice2 {
     public static void main(String[] args) {
    	 	Iphone i1 =Iphone.getObject();
    	 	System.out.println("L1");
//    	 	Iphone i2 = new Iphone();
    	 	Phone p = Phone.getObject();
    	 	System.out.println(p);
     }
}
