package oops;

public class Mathodoverloading {

	public static void main(String[] args) {
		// COMPILE TIME POLYMORPHISM
		Mathodoverloading ob=new Mathodoverloading();
		ob.add(44, 88);
		ob.add(22, 66, 99);
		ob.add(22.56, 11);
		ob.add(33, 44.56);
	}
	
	public void add(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c)//change number of parameters
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	public void add(double a,int b)//change data type
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b)//change order of data type
	{
		double c=a+b;
		System.out.println(c);
	}

}
