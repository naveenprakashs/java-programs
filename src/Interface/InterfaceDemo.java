package Interface;

class InterfaceDemo
{
	public static void main(String args[])
	{
		//sampleInterface ss = new sampleInterface(); 
		//learn: cannot instanitate interface
		sampleInterface i;
		SampleClass s = new SampleClass();
		s.print();
		s.newMethod();
		SampleClass2 s2 = new SampleClass2();
		s2.print();
		s2.hello();
		
		sampleInterface I;
		
		I = new SampleClass(); // interface can reference its method in which its implemented
		I.print();
		//I.newMethod(); interface don't have knowledge about other classes.
		// so it shows errors!
		
		I = new SampleClass2();
		I.print();
	}
}

// link: sampleInterface.java