package bankaccountapp;

public class Saving extends Account {
	

	// list properties specific to a checking account.
	private int safetyDepositeBoxID;
	private int safetyDepositeBoxKey;
	
	// constructor to initialize checking account.
	public Saving(String name, String sSN, double initDeposite) {
		super(name, sSN, initDeposite);
		accountNumber = "1"+accountNumber;
		setsafetyDepositeBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()- .25;
	}
	
	private void setsafetyDepositeBox() {
		safetyDepositeBoxID = (int) (Math.random()*Math.pow(10, 3));
		safetyDepositeBoxKey = (int) (Math.random()*Math.pow(10, 4));
	}
	
	// list any method specific to the checking account.
	public void showInfo() {
		
		System.out.println("Account type: saving");
		super.showInfo();
		System.out.println("Your saving account features "+ "\nSafety deposite ID: "+safetyDepositeBoxID+"\nSafety deposite Key: "+safetyDepositeBoxKey);
		
	}
