
public abstract class Bookstore 
{
	String username;
	String password;
	String billing;
	String shipping;
	
	Bookstore(String username, String password)
	{
		this.username = username;
		this.password = password;
		this.billing = "";
		this.shipping = "";
	}
	
	Bookstore(String username, String password, String billing, String shipping)
	{
		this.username = username;
		this.password = password;
		this.billing = billing;
		this.shipping = shipping;
	}
	
	abstract boolean login(String username, String password);
	abstract void addCart(String item, Float price);
	abstract void confirmOrder();
	abstract String order();
}
