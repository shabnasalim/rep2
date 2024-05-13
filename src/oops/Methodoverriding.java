package oops;

class Father
{
	public void phone()
	{
		System.out.println("SAMSUNG");
	}
}

class Son extends Father
{
	@Override//PARENT METHOD OVERIDE ,IMPLEMENTATION CHANGE ,METHOD SAME
	public void phone() 
	{
		System.out.println("I PHONE");
		super.phone();//TO CALL PARENT METHOD
	}	
}

public class Methodoverriding {
	public static void main(String[] args) {
		// RUN TIME POLYMORPHISM
		Son ob=new Son();
		ob.phone();
	}

}
