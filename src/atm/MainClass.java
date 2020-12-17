package atm;

import java.util.Scanner;

import user.Customer;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM c1 = new ATM();
		
		System.out.println("Welcome to OOPS ATM");
		System.out.print("Please enter your pin: ");
		int[] pinNumber = new int[4];
		for(int each: pinNumber) each = sc.nextInt();
		// verification is done later on the project
		Customer c = new Customer("OOPS",pinNumber);
		
		System.out.print("Please enter the amount: ");
		long amount = sc.nextLong();
		System.out.println("Please collect your cash and remove your ATM card");
		System.out.println("Balance amount: "+ c1.balance(amount));
	}

}
