package assignment4;

public class Staff extends Employee {
	
	Staff(){
		
	}

	
	

	@Override
	public String toString() {
		return "Staff [empid=" + empid + ", empname=" + empname + ", basicpay=" + basicpay + ", noofleaves="
				+ noofleaves + ", addr=" + addr.doorno+","+addr.street+","+addr.city +","+addr.pincode+ ", CalculateSalary()=" + CalculateSalary() + "]";
	}




	@Override
	double CalculateSalary() {
		
		return basicpay+(0.18*basicpay);
	}
	

}
