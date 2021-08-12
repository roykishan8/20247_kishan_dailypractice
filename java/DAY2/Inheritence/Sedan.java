package finalassignment;

public class Sedan extends Car {
	int length; 
	Sedan(){};
	Sedan(int speed,double regularprice,String color,int length){
		super(speed,regularprice,color);
		this.length=length;
	}

	public double getsaleprice() {
		if(length>20) {
			return regularprice*0.95;
		}else {
			return regularprice*0.90;
		}
	}

	

}
