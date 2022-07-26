import java.util.LinkedList;

public class ReplaceLinkedList 
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
		
		System.out.println(names);
		names.set(0, "Brandon");
		names.set(5, "Anne Marie");
		System.out.println(names);
	}
}
