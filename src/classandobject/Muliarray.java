package classandobject;

import java.util.Scanner;

public class Muliarray {

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
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
