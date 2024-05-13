package classandobject;

import java.util.Scanner;

public class Arraywithscanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER NUMBERS");
		
		int[] array=new int[5];
		
		for(int i=0;i<5;i++) {
			array[i] =sc.nextInt();
		}
		
		System.out.println("NUMBERS");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}

	}

}
