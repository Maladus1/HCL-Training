import java.util.ArrayList;
public class ReversedArray 
{
	public static void main (String [] args)
	{
		ArrayList<String> test = new ArrayList<String>();
		test.add("Brandan");
		test.add("Emily");
		test.add("Kyle");
		test.add("Fatima");
		test.add("John");
		test = reverse(test);
		for(int i = 0; i<test.size();i++)
		{
			System.out.println(test.get(i));
		}
	}
	
	public static ArrayList<String> reverse (ArrayList<String> initial)
	{
		ArrayList<String> reversed = new ArrayList<String>();
		for(int i = initial.size()-1; i>=0; i--)
		{
			reversed.add(initial.get(i));
		}
		return reversed;
	}
}
