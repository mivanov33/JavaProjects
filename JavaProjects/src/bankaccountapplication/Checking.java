package bankaccountapplication;

public class Checking extends Account {
	//list the properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;

	//constructor to initialize checking account properties
	public Checking(String name, String eSSN, double initDeposit) {
		super(name, eSSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	//list any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features:" + 
				"\n  Debit Card Number: " + debitCardNumber +
				"\n  Debit Card PIN: " + debitCardPIN);
	}
}
