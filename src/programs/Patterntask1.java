package programs;

public class Patterntask1 {

	public static void main(String[] args) {
		//nested for loop
		//1
		//22
		//333
		//4444
		for(int i=1;i<=4;i++)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
