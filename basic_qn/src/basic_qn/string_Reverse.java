package basic_qn;

import java.util.Scanner;

public class string_Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string");
		String input= sc.nextLine();
		int len = input.length();
		len = len-1;
		System.out.println(len);
		while(len>=0)
		{
			//System.out.println("len="+len);
			System.out.print(input.charAt(len));
			len--;
		}

	}

}
