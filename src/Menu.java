import java.util.Scanner;

public class Menu {

	public static void showMenu(){

		System.out.println("WYSWIETL OPCJE : ");
		System.out.println("1 - Dodaj do koszyka");
		System.out.println("2 - Wyœwietl zamówienie");
		System.out.println("0- Zamknij program");
	}

	public static void showProducts(){
		System.out.println(" Jakiego typu ma by produkt ?");
		System.out.println(" 1- Laptop");
		System.out.println(" 2- Tablet");
		System.out.println(" 3- Smartfon");
	}

	public static BasketItem showProducts(Scanner in){
		BasketItem basketItem = new BasketItem();
		System.out.print(" Podaj nazwe produktu :");
		basketItem.setName(in.nextLine());
		System.out.print(" Podaj model produktu :");
		basketItem.setModel(in.nextLine());
		System.out.print(" Podaj numer seryjny :");
		basketItem.setSerialNumber(in.nextLine());
		return basketItem;
	}
}
