package OopsConcepts;

class Static
{

	
	Static()
	{
		System.out.println("constructor initilized");
	}
	
	static int Value=1;
	int normalVariable=11;
	static int parameter=5;      
	static void print(int parameter)
	{
		//this.parameter=paremeter; ONLY STATIC VARIBLE ALLOWED
	    //normalVariable=parameter; ONLY STATIC VARIABLE ALLOWED
		System.out.println("hello i am static method!");
	    //System.out.print(normalVariable); static method won't  accept non static variables
		System.out.println(Value);	
		System.out.println("parameter accepted"+parameter);
	}
	
	static
	{
		System.out.println("static block initialised");
		
	}
}

public class UnderstandingStatic
{
	public static void main(String[] args)
	{
	    Static s  = new Static();
		Static.Value=100;
        Static.print(10);
	}

}
