
public class StudentTest
{
	public static void main(String [] args)
	{
		Student s1 = new Student("Robert");
		Student s2 = new Student("Anne");
		System.out.println(s1.sName);
		System.out.println(s2.sName);
		s1.average(34, 43, 10);
		s2.average(74, 99, 82);
	}
}
