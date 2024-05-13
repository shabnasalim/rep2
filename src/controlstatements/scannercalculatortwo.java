package controlstatements;

import java.util.Scanner;

public class scannercalculatortwo {

	public static void main(String[] args) {
		int ch;
		do {
		System.out.println("ENTER TWO NUMBERS");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("ENTER YOUR CHOICE 1.add 2.subtract 3.multiply 4.divide");
		ch= sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("addition="+(a+b));
		break;
		case 2:System.out.println("subtraction="+(a-b));
		break;
		case 3:System.out.println("multiplication="+(a*b));
		break;
		case 4:System.out.println("DIVISION="+(a/b));
		break;
		default :System.out.println("INVALID CHOICE");

}
}while(ch>0 && ch<=4);
	}
}

