package controlstatements;

public class Nestedifblooddonation {

	public static void main(String[] args) {
		
		int age=16,weight=45;
		
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println("Not eligible for blood donation: under weight");
			}
		}
			else
			{
				System.out.println("Not eligible for blood donation: under age");
			}
		}

	}


