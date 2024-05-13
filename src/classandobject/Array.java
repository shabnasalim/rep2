package classandobject;

public class Array {

	public static void main(String[] args) {
		
		int[] array=new int[5];//declare and initialise arry
		
		array[0]=45;//store values in array
		array[1]=67;
		array[2]=34;
		array[3]=99;
		array[4]=22;
		
		System.out.println("4h number="+array[3]);//rint single array value
		
		System.out.println("all numbers=");
		int length =array.length;//to get length of array
		System.out.println(length);
		
		for(int i=0;i<5;i++)//print all values in array
		{
			System.out.println(array[i]);
		}
		

	}

}
