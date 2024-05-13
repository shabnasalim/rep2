package programs;

public class Stringtask1 {

	public static void main(String[] args) {
		
		
		String s= " JAVA IS PLATFORM INDEPENDANT LANGUAGE";
		String s1= " JMETER IS A PERFORMANCE TESTING TOOL";
		
		
		System.out.println("QUESTION1");
		if(s.contains("PLATFORM"))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("NOT COTAINS");	
		}
		
		
		System.out.println("QUESTION2");
		String[] split=s1.split(" ");
		for(String v:split)
		{
			System.out.println(v);
		}
		
	

	}

}
