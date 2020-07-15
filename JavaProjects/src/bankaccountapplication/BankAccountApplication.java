package bankaccountapplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApplication {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		//read a csv file then create new accounts based on that data
		String file = "C:\\Users\\MIvanov\\Desktop\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String eSSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, eSSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, eSSN, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("*********************************");
			acc.showInfo();
		}
	}
}
