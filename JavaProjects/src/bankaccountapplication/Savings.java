package bankaccountapplication;

public class Savings extends Account {
	//list the properties specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor to initialize savings account properties
	public Savings(String name, String eSSN, double initDeposit) {
		super(name, eSSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	//list any methods specific to the savings account
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your savings account features:" + 
		"\n  Safety Deposit Box ID: " + safetyDepositBoxID +
		"\n  Safety Deposit Box Key: " + safetyDepositBoxKey);
	}
}
