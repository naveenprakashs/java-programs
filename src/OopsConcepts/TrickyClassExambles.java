package OopsConcepts;


class sample
{
	String property="hello";
	
	public static void print()
	{
		// System.out.println(property); cannot make static reference to non static variables
		System.out.println("i am a method from sample class");
	}
	
}

public class TrickyClassExambles
{
    String msg="Hello";
	
	static void method()
	{
		System.out.println("i am inside the same class");
	}
	void NormalMethod()
	{
		System.out.println("i am a normal method");
	}
	public static void main(String[] args)
	{
		method();
	    //NormalMethod(); cannot call non static method inside the static method
		sample mySample;
		mySample=new sample(); // we can alos declare objects like this
      
	}

}
