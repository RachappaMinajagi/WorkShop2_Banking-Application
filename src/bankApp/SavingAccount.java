package bankApp;

/*
 * using static variable AnnualInterestrate to store the annual interest rate
 * for all the account holders and each object of the class contains private
 * instance variable savingBalance representing the amount the saver currently
 * has on deposit
 */

public class SavingAccount {

	private static double annuallInterestRate;
	private double savingsBalance;
	private double monthlyInterest;
/*
 * creating constructor of SavingAccount class having the same name as the class without return type
 */
	public SavingAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;

	}
/*
 * Create Method calculate Monthly Interest
 */
	public void calculateMonthlyInterest() {
		this.monthlyInterest = (savingsBalance * annuallInterestRate/100) / 12;
		System.out.println("Annual InterestRate: " + this.annuallInterestRate);
	}
	
	/*
	 * creating a static method modifyInterestRate that sets the annualInterestRate
	 * to a new value
	 */

	public static void modifyInterestRate(double interestRate) {
		annuallInterestRate = interestRate;
	}

	private void calculateSavings() {
		savingsBalance += this.monthlyInterest;
	}

	public void displaySavings() {
		calculateSavings();
		System.out.println("The total balance is :" + savingsBalance);
	}

}