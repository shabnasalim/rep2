package oops;

public class Amwithinpackage {

	public static void main(String[] args) {
		//Access modifier within package visibility
		Accessmodifier ob1=new Accessmodifier();
		System.out.println(ob1.b);//default
		System.out.println(ob1.c);//protected
		System.out.println(ob1.d);//public

	}

}
