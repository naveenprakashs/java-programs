package VariableLengthArguments;
class test
{
	void addNumbers(int numbers[]) // we can use it to create when we don't know how much parameters will be
    {
    	int sum=0;
    	System.out.println(numbers.length);
    	
    	for(int sums: numbers)
    	{
    		sum=sum+sums;
    	}
    	System.out.println(sum);		
    }
	
	void addNumbers(int a,int b,int c) // we can use when we know how much parameters will be
	{
		System.out.println((a+b+c));
	}
	
	void addNumberss(int ...v) // we  can use it when we don't how much parameters will be and it is effective method than using arrays
	{
		int sum=0;
		System.out.println(v.length);
		for(int sums: v)
    	{
    		sum=sum+sums;
    	}
    	System.out.println(sum);
	}
	
	//void addNumberss(int c,int k,long l,char ...cs,int ...i,long ...ll)
	// varargs parameter must be the last parameter
	// a method can have only one varargs parameter
	
	void addNumberss(int a,char c,long k,int ...i)
	{
	  System.out.println("over loading methods with varargs parameter");	
	}
	void addNubers(int a,char c,long k,long ...i)
	{
		System.out.println("over loading methods with varargs parameter");
	}
}
public class varArgs
{
	public static void main(String[] args)
	{
		int numbers[]={1,2,3,4,5};
		int numbers2[]={1,2};
		test t = new test();
		t.addNumbers(numbers);
		t.addNumbers(numbers2);
	}

}
