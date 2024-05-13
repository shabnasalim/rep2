package controlstatements;

import java.util.Scanner;

public class Scannerprogram {//to read inputs from console

	public static void main(String[] args) {
	
		System.out.println("ENTER A NUMBER");//TEXT DISPLAYED IN CONSOLE
		Scanner sc=new Scanner(System.in);//Scanner name of predefined class
		//import scanner
		//sc object name
		//system.in tells that read input from console
		int a= sc.nextInt();//int a variable to store readed value
		//nextint() method to read input integer
		System.out.println("value of a="+a);
		

	}

}
