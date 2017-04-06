
public class Laptop extends Product {

	public Laptop(String name, String model, String serialNumber)

	{
		super(name, model, serialNumber);
	}

	public Laptop(BasketItem addToBasketItem) {
		super(addToBasketItem.getName(), addToBasketItem.getModel(), addToBasketItem.getSerialNumber());
	}

	public void dropToBasket()

	{

	}

	@Override
	public String toString()

	{
		return super.toString();
	}

}
