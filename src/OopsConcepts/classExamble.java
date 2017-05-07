package OopsConcepts;


class Human
{
	String name;  // properties also called as instance variables
	String sex;
	int age;
    float height;
    float weight;
    String food;
    
    public void speak() // Attributes
    {
    	int a; // local variables
    	System.out.println("Hello, i am human and i can speak");
    }
    public void run()
    {
    	System.out.println("i am running");
    }
    
    public void WhatIsYourName()
    {
    	System.out.println("my name is "+name);
    }
    public void Eat()
    {
    	System.out.println("i am eating "+food); 	
    }
    
    
}



public class classExamble
{

	public static void main(String[] args)
	{
		
		Human Naveen = new Human();
		Naveen.name="Naveen prakash";
		Naveen.age=22;
		Naveen.sex="male";
		Naveen.weight=47f;
		Naveen.height=175.66f;
		Naveen.food="kit-Kat";
		
		Naveen.speak();
		Naveen.run();
		Naveen.WhatIsYourName();
		Naveen.Eat();

	}

}
