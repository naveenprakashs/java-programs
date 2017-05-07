package OopsConcepts;

class Animal
{
	int age;
	int weight;
	String sex;

	Animal()
	{
		
	}
    	
	Animal(Animal Dog)
	{
		age=Dog.age;
		weight=Dog.weight;
		sex=Dog.sex;
	}
	
	void IsSame(Animal dog)
	{
		if(dog.age==age&&dog.weight==weight&&dog.sex==sex)
		{
			System.out.println("both animals are same");
		}
	}
	
	Animal growDog(Animal dog)
	{
		dog.age=dog.age+2;
		dog.weight=dog.weight+10;
		return dog;
	}
	
}


public class ObjectsAsParameters
{

	public static void main(String[] args)
	{
		Animal mypetDog = new Animal();
		mypetDog.age=22;
		mypetDog.weight=10;
		mypetDog.sex="male";
		
		Animal kutty = new Animal(mypetDog);
		System.out.println("Details of kutty");
		System.out.println(kutty.age);
		System.out.println(kutty.weight);
		System.out.println(kutty.sex);
		
		mypetDog.IsSame(kutty);
		
		System.out.println("kutty after growing");
		kutty.growDog(kutty);
		System.out.println(kutty.age);
		System.out.println(kutty.weight);
}

}
