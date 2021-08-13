package assignment;

public class Shape {
	double length;
	double height;
	double width;
	Shape(double length,double height,double width)
	{
		this.length=length;
		this.height=height;
		this.width=width;
	}
	public double area()
	{
		return length*height;
	}
	

}
