package day4assignment;

public class UserEmployee {

	public static void main(String[] args) throws MyOwnException {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		e1.setEmpid(112);
		e1.setEmpname("kishan");
		e1.setEmpsal(15000);
		e2.setEmpid(113);
		e2.setEmpname("roy");
		e2.setEmpsal(8000);
		e3.setEmpid(114);
		e3.setEmpname("kroy");
		e3.setEmpsal(16000);
		e4.setEmpid(115);
		e4.setEmpname("roykishan");
		e4.setEmpsal(6600);
		
		
		
		EmployeeImpl a1=new EmployeeImpl();
		a1.addEmployee(e1);
		a1.addEmployee(e2);
		a1.addEmployee(e3);
		a1.addEmployee(e4);
		System.out.println(a1.toString());
		
		//For duplicate id;
		
		//FOR EXCEPTION CHECK REMOVE NEXT LINE FROM COMMENT
		//e3.setEmpid(115);
		String status=a1.Duplicate();
		if(status.equals("found")) {
			throw new MyOwnException("Duplicate id found!!!!");
		}else {
			System.out.println("Duplicate not found!!!");
		}
		
		//For increasing the salary by 5000;
		
		for(Employee e:a1.a1) {
			a1.appSalary(e);
		}
		
		System.out.println("After increment for the people having less than 10000 as salary");
        System.out.println(a1.toString());
        
        //Yearly salary for the given employee
        
        System.out.println("Yearly salary of e1: "+a1.yearSalary(e1));
		
		

	}

}
