package assignment;

public class Employee {

	int empid;
	String name;
	double empsal;
	Employee(int empid,String name,Double empsal)
	{
		this.empid=empid;
		this.name=name;
		this.empsal=empsal;
	}
	public void display()
	{
		System.out.println("empid: "+empid);
		System.out.println("name: "+name);
		System.out.println("salary: "+empsal);
	}
	public double salcal()
	{
		double s=empsal;
		return s;
	}
	
}



