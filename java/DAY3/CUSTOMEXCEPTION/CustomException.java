package assignment;

public class CustomException {
	int sal;
	public class SalaryException  extends Exception
	{
		SalaryException(String s1)
		{
			super(s1);
		}
	}

	public void salary(int salary) throws SalaryException
	{
		if(salary<100000)
		{
			throw new SalaryException (" Yearly Salary cannot be less than 100000");
		}
		else
		{
			System.out.println("Your Yearly salary is "+salary);
		}
	}
	public static void main(String[] args) throws SalaryException
	{
		
		CustomException e1=new CustomException();
	    e1.sal=90000;
		e1.salary(e1.sal);

}
}
