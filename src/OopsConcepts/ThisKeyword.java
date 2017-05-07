package OopsConcepts;

class circle
{
	//when a local variable has the same name as an instance variable, the local variable hides the
	//instance variable.
	int radius;
	
	void Setradius(int radius)
	{
		this.radius=radius; //  here we are using this keyword for specifying radius which belongs to class
		                   // but not local variable
	}
}


public class ThisKeyword
{

	public static void main(String[] args)
	{
		circle c = new circle();
		c.Setradius(100);
		System.out.println(c.radius);

	}

}
