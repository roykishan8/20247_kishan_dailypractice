package day4assignment2;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		
		
		Student s1=new Student(123,"kishan",40);
		Student s2=new Student(124,"roy",27);
		Student s3=new Student(125,"kroy",33);
		Student s4=new Student(126,"kk",48);
		Student s5=new Student(127,"ram",79);
		
		List<Student> l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		
		Collections.sort(l1, (o1, o2) -> (int)(o2.getStdmarks()-(o1.getStdmarks())));
		
		
	
		
		System.out.println(l1);
		
		
		

	}

}
