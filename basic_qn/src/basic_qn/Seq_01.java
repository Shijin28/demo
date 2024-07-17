package basic_qn;

import java.util.Scanner;

public class Seq_01 {

	public static void main(String[] args) 
	{
		System.out.println("Please enter number");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		System.out.println(" entered number is "+num);
		
		char ch;
		int count =0,result=0, largest=0;
		
		//to get length
		int len = num.length();
		len = len-1; //index
		
		while(len >=0)
		{  // System.out.println("inside while");
			ch = num.charAt(len);
			
			if(ch == '0')
			{
				count++;
				//System.out.println("Found zero  ||| count = "+count);
				
				result=count;
				len--;
			}
			
			else if(ch == '1')// 1 is the delimiter
			{
				result=count;
				//System.out.println("found 1 , so break and store the value to Count =  "+count);
				count  = 0;
				
				
				if(result>largest)
				{
					//System.out.println("result >largest");
					//System.out.println(+result+" > " +largest);
					largest = result;
					System.out.println("largest combo-- ///////////////// =" +largest);
				}
				
				len--;	
			}
			
			
			
		}
		
		
	}

}
