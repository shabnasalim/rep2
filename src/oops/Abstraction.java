package oops;

abstract class Animal1//abstract class hide implementation
{
	abstract public void eat();//declare abstract method
	public void sleeping()
	{
		System.out.println("SLEEPING");
	}
}

class Cat extends Animal1
{

	@Override
	public void eat() 
	{
		System.out.println("EATING");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		Cat ob=new Cat();
		ob.eat();
		ob.sleeping();

	}

}
