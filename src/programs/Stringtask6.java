package programs;

import java.util.Scanner;

public class Stringtask6 {

	public static void main(String[] args) {
		// print repeated characters count in a string
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s=sc.next();
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=0;
				}
			}
			if(count>1 && ch[i]!=0)
			{
				System.out.println("REPEATED CHARACTER="+ch[i]);
				System.out.println("COUNT="+count);
			}
	}
	

}
}
