package basic_qn;

import java.util.Scanner;

public class CheckPalindrome 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		CheckPalindrome m = new CheckPalindrome();
//		m.checkPalindrome();
		
		m.decimalToBinary();
	}
	
	void checkPalindrome()
	{
		System.out.println("please enter a Number to check whether its a pallindrome or not :");
		int n=sc.nextInt();
		int temp = n;
		int rev = 0, rem=0;
		while (n>0)
		{
			rem = n%10;
			rev= rev*10 + rem;
			n= n/10 ;
			
		}
		
		System.out.println("reverse = "+rev);
		if(rev == temp)
		{
			System.out.println("Its a palindrome");
			
		}
		else if(rev != temp)
		{
			System.out.println("Not a palindrome");
		}
	}
	
	void decimalToBinary()
	{
		System.out.println("please enter a Number to convert into binary :");
		int n=sc.nextInt();
		int temp=n;
		int rem=0;
		String result;
		while(n>0)
		{
			rem= n%2;
			
			System.out.println(rem);
			//result= rem;
			n=n/2;
			//System.out.println("n = " +n);
			
			
			
		}
	}
}
