package controlstatements;

public class Reverseofnumber {

	public static void main(String[] args) {
		
		int n=23456;
		int reverse=0;
		int r;
		int temp=n;
		while(n>0)
		{
			r =n%10;
			reverse = reverse*10+r;
			n= n/10;
			
			
		}
		System.out.println(reverse);
		
		if (reverse==temp)
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("Not paliandrome");
		}
	}

}
