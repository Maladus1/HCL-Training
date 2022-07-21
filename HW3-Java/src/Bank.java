
public class Bank
{
	int accountAmonut;
	
	Bank(int accountAmount)
	{
		this.accountAmonut = accountAmount;
	}
	int deposit (int amount)
	{
		this.accountAmonut += amount;
		return this.accountAmonut;
	}
	int withdraw (int amount)
	{
		int checker = this.accountAmonut - amount;
		if(checker < 0)
		{
			this.accountAmonut = 0;
			return 0;
		}
		else
		{
			this.accountAmonut -= amount;
			return this.accountAmonut;
		}
	}
}
