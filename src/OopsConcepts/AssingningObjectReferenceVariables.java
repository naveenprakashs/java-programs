package OopsConcepts;

class car
{
	int price;
	String color;
	int MaxSpeed;
	
}

public class AssingningObjectReferenceVariables
{

	public static void main(String[] args)
	{
		car innova = new car();
		car swift  = new car();
		
		innova.price=100;
		innova.color="green";
		innova.MaxSpeed=230;
		
		System.out.println("Specs of innova");
		System.out.println(innova.price+" "+innova.color+" "+innova.MaxSpeed);
		
		swift=innova;
		System.out.println("Specs of swift after copying innova");
		System.out.println(swift.price+" "+swift.color+" "+swift.MaxSpeed);
		
		innova=null;
		System.out.println("Specs of swift after destroying innova");
		System.out.println(swift.price+" "+swift.color+" "+swift.MaxSpeed);
	}

}
