
public class _5_BooleanOperator
{

	public static void main(String[] args)
	{
		Boolean a = true;
		Boolean b = false;

		System.out.println("OR operator");
		System.out.println(a | b);
		System.out.println(a | a);
		System.out.println(b | b);
		System.out.println(b | a);

		System.out.println();

		System.out.println("AND operaotor");
		System.out.println(a & b);
		System.out.println(a & a);
		System.out.println(b & b);
		System.out.println(b & a);

		System.out.println();

		System.out.println("NOT operator");
		System.out.println(!a);
		System.out.println(!b);

		System.out.println();

		System.out.println("EXCLUSIVE OR");
		System.out.println(a ^ b);
		System.out.println(a ^ a);
		System.out.println(b ^ b);
		System.out.println(b ^ a);

		System.out.println();

		// short circuit AND and OR gates works same as OR and AND gates
		// AND and OR gates result can be predicted by one of its input so we
		// don't need to check both inputs
		// short circuit gates are faster than normal AND and OR gates

		System.out.println("SHORT CIRCUIT OR");
		System.out.println(a || b);
		System.out.println(a || a);
		System.out.println(b || b);
		System.out.println(b || a);

		System.out.println();

		System.out.println("SHORT CIRCUIT AND");
		System.out.println(a && b);
		System.out.println(a && a);
		System.out.println(b && b);
		System.out.println(b && a);

		System.out.println();
		
		System.out.println(a == b);
		System.out.println(a == a);
		System.out.println(b == b);
		System.out.println(b == a);

		System.out.println();
		
		System.out.println(a != b);
		System.out.println(a != a);
		System.out.println(b != b);
		System.out.println(b != a);
		
		// IMPORTENT
		// A boolean variable can have any expression that results a boolean value
		b=(a&&b);
		a=(a||b);
		
		// ASSIGNMENT AND OR XOR OPERATORS
		
		    System.out.println(a&=b);
			System.out.println(a&=a);
			System.out.println(b&=b);
			System.out.println(b&=a);
			System.out.println();
			System.out.println(a|=b);
			System.out.println(a|=a);
			System.out.println(b|=b);
			System.out.println(b|=a);
		    System.out.println();
			System.out.println(a^=b);
			System.out.println(a^=a);
			System.out.println(b^=b);
			System.out.println(b^=a);
		

	}

}
