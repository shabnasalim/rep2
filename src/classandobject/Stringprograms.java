package classandobject;

public class Stringprograms {

	public static void main(String[] args) {
		
		// STRING METHODS
		
		String s="hello";
		String s1="WELCOME TO LUMINAR";
		String s2="       HELLO         ";
		
		//CONCAT
		System.out.println("CONCAT");//joins two strings
		System.out.println(s.concat(s1));
		System.out.println(2+3+s+5+6);//before string + act as addition,when + is given with string act as concat
		
		//Equals
		System.out.println("EQUALS");//check whether two strings are same
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		//Contains
		System.out.println("CONTAINS");//check whether the given string contains
		System.out.println(s1.contains("LUMINAR"));
		
		//TO LOWERCASE & UPPERCASE
		System.out.println("TO UPPERCASE");//convert string to upper case
		System.out.println(s.toUpperCase());
		
		System.out.println("TO LOWERCASE");//convert string to lower case
		System.out.println(s.toLowerCase());
		
		//STARTS WITH & ENDS WITH
		
		System.out.println("STARTS WITH");//check whether the given string is in starting
		System.out.println(s1.startsWith("WELCOME"));
		
		System.out.println("ENDS WITH");//check it ends with given string
		System.out.println(s1.endsWith("LUMINAR"));
		
		//TRIM
		System.out.println("TRIM");//trim white spaces
		System.out.println(s2.trim());
		
		//CHARAT
		System.out.println("CHARAT");//print given index character
		System.out.println(s.charAt(2));
		
		//LENGTH
		System.out.println("LENGTH");//print length of string
		System.out.println(s.length());
		
		//SUBSTRING
		System.out.println("SUBSTRING");//print string from begin index to end index
		System.out.println(s1.substring(1,4));
		
		//REPLACE
		System.out.println("REPLACE");//replace old string to new string
		System.out.println(s.replace("hello","hai"));
		
		//SPLIT
		System.out.println("SPLIT");//split string to multiple strings
		String[] str=s1.split(" ");
		for (String v:str)
		{
			System.out.println(v);
		}
		
		//TO CHAR ARRAY
		System.out.println("toCharArray");//split string character wise 
		char[] ch=s2.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		

	}
}

