import java.util.Scanner;
class Stack{
void reset()
{
	top=-1;
}
void push(int item)
{
	if(top==9)
	System.out.println("Stack overflow");
	else
	stack[++top]=item;
}
void pop()
{
	if(top==-1)
	System.out.println("stack underflow");
	else
	System.out.println("The popped element is "+stack[top--]);
}
private
int [] stack=new int[10];
int top=-1;
}
public class W2q4{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Stack s=new Stack();		
		System.out.println("Menu:\n1.Reset the stack\n2.push into stack\n3.pop from stack\n4.exit\n");
		int choice,item;
		do
		{
			System.out.print("Enter your choice:");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:s.reset();
					break;
				case 2:System.out.print("Enter the element to be pushed:");
					item=scan.nextInt();
					s.push(item);
					break;
				case 3: s.pop();
					break;
				case 4:break;
			}
		}while(choice!=4);
	}
}
