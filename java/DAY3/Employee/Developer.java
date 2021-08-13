package assignment;

public class Developer extends Employee {
	Developer(int empid, String name, double empsal) {
		super(empid, name, empsal);
	}
	
	public double salcal()
	{
		double sal=1.3*empsal;
		return sal;
	}

}
