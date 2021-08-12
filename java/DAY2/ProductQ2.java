package finalassignment;

public class ProductQ2 {
	
	int ProID;
	String ProName;
	double ProPrice;
	
	public double gst() {
		return ProPrice*1.18;
	}
	public void display() {
		System.out.println("product id: "+ProID);
		System.out.println("product name: "+ProName);
		System.out.println("total price with gst: "+gst());
	}

	public static void main(String[] args) {
		ProductQ2 p1=new ProductQ2();
		p1.ProID=123;
		p1.ProName="toy car";
		p1.ProPrice=200;
		p1.display();

	}

}
