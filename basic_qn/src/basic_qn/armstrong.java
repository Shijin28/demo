package basic_qn;

import java.util.Scanner;

public class armstrong 
{
	Scanner sc= new Scanner(System.in);
	
	//
	public static void main(String[] args) 
	{
		armstrong m = new armstrong();
		m.armstrongNum(153);	
		m.limit();
	}
	
	void armstrongNum(int n)
	{
		//System.out.println("Please enter number to get armstrong == ");
		//int n =sc.nextInt();
		int temp = n;
		int rem=0, result=0;
		while(n!=0)
		{	
			//System.out.println("inside");
			//System.out.println("n>0 digit" +n);
		
			rem =n%10;
			//System.out.println("rem" +rem);
			result = (rem*rem*rem) + result;
			//System.out.println("rem" +result);
			n= n/10;
			//System.out.println("n" +n);
			
		}
		//System.out.println("result =" +result);
		 if (result == temp)
		 {
			 System.out.println(temp +" is armstrong");
		 }
//		 else {
//			 System.out.println(temp +" is not a armstrong");
//		 }
	}
	
	void limit()
	{armstrong obj = new armstrong();
		System.out.println("Please enter limit to get armstrong numbers == ");
		int limit =sc.nextInt();
		int a=1;
		while(a<=limit)
		{
			obj.armstrongNum(a);
			a++;
		}
				
		
	}
}
