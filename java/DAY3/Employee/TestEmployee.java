package assignment;

public class TestEmployee {

	public static void main(String[] args) {
		Manager m1=new Manager(123,"kishan",40000);
		Developer d1=new Developer(345,"roy",30000);
		Tester t1=new Tester(567,"kroy",25000);
		m1.display();
		d1.display();
		t1.display();
		System.out.println("manager salcal:"+m1.salcal());
		System.out.println("developer salcal: "+d1.salcal());
		System.out.println("tester salcal: "+t1.salcal());
		

	}

}
