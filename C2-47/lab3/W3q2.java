import java.util.Scanner;
class student{
	private String name;
	private int rollno;
	student(String s,int r)
	{
		name=s;
		rollno=r;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll no.="+rollno);
	}
}
class Stack{
	Stack()
	{
		stack=new student[3];		
		top=-1;
	}
	boolean isfull()
	{
		if (top==2)
		return true;
		else
		return false;
	}
	boolean isempty()
	{
		if (top==-1)
		return true;
		else
		return false;
	}
	void push(student s)
	{
		if(isfull()==true)
		System.out.println("Stack overflow");
		else
		stack[++top]=s;
	}
	void pop()
	{
		if(isempty()==true)
		System.out.println("stack underflow");
		else
		{
			System.out.println("The popped record is ");
			stack[top].display();
			top--;
		}
	}
	void stackTop()
	{
		if(isempty()==true)
		System.out.println("stack empty");
		else
		{
			System.out.println("The record at top of the stack is:");
			stack[top].display();
		}
	}
	void displayFromTop()
	{
		if(isempty()==true)
		System.out.println("stack empty");		
		for(int i=top;i>=0;i--)
		{	
			stack[i].display();
			System.out.println();
		}
	}
	void displayFromBot()
	{
		if(isempty()==true)
		System.out.println("stack empty");		
		for(int i=0;i<=top;i++)
		{	
			stack[i].display();
			System.out.println();
		}
	}
	private student stack[];
	private int top=-1;
}
public class W3q2{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Stack s=new Stack();		
		System.out.println("Menu:\n1.push into stack\n2.pop from stack\n3.Record at the top\n4.Stack from top\n5.Stack from bottom\n6.exit\n");
		int choice,item,r;
		String str;
		do
		{
			System.out.print("Enter your choice:");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:	System.out.println("Enter the record to be pushed:");
					System.out.print("Name=");
					str=scan.next();
					System.out.print("Roll no.=");
					r=scan.nextInt();
					student std=new student(str,r);
					s.push(std);
					break;
				case 2: s.pop();
					break;
				case 3:	s.stackTop();
					break;
				case 4:	System.out.println("Stack from top is:");
					s.displayFromTop();
					break;
				case 5: System.out.println("Stack from bottom is:");
					s.displayFromBot();
					break;
				case 6:	break;
			}
		}while(choice!=6);
	}
}
