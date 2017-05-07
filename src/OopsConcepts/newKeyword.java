package OopsConcepts;

class Dog
{
	int age;
	String name;
	
	void  Bark()
	{
		System.out.println("i am barking");
	}
	
}

public class newKeyword
{
	public static void main(String[] args)
	{  
	Dog Jimmy; // declares  reference to object Jimmy
	Jimmy = new Dog();  // new operator Allocates memory for Dog objects
	Jimmy.age=10;
	Jimmy.name="Jimmy";
	Jimmy.Bark();
	}
}
