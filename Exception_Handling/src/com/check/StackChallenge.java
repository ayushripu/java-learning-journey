package com.check;
class OverFlowException extends Exception
{
	public String toString()
	{
		return "Strack is Full";
	}
}
class UnderFlowException extends Exception
{
	public String toString()
	{
		return "Strack is Empty";
	}
}
class stack
{
	private int size;
	private int top=-1;
	private int s[];
	public stack(int sz)
	{
		size=sz;
		s=new int[sz];
	}
	
	public void push(int x) throws OverFlowException
	{
		if(top==size-1)
		{
			throw new OverFlowException();
		}	
			top++;
			s[top]=x;
	}
	public int  pop() throws UnderFlowException
	{
		int x=-1;
		if(top == -1)
			throw new UnderFlowException();
		x=s[top];
		top--;
		return x;
	}
}
public class StackChallenge {

	public static void main(String[] args) {
			stack st=new stack(5);
					try {
						st.push(10);
						st.push(6);
						st.push(11);
						st.push(33);
						st.push(95);
						st.push(56);
						} 
						catch (OverFlowException e) 
						{
						System.out.println(""+e);
						}
					
	}

}
