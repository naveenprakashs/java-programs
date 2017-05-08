class aa
{
	int a=1;
	int b=2;
}

class bb extends aa
{
	int c=3;
	int d=4;
}
public class Inheritence2
{

	public static void main(String[] args)
	{
		aa a = new aa();
		bb b = new bb();
		a=b; // it is possible to give child class reference to the father class object
	    //System.out.println(a.c);
	}

}
