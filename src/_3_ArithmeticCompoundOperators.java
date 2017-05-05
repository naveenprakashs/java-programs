
public class _3_ArithmeticCompoundOperators
{

	public static void main(String[] args)
	{
		int a=20;
		int b=10;
		
		a+=b;
		System.out.println(a); // prints 30
		a=+b;// don't know how it prints 10
		System.out.println(a);
		
		a=2;
		b=1;
		
		a*=b;
		System.out.println(a);
		
		a=2;
		b=1;
		
		a/=b;
		System.out.println(a);
		
		a=2;
		b=1;
		a%=b;
		System.out.println(a);
		
		a=2;
		b=1;
		a-=b;
		System.out.println(a);
		
		a=1;
		b=5;
		a+=(b*a); // 1+(5*1);
		System.out.println(a);
		

	}

}
