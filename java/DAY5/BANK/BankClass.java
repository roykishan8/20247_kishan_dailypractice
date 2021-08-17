package bank;

public class BankClass {
	private int accID;
	private String accName;
	public double accBalance;
	
	

	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	
	
	
	@Override
	public String toString() {
		return "BankClass [accID=" + accID + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	public void display() {
		System.out.println("Account ID : "+accID);
		System.out.println("Account Holder Name: "+accName);
		System.out.println("Account Balance: "+accBalance);
	}


	

}
