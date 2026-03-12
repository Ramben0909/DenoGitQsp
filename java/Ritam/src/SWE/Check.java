package SWE;

import Test.Test1;

public class Check extends Test1{
	
	  public static String fun(char c) {
		  if(c>='A' && c<='Z') {
			  return ("It is capital");
		  }else if(c>='a' && c<= 'z') {
			  return("small case");
		  }else if(c>='0' && c<='9') {
			  return("Number");
		  }else {
			  return("special characetr");
		  }
	  }
	  
	  public static void demo(int a,boolean b) {
		  System.out.println("hello");
	  }
	  
      public static void main() {
    	 String a=fun('*');
    	 System.out.println(a);;
      }
}
