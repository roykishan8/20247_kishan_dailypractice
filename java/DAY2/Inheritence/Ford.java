package finalassignment;

public class Ford extends Car {
	int year; 

	int manufacturerDiscount; 
	Ford(){};
	Ford(int speed,double regularprice,String color,int year,int manufacturerDiscount){
		super(speed,regularprice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}

	public double getsaleprice() {
		return regularprice-manufacturerDiscount;
	}

}
