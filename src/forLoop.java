
public class forLoop
{

	public static void main(String[] args)
	{

	   // for loop condtion is boolean	
		
		int a; int b=2;
		for(a=0,b=1;a<10;a++,b++) // you can increment  and initialize variables as much as you can
			System.out.println(a);
		
		for(a=0;a<10;a++);
			System.out.println(a); // this loop will not run even single time
		
           System.out.println(a); // it will print 10
           
  /*         for(;;a++)  you can skip condtion and initialization
           {
          	 
           }  
           
           
           for(a=0;;) you can skip condion and increment or decrement
           {
        	   
           }
           
           for(;a<4;) you can skip initialization and inrement or decrement
           {
        	   
           }
           
           
         for(;;) // it is for infinitive loop  you can skip all
         {
        	 
         }  
   */    
           for(System.out.println("hello world");a<10;a++)
   			System.out.println(a);
           
           for(a=0;a<10;System.out.println("hello world"))
   			   System.out.println(a);	
           
           for(System.out.println("hello world");a<10;a++)
   			   System.out.println(a);
	}

}
