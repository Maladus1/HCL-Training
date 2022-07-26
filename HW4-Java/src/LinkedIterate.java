import java.util.Iterator;
import java.util.LinkedList;

public class LinkedIterate 
{
	public static void main(String [] args)
	{
		LinkedList<String> names = new LinkedList<String>();
		names.add("Brandan");
		names.add("Emily");
		names.add("Kyle");
		names.add("Fatima");
		names.add("Yolanda");
		names.add("John");
		names.add("Alberto");
		names.add("Alaina");
		
		Iterator x = names.listIterator(5);
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
	}

}
