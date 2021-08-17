package mobile;
import java.util.*;



public class TestProduct {

	public static void main(String[] args) {
		
		List<ProductList> l1=Database.getProduct();
		
		ProductList p1=new ProductList();
		
		p1.sortAsc(l1);
		p1.sortDesc(l1);
		p1.maxPrice(l1);
	}

}
