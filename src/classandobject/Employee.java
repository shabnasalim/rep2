package classandobject;

public class Employee {//created class
	String empname;//class variable
	int empid;//class variable

	public static void main(String[] args) {
		Employee employee1=new Employee();//object for employee class
		System.out.println(employee1.empname="shabna");//call class variables through object
		System.out.println(employee1.empid=101);
		Employee employee2=new Employee();
		System.out.println(employee1.empname="Shifas");
		System.out.println(employee1.empid=102);
		
	}

}
