package programs;

import java.util.Scanner;

public class Stringvowelcount {

	public static void main(String[] args) {
		
		//read and store string
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s = sc.next();
		//convert to lower case
		s=s.toLowerCase();
		//call method
		Stringvowelcount object = new Stringvowelcount();
		int count=object.vowels(s);
		System.out.println("vowel count="+count);
	}
	//method to count vowels
	public int vowels(String s)
	{
		int c=0;//variable to store count
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				c++;
			}
	
		}
		return c;
		
	}

}
