package Interface;

public interface outerInterface
{
    public interface innerInterface1
    {
    	void firstMethod();
    	void secondMethod();
    	
    	public interface innerInterface2
    	{
    		
    	}
    }  
}

class testClass implements outerInterface.innerInterface1
{
	public void firstMethod()
	{
		System.out.println("i am from a first method");
	}
	
	public void secondMethod()
	{
		System.out.println("i am from a second method");
	}
}

