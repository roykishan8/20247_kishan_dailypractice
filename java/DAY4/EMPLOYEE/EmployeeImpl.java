package day4assignment;
import java.util.*;


public class EmployeeImpl extends Employee implements EmployeeInt  {
	
	ArrayList<Employee> a1=new ArrayList<>();
	
	public void addEmployee(Employee e) {
		a1.add(e);
	}
	
	public void deleteEmployee(Employee e) {
		a1.remove(e);
	}
	
	public double yearSalary(Employee e1) {
		return e1.empsal*12;
	}

	public double appSalary(Employee e1) {
		if(e1.empsal<10000) {
			e1.empsal+=5000;
		}
		return e1.empsal;
	}
	public static int compareTo(Employee st,Employee st1) {
		if(st1.empid==st.empid) {
			return 0;
		}else {
			return 1;
		}
		}
	public String Duplicate() {
		
		String a="not found";
		for(Employee s1:a1) {
		
			for(Employee s2:a1) {
				if(s1==s2) {
					continue;
				}else if (compareTo(s1,s2)==0) {
					a="found";
					
				}
			}
		}
		return a;
	
		
		
	}

	@Override
	public String toString() {
		return "EmployeeImpl [a1=" + a1 + "]";
	}
	
	

}
