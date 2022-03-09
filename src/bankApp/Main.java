package bankApp;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creating Object for Saver1 and Saver 2
		 */

		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);

		/*
		 * / SavingAccount.annuallInterestRate = 4 %;
		 */

		SavingAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displaySavings();
		saver2.displaySavings();

		/*
		 * / SavingAccount.annuallInterestRate = 5 %;
		 */

		SavingAccount.modifyInterestRate(5); 
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displaySavings();
		saver2.displaySavings();

	}
}
