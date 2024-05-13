package classandobject;

import java.util.Scanner;

public class Arraylargestelement {

	public static void main(String[] args) {
		int b=0;
		
		Scanner s=new Scanner(System.in);
		
		int[] array=new int[6];
		
		System.out.println("ENTER NUMBERS");
		for(int i=0;i<6;i++)
		{
			array[i]=s.nextInt();
		}
		
		for(int i=0;i<6;i++)
		{
			if(array[i]>b)
			{
				b=array[i];
			}
		}
		
		System.out.println("LARGEST NUMBER="+b);

	}

}
