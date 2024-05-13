package method;

public class Methodareaofshapes {

	public static void main(String[] args) {
		Methodareaofshapes object=new Methodareaofshapes();
		object.circle();
		object.triangle(8, 10);
		int s=object.square(8);
		System.out.println("area of square="+s);
		int r=object.rectangle();
		System.out.println("area of rectangle="+r);
		

	}
	
	//without parameter & return type
	public void circle()
	{
		int r=5;
		double area=3.14*r*r;//pie*r^2
		System.out.println("area of circle="+area);
	}
	
	//with parameter without return type
	public void triangle(int b,int h)
	{
		double area =0.5*b*h;//1/2*b*h
		System.out.println("area of triangle="+area);
	}
	
	//with parameter & return type
	public int square(int a)
	{
		int area=a*a;//a2
		return area;
	}
	
	//without parameter and with return type
	public int rectangle()
	{
		int l=9,b=12;//l*w
		int area = l*b;
		return area;
	}

}
