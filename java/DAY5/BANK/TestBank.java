package bank;

public class TestBank {

	public static void main(String[] args) {
		//Current account
		CurrentAcc j1=new CurrentAcc();
		j1.setAccID(4765);
		j1.setAccName("kroy");
		j1.setAccBalance(55000);
		j1.display();
		System.out.println();
		j1.deposit(5000);
		System.out.println();
		j1.display();
		System.out.println();
		j1.withdraw(3000);
		j1.display();
		System.out.println(j1);
		
		//joint account
		
		JoinAcc j2=new JoinAcc();
		j2.setAccID(165);
		j2.setAccName("kishan ray");
		j2.setAccBalance(55000);
		
		j2.display();
		System.out.println();
		j2.deposit(5000);
		System.out.println();
		j2.display();
		System.out.println();
		j2.withdraw(3000);
		j2.display();
		
		System.out.println(j2);
		
		//saving account
		
		SavingAcc s1=new SavingAcc();
		s1.setAccID(123);
		s1.setAccName("kroy");
		s1.setAccBalance(5000);
		s1.display();
		s1.deposit(500);
		s1.display();
		s1.withdraw(200);
		s1.display();
		System.out.println(s1);
		
	}

}
