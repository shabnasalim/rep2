package classandobject;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("ENTER ARRAY SIZE");
		int size=sc.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("ENTER ARRAY NUMBERS");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			sum = sum+array[i];
		}
		
		
		
		System.out.println("SUM OF ARRAY="+sum);
    
	}

}
