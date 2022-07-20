import java.util.Scanner;

public class homework2 
{
	public static void main (String [] args)
	{
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter number for Fibonacci sequence: ");
		int fibo = scan1.nextInt();
		System.out.println("Enter number for prime number: ");
		int primo = scan1.nextInt();
		System.out.println("Enter first string to swap: ");
		String str1 = scan2.nextLine();
		System.out.println("Enter second string to swap: ");
		String str2 = scan2.nextLine();
		System.out.println("Enter first number to add: ");
		int add1 = scan1.nextInt();
		System.out.println("Enter second number to add: ");
		int add2 = scan1.nextInt();
		System.out.println("Enter a word to reverse: ");
		String str3 = scan2.nextLine();
		scan1.close();
		scan2.close();
		
		Fibonacci(fibo);
		if(prime(primo) == false)
		{
			System.out.println(primo+" is not prime.");
		}
		else
		{
			System.out.println(primo+" is prime");
		}
		swap(str1,str2);
		System.out.println(sum(add1, add2));
		System.out.println(reverse(str3));
		
	}
	
	public static void Fibonacci (int num)
	{
		int num1 = 0, num2 = 1, count = 0;
		while (count < num)
		{
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			count++;
		}
		System.out.println(" ");
	}
	public static boolean prime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2; i<num/2;i++)
		{
			if((num%i)==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void swap(String s1, String s2)
	{
		System.out.println("The first string is: "+s1+" and the second string is: "+s2);
		String temp = "";
		temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("The first string is now: " + s1 + " and the second string is: " + s2);
	}
	public static int sum(int num1, int num2)
	{
		return num1+num2;
	}
	public static String reverse(String s1)
	{
		String answer = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			answer = answer + s1.charAt(i);
		}
		return answer;
	}
}
