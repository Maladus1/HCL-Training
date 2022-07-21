
public class WashingTester
{
	public static void main(String [] args)
	{
		Washing_Machine w1 = new Washing_Machine();
		w1.acceptDetergent();
		w1.acceptDetergent();
		w1.switchON();
		w1.acceptClothes(2);
		w1.acceptClothes(5);
		w1.acceptClothes(3);
		w1.switchON();
		w1.acceptDetergent();
		w1.acceptClothes(2);
		w1.switchOFF();
	}
}
