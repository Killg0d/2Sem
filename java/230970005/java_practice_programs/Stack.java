class Stack
{
	private static int top=-1;
	static int MAX=10;
	private static int s[]=new int[MAX];
	public static void push(int val)
	{
		if(isFull())
		{
			System.out.println("Stack Is Full!!!");
		}
		else
		{
			s[++top]=val;
		}
	}

	public static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Is Empty!!!");
		}
		else
		{
			int data=s[top--];
			System.out.println(data);
		}
	}
	public static int peek()
	{
		return top;
	}
	public static boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	public static boolean isFull(){
		if (top>=MAX)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Stack.pop();
		Stack.push(10);
		Stack.pop();
	}
}