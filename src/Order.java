
public class Order {

	private Client client;
	private Basket basket;


	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	@Override
	public String toString() {
		return "Zamowienie [Dane klienta=" + client + ", basket=" + basket + "]";
	}


}
