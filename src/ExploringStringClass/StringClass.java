package ExploringStringClass;

public class StringClass
{

	public static void main(String[] args)
	{
		String myString="i"+"love"+"india";
		String firstObject="hello";
		String secondObject="world";
		String ThirdObject=firstObject+secondObject;
		
		String obj[] = {"one","two","three","four"};
		
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		
		
		// object.equals(object2) returns boolean results
		if(firstObject.equals(secondObject))
		{
			System.out.println("two strings are equal");
		}
		else
		{
			System.out.println("two strings are not equal");
		}
		
		// object.length returns length of the object
		System.out.println(firstObject.length());
		System.out.println(secondObject.length());
		
		//charAt(index) returns value at the index of a string
		System.out.println(firstObject.charAt(1));
		
	   	
	}

}
