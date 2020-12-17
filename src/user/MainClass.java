package user;

import java.util.*;
import java.io.*;

public class MainClass {
	
	public static File Serialise(Customer u) {
		File f = new File("oops.txt");
		try {
			
			//serializing
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(u);
			
			fos.close();
			oos.close();
			System.out.println("Serialised");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static Customer Deserialise(File f) {
		Customer u = null;
		try {
			
			// deserialising
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			u = (Customer) ois.readObject();
			
			fis.close();
			ois.close();
			
			System.out.println("Deserialised");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to OOPS Bank!!");
		System.out.println("Enter the Login credentials");
		
		System.out.print("Username: ");
		
		String name = sc.nextLine();
		
		System.out.print("What you prefer for authentication pin/password? ");
		
		String s = sc.nextLine();
		String pswd = null;
		int[] pin = new int[4];
		switch(s) {
			case "pin": 
				System.out.print("Enter the Pin: ");
				for(int each: pin) { each = sc.nextInt(); }
				Customer u1 = new Customer(name,pin);
				File f = Serialise(u1);
				Customer n = Deserialise(f);
				System.out.println("Customer name: "+ n.name);
				System.out.println("Customer pin: "+ Arrays.toString(n.pin));
				break;
			case "password": 
				System.out.print("Enter the password: ");
				pswd = sc.nextLine();
				Customer u2 = new Customer(name,pswd);
				File f1 = Serialise(u2);
				Customer n1 = Deserialise(f1);
				System.out.println("Customer name: "+ n1.name);
				System.out.println("Customer password: "+ n1.password);
				break;
			default: System.out.println("Choose valid authentication!!!");
		}
		
	}
}
