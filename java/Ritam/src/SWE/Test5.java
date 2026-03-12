package SWE;

interface far{
	int h = 20;
	abstract public void engine();
	void acc();
}

abstract class car implements far{
	public abstract void seats();
}

abstract class Testl extends car{
	public void mth() {
		System.out.println("firstm");
	}
	
	public void mth(int a) {
		System.out.println("2nd");
	}
	
	public void mth(boolean a) {
		System.out.println("3rd");
	}
	
	public static void kt() {
		System.out.println("efkck");
	}
	
	public void bike() {
		System.out.println("bike less price");
	}
	
	public void engine() {
		System.out.println("from lower");
	}
	
}

class Testk extends Testl{
	public static  void kt() {
		System.out.println("djqjksc");
	}
	public void bike() {
		System.out.println("bike more price");
	}
	
	public void seats() {
		System.out.println("Here is your seats as cheap price");
	}
	public void acc() {
		System.out.println("brakes failed");
	}
}

public class Test5 {
	public static void main() {
		Testl t = new Testk();
		Testk.kt();
		t.bike();
		car c = new Testk();
		c.engine();
		c.seats();
		c.acc();
	}
}
