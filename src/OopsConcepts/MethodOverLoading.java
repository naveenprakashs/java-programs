package OopsConcepts;

class printandADD
{
	int a,b,c;
	float fa,fb,fc;
	double da,db,dc;
	
	void add(byte a,byte b)
	{
		System.out.println("a+b= "+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("a+b= "+(a+b));
	}
	void print(int a)
	{
		System.out.println("printing integer "+a);
	}
	void print(float f) 
	{
		System.out.println("printing float "+fa);
	}
	void print(double da)
	{
		System.out.println("printing double "+da);
	}	
	
	char print(char a) // return type does't matter in method  overloading
	{
		return a;
	}
}

public class MethodOverLoading
{

	public static void main(String[] args)
	{
		printandADD obj = new printandADD();
		obj.print(100);
		obj.print(100.2);
		obj.print(13434.23423423);
		// obj.add(190.100, 110.00); cannot convert float to int refer Automated type conversion in JAVA
		obj.add(1000,1000);// here we are passing intergers and it converts into float

	}

}
