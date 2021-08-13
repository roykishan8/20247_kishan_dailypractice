package assignment;

public class Triangle extends Shape {
	Triangle(double length,double height,double width)
	{
		super(length,height,width);
	}
	public double area()
	{
		double a1=0.5*height*length;
		return a1;
	}

}
