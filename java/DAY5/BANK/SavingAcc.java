package bank;



public class SavingAcc extends BankClass implements Bank_Interface{
	public void deposit(double amnt) {
		accBalance+=amnt;
		System.out.println("Bank deposit: "+ amnt);
        System.out.println("Deposited in saving account");
	}
	
	public void withdraw(double amnt) {
		accBalance-=amnt;
		System.out.println("withdrawn amount : "+ amnt);
        System.out.println("withdrawn from saving account");
	}

	
	
}
