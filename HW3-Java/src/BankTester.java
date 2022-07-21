
public class BankTester
{
	public static void main(String [] args)
	{
		Bank b1 = new Bank(100);
		int add = b1.deposit(30);
		System.out.println("In my bank account is: " + add);
		int sub1 = b1.withdraw(100);
		System.out.println("In my bank account is: " + sub1);
		int sub2 = b1.withdraw(100);
		System.out.println("In my bank account is: " + sub2);
	}
}
