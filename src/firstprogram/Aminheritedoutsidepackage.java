package firstprogram;

import oops.Accessmodifier;

public class Aminheritedoutsidepackage extends Accessmodifier{

	public static void main(String[] args) {
		//Access modifier outside package inherited class
		Aminheritedoutsidepackage ob3=new Aminheritedoutsidepackage();
		System.out.println(ob3.c);//protected
		System.out.println(ob3.d);//public

	}

}
