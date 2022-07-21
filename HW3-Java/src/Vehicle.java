
class Vehicle
{
	int vehicleNum;
	String model;
	String manufacturer;
	String color;
	int loadingCapacity;
	
	Vehicle(int vehicleNum, String model, String manufacturer, String color)
	{
		this.vehicleNum = vehicleNum;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.loadingCapacity = 50;
	}
	
	Vehicle(int vehicleNum, String model, String manufacturer, String color, int loadingCapacity)
	{
		this.vehicleNum = vehicleNum;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.loadingCapacity = loadingCapacity;
	}
	
	void changeColor(String newColor)
	{
		this.color = newColor;
	}
	
	void changeCapcity(int newCapacity)
	{
		this.loadingCapacity = newCapacity;
	}
	
	void printVehicle()
	{
		System.out.print(this.vehicleNum+ " ");
		System.out.print(this.model+ " ");
		System.out.print(this.manufacturer+ " ");
		System.out.print(this.color+ " ");
		System.out.println(this.loadingCapacity+ " ");
	}
}
