
public class VehicleTester
{
	public static void main(String [] args)
	{
		Vehicle v1 = new Vehicle(12, "Sentra", "Nissan", "Green");
		Vehicle v2 = new Vehicle(412, "Wrangler", "Jeep", "White", 100);
		v1.printVehicle();
		v2.printVehicle();
		v1.changeColor("Black");
		v1.changeCapcity(75);
		v1.printVehicle();
	}
}
