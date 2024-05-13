package classandobject;

import java.util.Scanner;

public class Arrayprogram1 {

	public static void main(String[] args) {
		
		int zero=0;
		int negative=0;
		int positive=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER ARRAY SIZE");
		int size=sc.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("ENTER NUMBERS");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(array[i]==0)
			{
				zero++;
			}
			else if(array[i]<0)
			{
				negative++;
			}
			else
			{
				positive++;
			}
		}
		System.out.println("count of zero="+zero);
		System.out.println("count of negative="+negative);
		System.out.println("count of positive="+positive);

	}

}

