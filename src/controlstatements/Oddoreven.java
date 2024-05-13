package controlstatements;

public class Oddoreven {

	public static void main(String[] args) {
		int oddcount=0;
		int evencount=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				evencount++;
				
			}
			else 
			{
				oddcount++;
				
			}
			
		}
		System.out.println("oddcount="+oddcount);
		System.out.println("evencount="+evencount);
	}

}
