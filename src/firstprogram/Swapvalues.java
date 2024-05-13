package firstprogram;

public class Swapvalues {

	public static void main(String[] args) {
		int a=10,b=20;
		
		//with variable swapping
		
		System.out.println("WITH VRIABLE SWAPPING");
		
		int c;
		System.out.println("Before swapping a="+a);
		System.out.println("Before swapping b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a="+a);
		System.out.println("after swapping b="+b);
				
		//without variable swapping
		
		System.out.println("WITHOUT VRIABLE SWAPPING");
		int a1=10,b1=20;
		System.out.println("Before swapping a1="+a1);
		System.out.println("Before swapping b1="+b1);
		a1=a1+b1;//10+20=30
		b1=a1-b1;//30-20=10
		a1=a1-b1;//30-10=20
		System.out.println("after swapping a1="+a1);
		System.out.println("after swapping b1="+b1);
	}

}
