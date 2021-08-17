package mobile;

import java.util.List;

public class ProductList {
	String compName;
	String modelName;
	int price;
	public ProductList() {
		
	}
	public ProductList(String compName, String modelName, int price) {
		super();
		this.compName = compName;
		this.modelName = modelName;
		this.price = price;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductList [compName=" + compName + ", modelName=" + modelName + ", price=" + price + "]";
	}
    
	public void sortAsc(List<ProductList> l1) {
		System.out.println("sorting in Ascending order.................");
		l1.stream().sorted((o1,o2)->(int)(o1.getPrice()-o2.getPrice())).forEach(System.out::println);
	}
	public void sortDesc(List<ProductList> l1) {
		System.out.println("sorting in descending order............");
		l1.stream().sorted((o1,o2)->(int)(o2.getPrice()-o1.getPrice())).forEach(System.out::println);
	}
	public void maxPrice(List<ProductList> l1) {
		ProductList a1=l1.stream().max((o1,o2)->(int)(o1.getPrice()-o2.getPrice())).get();
		System.out.print("Maximum price is for : ");
		System.out.println(a1.getCompName()+" "+a1.getModelName()+" "+a1.getPrice());
	}
	
	
	

}
