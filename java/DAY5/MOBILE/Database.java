package mobile;

import java.util.ArrayList;
import java.util.List;



public class Database {
	
	public static List<ProductList> getProduct(){
	List<ProductList> l1=new ArrayList<>();
	l1.add(new ProductList("Nokia","lumia800",30000));
	l1.add(new ProductList("realme","6pro",18000));
	l1.add(new ProductList("realme","7pro",21000));
	l1.add(new ProductList("Apple","xplus",75000));
	l1.add(new ProductList("Nokia","c5",6000));
	return l1;
	}

	

}
