package Inheritence;
class aaa
{
	int width, height, length;

	aaa(int width, int height, int length)
	{
		this.width = width;
		this.height = height;
		this.length = length;
	}

	aaa()
	{

	}

	void volume()
	{
		System.out.println(width * height * length);
	}
}

class bbb extends aaa
{
	int weight;

	bbb(int weight, int length, int height, int width)
	{
		super(length, height, width); // it takes less effort and we can do it
										// even though super class members are
										// private
		this.weight = weight;
		super.height = height; // we can't do this if height is private
		super.width = width; // we can't do this if width is private
		super.length = length; // we can't do this if width is private

	}

	bbb()
	{

	}
}

public class examble1
{

	public static void main(String[] args)
	{
		bbb A = new bbb(11, 10, 10, 10);
		A.volume();
		A = new bbb(10, 11, 10, 10);
		A.volume();
	}

}
