package controlstatements;

public class Switchcalculator {

	public static void main(String[] args) {
		
		int a=10,b=40,choice=5;
		
		switch(choice)
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

	}

}
