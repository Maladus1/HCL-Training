
class Student 
{
	String sName; 
	
	Student(String sName)
	{
		this.sName = sName;
	}
	
	void average(int exam1, int exam2, int exam3)
	{
		int average = (exam1 + exam2 + exam3)/3;
		if(average >= 50)
		{
			System.out.println(this.sName + " has passed");
		}
		else
		{
			System.out.println(this.sName + " has failed");
		}
	}
}
