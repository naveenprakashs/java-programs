// objective: demonstrating a simple inner class
// objective1: inner class can access outer class variable and method
// objective2: inner class can access even private members of the outer class
// objective3: outer class cannot access members of inner class directly

package InnerClasses;
class outerrr
{
	int outerVariable=10;
	private int outer=10;
	void Outerprint()
	{
		//Innerprint(); learn: outer class cannot access inner class method
		System.out.println("i am outer  method");
	}
	
	class inner
	{
		int innerVariable=100;
		void Innerprint()
		{
			System.out.println("i am inner method");
			System.out.println(outerVariable); // learn: inner class  can access outer class variable
			Outerprint(); // learn: inner class can access outer class method
	        outer=1; // learn : inner class can access even private member of outer class
		}
	}
}

public class InnerClassExamble
{

	public static void main(String[] args)
	{
		

	}

}
