package assignment4;

public class TechnicalEmployee extends Employee {
	
	TechnicalEmployee(){
		
	}

	

	@Override
	public String toString() {
		return "TechnicalEmployee [empid=" + empid + ", empname=" + empname + ", basicpay=" + basicpay + ", noofleaves="
				+ noofleaves + ","+" addr=" + addr.doorno+","+addr.street+","+addr.city +","+addr.pincode+  ", CalculateSalary()=" + CalculateSalary() + "]";
	}



	@Override
	double CalculateSalary() {
		
		return basicpay+(basicpay*0.12);
	}

}
