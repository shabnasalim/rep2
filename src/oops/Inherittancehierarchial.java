package oops;
class Animal
{
	public void animaldeails()
	{
		System.out.println("animal details");
	}
}
class Lion extends Animal
{
	public void lionmethod()
	{
		System.out.println("lionmethods");
	}
}
class Tiger extends Animal
{
	public void tigermethod()
	{
		System.out.println("tigermethod");
	}
}
public class Inherittancehierarchial {

	public static void main(String[] args) {
		Lion object=new Lion();
		object.animaldeails();
		object.lionmethod();

	}

}
