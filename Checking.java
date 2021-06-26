package bankaccountapp;

public class Checking extends Account {
	

	// list properties specific to a checking account.
	private int debitCardNumber;
	private int debitCardPIN;
	
	// constructor to initialize checking account.
	public Checking(String name, String sSN, double initDeposite) {
		super(name, sSN, initDeposite);
		accountNumber = "2"+accountNumber;
		setdebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()* .15;
	}
	
	private void setdebitCard() {
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12));
		debitCardPIN = (int) (Math.random()*Math.pow(10, 4));
		
	}
	
	// list any method specific to the checking account.
	public void showInfo() {
		
		System.out.println("Account type: checking");
		super.showInfo();
		System.out.println("Your checking account features "+ "\ndebit Card Number: "+debitCardNumber+"\ndebit Card PIN: "+debitCardPIN);
	}

}
