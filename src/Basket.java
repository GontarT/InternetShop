import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Product> products = new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	@Override
	public String toString() {
		return "Basket [products=" + products + "]";
	}




}
