package oops;
	//create other classes for inheritance
	class Parent
	{
		public void job()
		{
			System.out.println("job details");
		}
	}
	
	class Child extends Parent
	{
		public void name()
		{
			System.out.println("name of childs");
		}
	}
	public class Inherttancesingle {
	public static void main(String[] args) {
		//
		Child object=new Child();
		object.name();
		object.job();
		
		
				
		

	}

}
