package classandobject;

import java.util.Scanner;

public class Foreachmultiarray {

	public static void main(String[] args) {
		
int array[][]=new int[4][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER NUMBERS");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]= sc.nextInt();
			}
		}
		
		for(int v[]:array) //temp array to fetch row and column values
		{
			for(int v1:v)//temp variable to fetch single values from temp array
			{
				System.out.print(v1+" ");
			}
			System.out.println();
		}

	}

}
