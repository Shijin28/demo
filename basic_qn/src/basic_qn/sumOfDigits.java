package basic_qn;

import java.util.Scanner;

public class sumOfDigits
{	int sum=0;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		sumOfDigits m = new sumOfDigits();
		System.out.println("Please enter a number :");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("entered numbr is " +n +"for identify odd and even");
		int rem=0;
//		while (n>0)
		
//		{
//			rem= n%10;
////			m.sumOfDigit(rem);
//			n=n/10;
//		}
		
		
		
	}
	void sumOfDigit(int x)
	{
		sum= sum+x;
		System.out.println("output = " +sum);
	}
	
	void OddEven()
	{
		
	}
}
