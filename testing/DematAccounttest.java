package testing;

import UnderstandOops.copy.BankAccount;

public class DematAccounttest extends BankAccount{
	protected boolean test;
	
	
  public boolean getTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}
	

public DematAccounttest() {
		super();
	}

	public DematAccounttest(String AccountHolder, String AccountNo, double balance,boolean test) {
		super(AccountHolder, AccountNo, balance);
		this.test=test;
	}

@Override
  public void display() {
	  System.out.println(balance);
	  
  }
public void access() {
	System.out.println(AccountHolder);
	Displaydetails();
}

}
