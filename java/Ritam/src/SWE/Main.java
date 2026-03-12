package SWE;

class demo {
    demo(){
    	System.out.println("Ist constructor");
    }
    demo(int a){
    	this();
    	System.out.println("2nd constructor");	
    }
    demo(int a,int b){
    	this(a);
    	System.out.println("3rd constructor");
    }
}
class Insta{
	String userid;
	int age;
	String name;
	Insta(){
		int id = (int)Math.random();
		this(id);
	}
	Insta(int number){
		String id =number+"";
		this("not specified",id);
	}
    Insta(long number){
    	String id =number+"";
    	this("not specified",id);
	}
    Insta(String email){
    	this("not specified",email);
    }
    Insta(String name,String email){
    	this(name,email,0);
    }
    Insta(String name,String email,int age){
    	this.name=name;
    	this.userid=email;
    	this.age=age;
    }
}

public class Main {
    public static void main(String args[]) {
        Insta user = new Insta("Ritam","ritamramben");
        System.out.println(user.userid);
        System.out.println(user.name);
        System.out.println(user.age);
        Insta user2 = new Insta("Ritam2","ritamramben");
        System.out.println(user2.userid);
        System.out.println(user2.name);
        System.out.println(user2.age);
    }
}