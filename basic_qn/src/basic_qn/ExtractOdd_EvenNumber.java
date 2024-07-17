package basic_qn;

import java.util.Scanner;

public class ExtractOdd_EvenNumber 
{
	Scanner sc = new Scanner(System.in);
	void Extract()
	{
		System.out.println("Enter number: ");
		int n= sc.nextInt();
		int rem=0;	
		while(n>0)
		{
			rem= n%10;
			if(rem%2==0)
			{
				System.out.println("even" +rem);
			}
			else {
				System.out.println("odd" +rem);
			}
			n= n/10 ;
		}
	}
	
	
	public static void main(String[] args)
	{
		
		ExtractOdd_EvenNumber m= new ExtractOdd_EvenNumber();
		m.Extract();
	}
	
}
