package OopsConcepts;

class Home
{
	int price;
	String Address;
	
	Home() // constructor with no parameter
	{
		System.out.println("constructor called");
		Address="New york";
	}
	
	Home(int p) // constructor with  parameter
	{
		System.out.println("parameterized constructor called");
		price=p;
	}
	
}



public class Constructers
{

	public static void main(String[] args)
	{
		Home myHome= new Home(1000); // paranthesis for calling constructors
		System.out.println(myHome.Address);
		
		Home house = new Home(); // paranthesis for calling default constructors
		System.out.println(house.Address);
		house.price=10;
		System.out.println(house.price);

	}

}
