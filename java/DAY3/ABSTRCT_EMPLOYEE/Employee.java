package assignment4;

public abstract class Employee {
	int empid;
	String empname;
	double basicpay;
	int noofleaves;
	Address addr;
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}

	public int getNoofleaves() {
		return noofleaves;
	}

	public void setNoofleaves(int noofleaves) {
		this.noofleaves = noofleaves;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	abstract double CalculateSalary();
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", basicpay=" + basicpay + ", noofleaves="
				+ noofleaves + ", addr=" + addr + "]";
	}
	
	

}
