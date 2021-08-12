package finalassignment;

public class StudentQ1 {
	public int stdID;
	public String stdName;
	public int stdClass;
	
	public void display() {
		System.out.println("id: "+stdID);
		System.out.println("name: "+stdName);
		System.out.println("class: "+ stdClass);
	}
	public static void main(String[] args) {
		
		StudentQ1 s1=new StudentQ1();
		StudentQ1 s2=new StudentQ1();
		s1.stdID=123;
		s1.stdName="kishan";
		s1.stdClass=8;
		s2.stdID=234;
		s2.stdName="roy";
		s2.stdClass=9;
		
		s1.display();
		System.out.println();
		s2.display();
		

	}

}
