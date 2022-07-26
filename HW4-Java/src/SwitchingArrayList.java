import java.util.ArrayList;
import java.util.Collections;

public class SwitchingArrayList
{
	public static void main (String [] args)
	{
		ArrayList<String> test = new ArrayList<String>();
		test.add("Brandan");
		test.add("Emily");
		test.add("Kyle");
		test.add("Fatima");
		test.add("John");
		Collections.swap(test,3,1);
		for(int i = 0; i<test.size();i++)
		{
			System.out.println(test.get(i));
		}
	}
}
