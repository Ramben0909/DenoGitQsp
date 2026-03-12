package SWE;

class chalk{
	static String  color = "jam";
}

public class Variable {
      static int a = 10;
      public static void main(String[] args){
    	  chalk myChalk = new chalk();
    	  chalk myChalk1 = new chalk();
    	  chalk myChalk2 = new chalk();
    	  System.out.println(myChalk.color);
    	  System.out.println(myChalk1.color);
    	  System.out.println(myChalk2.color);
    	  myChalk2.color="green";
    	  System.out.println(myChalk.color);
    	  System.out.println(myChalk1.color);
    	  System.out.println(myChalk2.color);
      }
}
