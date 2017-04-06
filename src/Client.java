
public class Client
{

	private String name;
	private String lastname;


	public Client(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Imie " + name + ", Nazwisko " + lastname;
	}



}
