// objective: inner class can be created in any scope of outer class

package InnerClasses;

class outerClass
{
	c C = new c(); //we can create objects 
	
	void print()
	{
		for(int a=0;a<=5;a++)
		{
			//innerClass kd = new innerClass(); // learn: we can't use class before it is created in local scope
			
			 class innerClass 
			  {
				  int innerData; // learn: here we have created a inner class in the scope of a outer class method 
				  
				  innerClass()
				  {
					  System.out.println("inner class created");
				  }
				  void print()
				  {
					  System.out.println("hello world");
				  }
			  }
			 
			 innerClass k = new innerClass();
			 k.print();
			 
		}
		//innerClass k = new innerClass(); learn: we can't create object for inner class out of it's scope
	}
	
	class c
	{
		
	}
	c dd = new c();
	
}


public class InnerClassExamble1
{

	public static void main(String[] args)
	{
		outerClass o = new outerClass();
		o.print();
		//innerClass k = new innerClass();
		
	}

}
