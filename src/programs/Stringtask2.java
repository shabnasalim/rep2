package programs;

import java.util.Scanner;

public class Stringtask2 {

	public static void main(String[] args) {
		
		System.out.println("ENTER STRING");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(s);
		
		if(s.equals(rev))
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not paliandrome");
		}
	
		sc.close();

	}

}

