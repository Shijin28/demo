package basic_qn;

import java.util.Scanner;

public class LimitPalindrome 
{
	Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	
	{
	LimitPalindrome m= new LimitPalindrome();
	m.enter();
	
	}
	
	void enter()
	{
		System.out.println("Enter the limit");
		int limit= sc.nextInt();
		int a=10;
		
		while(a<=limit) 
		{	LimitPalindrome obj = new LimitPalindrome();
			obj.checkPalindrome(a);
			a++;
		}
	}
	
	void checkPalindrome(int n)
	{
		
		int temp = n;
		int rev = 0, rem=0;
		{
			rem = n%10;
			rev= rev*10 + rem;
			n= n/10 ;
			
		}
		

		if(rev == temp)
		{
			System.out.println(temp);
			
		}

	}

}
