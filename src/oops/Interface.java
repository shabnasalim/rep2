package oops;

interface Car//interface to declare methods
{
	public void acceleration();
	void enginespeed();//by default it is public 
}

interface Carworkshop
{
	public void workshop();
}

class Nexon implements Car,Carworkshop //can implement interface to class
{
//implement unimplemented methods, implementation given to methods
	@Override
	public void workshop() {
		System.out.println("nexon workshop");
		
	}

	@Override
	public void acceleration() {
		System.out.println(" nexon acceleration");
		
	}

	@Override
	public void enginespeed() {
		System.out.println("nexon enginespeed");
		
	}
	
}

class Maruthi implements Car
{

	@Override
	public void acceleration() {
		System.out.println(" maruti acceleration");
		
	}

	@Override
	public void enginespeed() {
		System.out.println("maruthi enginespeed");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Car ob=new Nexon();//interface object reference created to call methods in interface
		ob.acceleration();
		ob.enginespeed();
		ob=new Maruthi();
		ob.acceleration();
		ob.enginespeed();
		Carworkshop ob1=new Nexon();
		ob1.workshop();

	}

}
