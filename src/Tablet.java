
public class Tablet extends Product{

	public Tablet(String name, String model, String serialNumber)

	{
		super(name, model, serialNumber);
	}

	public Tablet(BasketItem addToBasketItem) {
		super(addToBasketItem.getName(), addToBasketItem.getModel(), addToBasketItem.getSerialNumber());
	}


	public  void dropToBasket()

	{

	}

	@Override
	public String toString()

	{
		return super.toString();
	}
}
