package oops;

public class Accessmodifier {

	private int a=20;//visible only in this class
	int b=30;//default - visible in this class,within package
	protected int c=50;//visible in this class, within package, outside package class
	public int d=69;//visible in this class,within package,outside package,OP inherited class
	public static void main(String[] args) {
		
		Accessmodifier ob=new Accessmodifier();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);

	}

}
