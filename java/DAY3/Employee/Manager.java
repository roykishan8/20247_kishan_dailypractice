package assignment;

public class Manager extends Employee {
	Manager(int empid, String name, double empsal) {
		super(empid, name, empsal);
	}
	
	public double salcal()
	{
		double sal=empsal*1.4;
		return sal;
	}

}
