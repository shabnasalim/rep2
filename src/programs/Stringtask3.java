package programs;

public class Stringtask3 {

	public static void main(String[] args) {
		
		//output = center training testing
		
		String s ="TESTING TRAINING CENTER";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}

	}

}
