import java.util.*;

public class HashToArray 
{
	public static void main(String [] args)
	{
		HashSet<String> hash = new HashSet<String>();
		hash.add("Brandan");
		hash.add("Kyle");
		hash.add("Emily");
		hash.add("John");
		hash.add("Fatima");
		
		System.out.println(hash);
		String hashArray[] = new String[hash.size()];
		int i = 0;
		for(String ele:hash)
		{
			hashArray[i++] = ele;
		}
		for(String x: hashArray)
		{
			System.out.println(x);
		}
	}
}
