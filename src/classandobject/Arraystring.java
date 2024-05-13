package classandobject;

import java.util.Scanner;

public class Arraystring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//scanner object declare
		
		System.out.println("ENTER SIZE");
		int size =sc.nextInt();//method to read size
		
		String[] array=new String[size];//declare array
		
		System.out.println("ENTER NAMES");
		for(int i=0;i<size;i++)//read array names
		{
			array[i]=sc.next();
		}
		
		System.out.println("LIST OF NAMES");
		for(int i=0;i<size;i++)//print array values 
		{
			System.out.println(array[i]);
		}

	}

}

