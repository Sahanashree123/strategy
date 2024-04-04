package strategy;
import java.util.ArrayList;
import java.util.List;
public class Shoppingcart {
 
	private List<Product> productList;
	
	public Shoppingcart() {
		productList = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		if (productList.contains(product)) {
			System.out.println("The item is already added in the cart.");
		} else {
			productList.add(product);
		}
	}
	
	public void removeProduct(Product product) {
		try {
            if (!productList.contains(product)) {
                throw new RuntimeException("Error: Product not found in the shopping cart.");
            }
            productList.remove(product);
        }
		catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
	}
	
	private int calculateTotalPrice() {
		int totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
	}
}