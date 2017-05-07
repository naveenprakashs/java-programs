package OopsConcepts;

class Bike
{
	String color;
	int price;
	int speed;
	int milage;
	String bikeName;
	
	void DisplayColor() // no parameter with void
	{
		System.out.println(color);
	}
	
	void IncreaseSpeed(int Speed) // parameter with void Speed is the parameter
	{
		speed=Speed;
		System.out.println("Speed increased to"+speed);
	}
	
	int GetBikeSpeed()  // no parameter with return
	{
		return speed;
	}
	
	String ChangeColor(String c) // with parameter with return type
	{
		color=c;
		return color;
	}	
}

public class Methods
{

	public static void main(String[] args)
	{
	 
		Bike Duke = new Bike();
		
		Duke.color="Green";
		Duke.DisplayColor();
		Duke.IncreaseSpeed(200); //   here 200 is the Argument
		System.out.println("new bike color:"+Duke.ChangeColor("orange"));
		System.out.println("Bike Speed:"+Duke.GetBikeSpeed());

	}

}
