package finalassignment;

public class Truck extends Car {
	int weight;
	
	Truck(){};
	Truck(int speed,double regularprice,String color,int weight){
		super(speed,regularprice,color);
		this.weight=weight;
	}

public double getsaleprice()
{
	if(weight>2000) {
		return regularprice*0.90;
	}else {
		return regularprice*0.80;
	}
}


}
