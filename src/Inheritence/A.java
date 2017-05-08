package Inheritence;
class aa
{
	protected int i,j;
}
class b extends aa
{
	int k;
	
	void printResult()
	{
		System.out.println(k+i+j);
	}
}

public class A
{

	public static void main(String[] args)
	{
		b aaa = new b();
		aaa.i=1;
		aaa.j=2;
		aaa.k=3;
		
		aaa.printResult();

	}

}
