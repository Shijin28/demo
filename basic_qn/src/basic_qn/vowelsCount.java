package basic_qn;

import java.util.Scanner;

public class vowelsCount {

	public static void main(String[] args) 
	{
		System.out.println("Please enter ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int len = input.length();
		len= len-1;
		char c;
		String vowels="aeiou";
	//	System.out.println("");vowels.split(vowels)
		int flag = 1;
		int vowel_count=0;
		while (len>=0)
		{
			c= input.charAt(len);
		
			System.out.println("char is" +c);
			len--;
			switch(c)
			{
			case 'a':
				vowel_count++;
				break;
			case 'e':
				vowel_count++;
				break;
			case 'i':
				vowel_count++;
				break;
			case 'o':
				vowel_count++;
				break;
			case 'u':
				vowel_count++;
				break;
			default:
				System.out.println("not vowel");
				
			}
		}
		System.out.println("Total vowels present in the string ="+vowel_count);
		
	}

}
