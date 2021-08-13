package assignment;

public class TestShape {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5,4,3);
		Square s1=new Square(4,4,3);
		Triangle t1=new Triangle(6,8,4);
		
		System.out.println("rectangle area: "+r1.area());
		System.out.println("square area: "+s1.area());
		System.out.println("Triangle area: "+t1.area());

	}

}
