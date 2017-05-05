
public class _7_BitWiseOperators
{

	public static void main(String[] args)
	{
	
		int a=1;
		int b=2;
		
		System.out.println(a|b);
		
		/*    0001  1
		 *    0010  2
		 *    ----
		 *    0011  3
		 * 
		 */
		
		System.out.println(a&b);
		
		/*  0001  1
		 *  0010  2
		 *  ----
		 *  0000  0
		 *  
		 */
	
		System.out.println(a^b);
		
		/*  0001 1 
		 *  0010 2
		 *  -----
		 *  0011  3
		 */
		
		
		System.out.println(~a);
		
		 /*  0001 1
		  *  ----
		  *  1110 -2
		  *  
		  */
		


		System.out.println(a<<1);
		
		// 0001 << 1  0010  2
		
		
		System.out.println(a>>1);
		
		// 0001 >> 1  0000  0 
		
		
		// unsigned right shift operator
		System.out.println(a>>>1);
		
		// 0001 >>> 1  0000  0 
		 
		// compound assignment in bitwise operaotor
		a|=b;
		a&=b;
		a^=b;
		a<<=1;
		a>>=1;
		a>>>=1;
		
	}

}
