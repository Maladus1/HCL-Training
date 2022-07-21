
public class Washing_Machine 
{
	boolean power;
	int clothes;
	boolean detergent;
	Washing_Machine()
	{
		this.power = false;
		this.clothes = 0;
		this.detergent = false;
	}
	void switchON()
	{
		if(this.detergent == true && this.clothes > 0)
		{
			this.power = true;
			System.out.println("Power on!");
		}
		else if (this.detergent == false)
		{
			System.out.println("You need detergent!");
		}
		else
		{
			System.out.println("Put some clothes into the washing machine!");
		}
	}
	void acceptClothes(int newClothes)
	{
		if(this.power == true)
		{
			System.out.println("The power is on! You can't add clothes!");
		}
		else
		{
			this.clothes = this.clothes + newClothes;
			System.out.println("You now have " + this.clothes + " amount of clothes in the machine");
		}
	}
	void acceptDetergent()
	{
		if(this.power == true)
		{
			System.out.println("The power is on! You can't add detergent!");
		}
		else
		{
			if(this.detergent == false)
			{
				System.out.println("Detergent is put into the machine");
				this.detergent = true;
			}
			else
			{
				System.out.println("There is already detergent in the machine");
			}
		}
	}
	void switchOFF()
	{
		this.power = false;
		this.detergent = false;
		this.clothes = 0;
		System.out.println("Power is off! Clothes are emptied out!");
	}
}
