import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TestShop {

	public static final int EXIT = 0;
	public static final int DROP_TO_BASKET = 1;
	public static final int VIEW_BASKET = 2;
	public static final int VIEW_ORDER = 3;
	public static final int ADD_ORDER = 4;
	private static Basket basket = new Basket();
	private static Order order;

	public static void main(String[] args) {

		int option;
		Scanner in = new Scanner(System.in);

		do {

			Menu.showMenu();

			option = in.nextInt();

			switch (option) {

			case DROP_TO_BASKET:
				int wybor;

				Menu.showProducts();

				wybor = in.nextInt();
				in.nextLine();

				BasketItem addToBasketItem = Menu.showProducts(in);

				in.nextLine();
				Product product = null;

				switch (wybor) {
				case 1:
					product = new Laptop(addToBasketItem);
					break;

				case 2:
					product = new Tablet(addToBasketItem);
					break;

				case 3:
					product = new Smartfon(addToBasketItem);
					break;
				}
				basket.addProduct(product);

				break;

			case VIEW_BASKET:
				for (Product p : basket.getProducts())
					System.out.print(p);
				break;

			case VIEW_ORDER:
				if (order != null) {
					System.out.println(order);
				} else
					System.out.println("Nie masz jeszcze zamówienia ! \n");
				break;

			case ADD_ORDER:
				order = new Order();
				order.setBasket(basket);
				String name1 = "tomek";
				String lastname = "kowalki";

				order.setClient(new Client(name1, lastname));
				break;

			default:
				break;
			}
		} while (option != 0);
		System.out.println("Zamykam Program");
		in.close();
	}
}