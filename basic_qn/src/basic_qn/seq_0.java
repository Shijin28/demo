package basic_qn;

import java.util.Scanner;

public class seq_0 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value =");
		String input = sc.nextLine();
		int len = input.length();
		len =len-1;
		
		int count= 0,result =0;
		
		char ch;
		int  largest = 0;
		
while(len>=0)

{ 			
	ch = input.charAt(len);
			System.out.println("ch **************inside outer while  =" +ch +"is at position"+len);
			
		

		
		
		
	if(ch != '0' && ch !='1')
	{
		len--;
		System.out.println("exclude" +ch + "now length = "+len);
	}
	
	else
		// it's either Zero or One 
		{   
			
			
			System.out.println("ch ****inside inner while  =" +ch);
			
			if (ch=='0')
			{ch = input.charAt(len);
				System.out.println("ch ****inside [f  =" +ch);
				len--;
				
				count++;
				System.out.println("count 0 if= " +count);	
				
			}
				else         
				{ System.out.println("ch ****inside else  =" +ch);
				
				result = count;
				System.out.println("count 0 if= " +result);	
				
				count = 0;
				len--;
				}
			
			if(result>largest)
			{
				largest = result ;
				System.out.println("/////////////////////////largest =" +largest);
				
			}
			else {
				break;
			}
			
			
			
		}
	}
		
		
	
		
}

		
}

