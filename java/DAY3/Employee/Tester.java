package assignment;

public class Tester extends Employee {
	Tester(int empid, String name, double empsal) {
		super(empid, name, empsal);
	}
	
	public double salcal()
	{
		double sal=empsal*1.2;
		return sal;
	}

	

}
