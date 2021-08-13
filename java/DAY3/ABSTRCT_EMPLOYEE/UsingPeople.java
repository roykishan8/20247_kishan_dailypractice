package assignment4;

public class UsingPeople {

	public static void main(String[] args) {
		
		Address a1=new Address(26,"dbg","darbhanga",846001);
		Address a2=new Address(29,"lbh","patna",842666);
		Address a3=new Address(45,"sms","samastipur",848209);
		
		Staff s1=new Staff();
		Staff s2=new Staff();
		TechnicalEmployee t1=new TechnicalEmployee();
		
		s1.setAddr(a1);
		s1.setEmpid(123);
		s1.setEmpname("kishan");
		s1.setNoofleaves(15);
		s1.setBasicpay(40000);
		System.out.println(s1.toString());
		s2.setAddr(a2);
		s2.setEmpid(1234);
		s2.setEmpname("kishanroy");
		s2.setNoofleaves(20);
		s2.setBasicpay(30000);
		System.out.println(s2.toString());
		
		t1.setAddr(a3);
		t1.setEmpid(345);
		t1.setEmpname("kroy");
		t1.setNoofleaves(25);
		t1.setBasicpay(60000);
		System.out.println(t1.toString());
		
		
		
		

	}

}
