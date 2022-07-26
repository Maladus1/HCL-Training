
public class Employee 
{
	int id;
	String name;
	int age;
	String gender;
	String dept;
	int yearOfJoining;
	int salary;
	
	Employee(int id, String name, int age, String gender, String dept, int yearOfJoining, int salary)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getGender()
	{
		return this.gender;
	}
	public String getDept()
	{
		return this.dept;
	}
	public int getYearOfJoining()
	{
		return this.yearOfJoining;
	}
	public int getSalary()
	{
		return this.salary;
	}
}
