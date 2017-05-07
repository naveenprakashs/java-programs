package OopsConcepts;

class Stack
{
	int stack[]=new int[10];
	int tos;
	
	Stack()
	{
		tos=-1;
	}
	
	void push(int Value)
	{
		if(tos>=10)
		{
			System.out.println("stack is full");
		}
		else
		{
			stack[++tos]=Value;
			System.out.println("value accepted");
		}
		
	}
	
	void pop()
	{
		if(tos<0)
		{
			System.out.println("stack is underflow");
		}
		else
		{
			System.out.println(stack[tos--]);
		}
	}
	
	
}


public class StackClass
{

	public static void main(String[] args)
	{
		Stack stk =  new Stack();
		
		for(int a=0;a<10;a++)
		{
			stk.push(a);
		}
		for(int a=0;a<10;a++)
		{
			stk.pop();
		}

	}

}
