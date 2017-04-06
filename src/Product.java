
public abstract class  Product {

	private String name;
	private String model;
	private String serialNumber;


	public Product(String name, String model, String serialNumber) {
		this.name = name;
		this.model = model;
		this.serialNumber = serialNumber;
	}


	public abstract void dropToBasket();


	@Override
	public String toString() {
		return "Product [name=" + name + ", model=" + model + ", serialNumber=" + serialNumber + "]";
	}





}
