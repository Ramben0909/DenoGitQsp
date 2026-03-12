package SWE;

import Test.impleuser;

class person extends impleuser{
	
	long mobile_no;
	String user_name;
	String email;
	
	person(long mobile_no,String user_name,String email){
		this.mobile_no=mobile_no;
		this.user_name=user_name;
		this.email=email;
	}
}

public class user {
    public static void main() {
        person oneguy = new person(999912219l,"heyguy","akjddha.gmail.com");
        oneguy.chat();
        oneguy.group();
        oneguy.payment();
    }
}
