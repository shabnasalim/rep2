package oops;

public class Constructor {
	//declare instance variable
	String empname;
	int empid;
	//create constructor
	public Constructor(String empname,int empid)
	{
		this.empname=empname;//this statement is used to locate instance variable
		this.empid=empid;
	}
	public static void main(String[] args) {
		// Initialize instance variable values
		Constructor object=new Constructor("shabna",101);
		//print instance variable values
		System.out.println(object.empname);
		System.out.println(object.empid);

	}

}
