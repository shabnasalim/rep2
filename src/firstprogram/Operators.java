package firstprogram;

public class Operators {

	public static void main(String[] args) {
		// ARITHMETIC OPERATORS
		
		System.out.println("----------ARITHMRTIC OPERATORS-----------");
		
		int a=20,b=30;
		
		System.out.println("a+b="+(a+b));//to add
		System.out.println("a-b="+(a-b));//to subtract
		System.out.println("a*b="+(a*b));//to multiply
		System.out.println("a/b="+(a/b));//to return quotient
		System.out.println("a%b="+(a%b));//to return reminder
		
		//ASSIGNMENT OPERATORS
		
		System.out.println("----------ASSIGNMENT OPERATORS-----------");
		
		System.out.println("a+=b="+(a+=b));//a = a+b
		System.out.println("a-=b="+(a-=b));//a = a-b
		System.out.println("a*=b="+(a*=b));//a = a*b
		System.out.println("a/=b="+(a/=b));//a = a/b
		System.out.println("a%=b="+(a%=b));//a = a%b
		//here value of a changes each time

		
		//RELATIONAL OPERATORS
		
		System.out.println("----------RELATIONAL OPERATORS-----------");
		
		int v1=10,v2=20;
		System.out.println(v1<v2);//less than
		System.out.println(v1<=v2);//less than or equal to
		System.out.println(v1>v2);//greater than
		System.out.println(v1>=v2);//greater than or equal to
		System.out.println(v1==v2);//check if the values are equal 
		System.out.println(v1!=v2);//check if the values are not equal
		
		//LOGICAL OPERATORS
		
		System.out.println("----------LOGICAL OPERATORS-----------");
		
		String username="shabna",password="abcd1234";
		System.out.println(username=="shabna" && password=="abcd1234");//Returns true when both condition is true
		System.out.println(username=="shaba" || password=="abcd1234");//Returns true when ay one of he condition is true
		System.out.println(!(username=="shabna"));//Returns true when condition is false
		System.out.println(!( password=="abcd1234"));
		
		//UNARY OPERATORS
		
		System.out.println("----------UNARY OPERATORS-----------");
		
		int v3=8;
		
		System.out.println(v3++);//first print value then add
		System.out.println(v3);//print added value
		System.out.println(++v3);//add first then print
		System.out.println(v3--);//print first then subtract
		System.out.println(v3);//print subtracted value
		System.out.println(--v3);//subtract first then print
		
		//TERNARY OPERATOR
		
		System.out.println("----------TERNARY OPERATORS-----------");
		
		//SYNTAX = variable = condition?exp1:exp2;
		// variable = to store the return value
		//exp1 = executes if the condition is true
		//exp2 = executes if the condition is false
		
		
		int a1=20,a2=30;
		
		String s3=a1>a2?"a1 is greter":"a2 is greter";
		System.out.println(s3);
		
	}

}
