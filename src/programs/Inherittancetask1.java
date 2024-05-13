package programs;
class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneno);
		System.out.println(address);
		System.out.println(salary);
	}
	
}
class Employee extends Member
{
	String specialisation;
	
}
class Manager extends Member
{
	String departments;
	
}
public class Inherittancetask1 {

	public static void main(String[] args) {
	Employee object = new Employee();
	object.address="AMBADAN";
	object.age=25;
	object.name="SHABNA";
	object.phoneno=8075555327l;
	object.salary=40000;
	object.printdetails();
	System.out.println(object.specialisation="Development");
	Manager ob=new Manager();
	ob.address="KUDILUNGAL";
	ob.age=30;
	ob.name="SHIFAS";
	ob.phoneno=8547295669l;
	ob.salary=50000;
	ob.printdetails();
	System.out.println(ob.departments="IT");

	}

}
