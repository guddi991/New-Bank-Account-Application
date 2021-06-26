package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class bankAccountApp {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
	// read a CSV file and the create a new account based on data
		String file = "C:\\Users\\Dell\\Downloads\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Saving")) {
				accounts.add(new Saving(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")){
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("Error Reading account type");
			}	
		}
		for(Account acc : accounts) {
			System.out.println("\n***********************");
			acc.showInfo();
		}
		
	}
}
