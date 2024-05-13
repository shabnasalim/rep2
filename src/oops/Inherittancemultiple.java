package oops;
//create multiple classes
class First
{
	public void id()
	{
		System.out.println("id no");
	}
}
class Second extends First
{
	public void name()
	{
		System.out.println("name");
	}
}
class Third extends Second
{
	public void age()
	{
		System.out.println("age");
	}
}
class Fourth extends Third
{
	public void address()
	{
		System.out.println("address");
	}
}
public class Inherittancemultiple {

	public static void main(String[] args) {
		Fourth object=new Fourth();//object created for fourth
		object.address();//can call methods from inherited classes
		object.age();
		object.name();
		object.id();

	}

}
