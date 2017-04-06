
public class Smartfon extends Product{

	public Smartfon(String name, String model, String serialNumber)

	{
		super(name, model, serialNumber);
	}

	public Smartfon(BasketItem addToBasketItem) {
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
