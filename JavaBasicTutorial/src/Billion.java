
public class Billion {
	private long  balance;
	
	public Billion(int bal) {
		balance = bal;
	}
	
	public void setBalance(int bal) {
		balance = bal;
	}
	
	public long getBalance() {
		return balance;
	}

	public void bankBalance()
	{
		System.out.println("Balance is: " + balance);
	}
}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  Billion b = new Billion(2000000000);
		  b.bankBalance();
		  
		  System.out.println("****   END of program  *****");
		}
	 
}
*/