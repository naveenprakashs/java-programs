package OopsConcepts;

class demo
{
	int a;
	double d;
	char c;
	String s;
	
	demo(int a)
	{
		this.a=a;
		System.out.println("integer constructer called");
	}
	demo(double d)
	{
		this.d=d;
		System.out.println("double constructer called");
	}
	demo(char c)
	{
		this.c=c;
		System.out.println("char constructor called");
	}
	demo(String s)
	{
		this.s=s;
		System.out.println("String constructor called");
	}
	demo(int a,double d,char c,String s)
	{
		this.s=s;
		this.a=a;
		this.d=d;
		this.c=c;
		System.out.println("multiple paramters constructor called");
	}
}

public class ConstructorOverloading
{

	public static void main(String[] args)
	{
		demo a=new demo(1);
		demo b=new demo("hello");
		demo c=new demo(132.323);
		demo d=new demo('c');
		demo e=new demo(1,133.23,'c',"world");

	}

}
