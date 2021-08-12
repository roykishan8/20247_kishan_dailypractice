package finalassignment;

public class TshirtQ3 {
	String color;

	String material;

	String design;
	
	public void display() {
		System.out.println("color: "+color);
		System.out.println("material: "+material);
		System.out.println("design: "+design);
	}

	public static void main(String[] args) {
		
		TshirtQ3 small=new TshirtQ3();
		TshirtQ3 large=new TshirtQ3();
		TshirtQ3 x_large=new TshirtQ3();
		
		small.color="red";
		small.material="cotton";
		small.design="printed";
		large.color="blue";
		large.material="terecotton";
		large.design="carvan";
		x_large.color="yellow";
		x_large.material="silk";
		x_large.design="printed";
		
		small.display();
		large.display();
		x_large.display();
		
		
				
				
		
		

	}

}
