package finalassignment;

public class Car {

	int speed;
	double regularprice;
	String color;
	
	Car(){
		
	}
	Car(int speed,double regularprice,String color){
		this.speed=speed;
		this.color=color;
		this.regularprice=regularprice;
	}
	
	public double getsaleprice()
	{
		return regularprice;
	}

}
