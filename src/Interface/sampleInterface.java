package Interface;

public interface sampleInterface
{
    final public int InterfaceVariable=1111; 
	void print();  	
}

class SampleClass implements sampleInterface
{
	public void print() // it must be declared as public
	{
		System.out.println("i am from SampleClass");
		System.out.println(InterfaceVariable);
	}	
	void newMethod()
	{
		System.out.println("i am another method from SampleClass");
	}
}

class SampleClass2 implements sampleInterface
{  
	public void print()  // it must be declared as public
	{
		System.out.println("i am from SampleClass2");
	}
	public void hello()
	{
		System.out.println("i am another method from SampleClass2");
	}
}

 // link: InterfaceDemo



