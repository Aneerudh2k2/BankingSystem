package user;

import java.io.*;

public class Customer implements Serializable {
	
	// assumed parameters
	public static String name = "OOPS";
	public int[] pin = {0,0,0,0} ;
	public static String password = "oopsbank.password";

	
	public Customer(String name, String password) {
		if(name.equals(this.name) == false) {
			System.out.println("Username "+ name + " doesnot exists!!!");
		}
		int res = verifyPassword(password);
		if(res == 0) {
			System.out.println("Hey "+ name);
		}else {
			System.out.println("Incorrect password!!!");
		}	
	}
	
	public Customer(String name, int[] pin){
		if(name.equals(this.name) == false) {
			System.out.println("Username "+ name + " doesnot exists!!!");
		}
		int res = verifyPassword(pin);
		if(res == 0) {
			System.out.println("Hey "+ name);
		}else {
			System.out.println("Incorrect pin!!!");
		}
	}
	
	public int verifyPassword(String password) {
		boolean p = password.equals(this.password);
		if(p) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public int verifyPassword(int[] pin) {
		  boolean p=true;
		  for(int i=0; i<4; i++) {
			  if(pin[i] != this.pin[i]) {
				  p = false;
				  break;
			  }
		  }
		  if(p) {
			  return 0;
		  }else{
			 return -1; 
		  }
	}
}


