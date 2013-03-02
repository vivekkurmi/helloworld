import java.util.Scanner;
class Stack
{
	int stack[]=new int[10];
	int tos;
	Stack()
	{
		tos=-1;
	}
	boolean IsEmpty()
	{
		if(tos==-1)
		return true;
		else 
		return false;
	}
	boolean IsFull()
	{
		if(tos==9)
		return true;
		else 
		return false;
	}
	void push(int item)
	{
		if (IsFull()==true)
		{
			System.out.println("Stack full.");
		}
		else
		{
			stack[++tos]=item;
		}
	}
	void pop()
	{
		if(IsEmpty()==true)
		{
			System.out.println("Stack empty.");
		}
		else
		{
			System.out.println("The popped element is "+stack[tos--]);
		}
	}
	void display()
	{
		System.out.println("The content of stack are :");
		for(int i=tos;i>=0;i--)
		{
			System.out.println(stack[tos]);
		}
	}
}
class DoubleEndedStack extends Stack
{
	int bos;
	DoubleEndedStack()
	{
		super();
		bos=0;
	}
	void PushBottom(int item)
	{
		if (bos==0 && tos==-1)
		{
			stack[++tos]=item;
		}
		else if(bos!=0)
		{
			stack[--bos]=item;
		}
		else
		{
			System.out.println("Stack full.");
		}
	}
	void PushTop(int item)
	{
		if(IsFull()==true)
		{
			System.out.println("Stack full.");
		}
		else
		{
			stack[++tos]=item;
		}
	}
	void PopBottom()
	{
		if(bos>tos)
		{
			bos=0;
			tos=-1;
			System.out.println("Stack empty");
		}
		else
		{
			System.out.println("The popped element is "+stack[bos++]);
		}
	}
	void PopTop()
	{
		if(bos>tos)
		{
			bos=0;
			tos=-1;
			System.out.println("Stack empty");
		}
		else
		{
			System.out.println("The popped element is "+stack[tos--]);
		}
	}
	void display()
	{
		System.out.println("The content of stack are :");
		for(int i=tos;i>=bos;i--)
		{
			System.out.println(stack[i]);
		}
	}	
}
class W5q4
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int item,choice;
		DoubleEndedStack s=new DoubleEndedStack();
		System.out.print("Menu:\n1.Push top\n2.Push Bottom\n3.Pop Top\n4.Pop Bottom\n5.Display\n6.Exit");
		do
		{
			System.out.print("\nEnter your choice:");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:	System.out.print("Enter the element to be pushed:");
						item=scan.nextInt();
						s.PushTop(item);
						break;
				case 2:	System.out.print("Enter the element to be pushed:");
						item=scan.nextInt();
						s.PushBottom(item);
						break;
				case 3:	s.PopTop();
						break;
				case 4:	s.PopBottom();
						break;
				case 5:	s.display();
						break;
				default: break;
			}
		}while(choice!=6);
	}
}
		

