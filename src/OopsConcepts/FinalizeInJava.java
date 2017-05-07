package OopsConcepts;

public class FinalizeInJava
{
	public void finalize()
	{
		System.out.println("Object is garbage collected");
	}

	
	public static void main(String[] args)
	{
		new FinalizeInJava();// Anonymous object
		FinalizeInJava test = new FinalizeInJava();
		FinalizeInJava t = new FinalizeInJava();
		
		test=null;
		t=test;
		System.gc();// garbage collector

	}

}
