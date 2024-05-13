package method;

public class Methodprogram {

	public static void main(String[] args) {
		Methodprogram object=new Methodprogram();//object created to call new method
		object.add();//call add method to main method(only then it works)
		object.sub(30, 20);//call sub method and pass parameters
		int m=object.mul(45,12);//call mul method,pass parameters.,return c
		System.out.println("mul="+m);//statement to print m
		double d=object.div();
		System.out.println("div="+d);
		
	

	}

	
	//METHOD WITHOUT PARAMETER AND WITHOUT RETURNTYPE
	public void add()//accessmodifier returntype methodname (parameter datatype variablename)
	{
		int a=30,b=40;
		int c=a+b;
		System.out.println("add="+c);
		}
	
	//METHOD WITH PARAMETER AND WITHOUT RETURN TYPE
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub="+c);
	}
	
	//METHOD WITH PARAMETER AND WITH RETURN TYPE
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	//METHOD without parameter and with returntype
	public double div()
	{
		double a=3.4, b=2.2;
		double c=a/b;
		return c;
	}
}
