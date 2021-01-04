package atm;

public class ATM {
	private static long prevBalance = 100000; // assume initially 
	
	public long balance(long amountWithdrawn) {
		return this.prevBalance - amountWithdrawn;
	}
	
	public static long getBalance() {
		return prevBalance;
	}

	public void setBalance(long amt){
		this.prevBalance = amt;
	}
	
}
