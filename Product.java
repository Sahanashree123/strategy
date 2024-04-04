package strategy;
public class Product {
 
	private String name;
	private String upcCode;
	private int price;
	
	public Product(String name, String upcCode, int price) {
		this.name = name;
		this.upcCode = upcCode;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getUpcCode() {
		return upcCode;
	}
	public int getPrice() {
		return price;
	}
}