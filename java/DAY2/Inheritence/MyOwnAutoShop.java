package finalassignment;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan s1=new Sedan(60,400000,"red",21);
		Ford f1=new Ford(80,5000000,"white",2007,20000);
		Ford f2=new Ford(110,8000000,"yellow",2015,30000);
		Truck t1=new Truck(70,1000000,"red",22000);
		Car c1=new Car(120,600000,"green");
		
		System.out.println("Sale price of sedan s1 is : "+s1.getsaleprice());
		System.out.println("Sale price of ford f1 is : "+f1.getsaleprice());
		System.out.println("Sale price of ford f2 is : "+f2.getsaleprice());
		System.out.println("Sale price of Truck t1 is : "+t1.getsaleprice());
		System.out.println("Sale price of Car c1 is : "+c1.getsaleprice());

	}

}
