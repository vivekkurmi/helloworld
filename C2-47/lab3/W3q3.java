import java.util.Scanner;
class IntNode
{
	private int data;
	private IntNode next;
	IntNode()
	{
		data=0;
		next=null;
	}
	IntNode(int value)
	{
		data=value;
		next=null;
	}
	void SetNext(IntNode n)
	{
		next=n;
	}
	IntNode GetNext()
	{
		return next;
	}
	int GetData()
	{
		return data;
	}
}
class IntLL
{
	private IntNode head;
	private int NosItem;
	IntLL()
	{
		head=null;
		NosItem=0;
	}
	int GetNosItems()
	{
		return NosItem;
	}
	boolean IsEmpty()
	{
		if(head==null)
		return true;
		else
		return false;
	}
	void AddAtLast(int value)
	{
		IntNode n=new IntNode(value);
		if (head==null)
		{
			head=n;
			NosItem++;
		}
		else		
		{
			IntNode cur=head;
			while(cur.GetNext()!=null)
			{	
				cur=cur.GetNext();
			}
			cur.SetNext(n);
			NosItem++;
		}
	}
	void DeleteAtHead()
	{
		if(IsEmpty()==true)
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("The deleted element is "+head.GetData());
			head=head.GetNext();
			NosItem--;
		}
	}
	public String ToString()
	{	
		String List="";
		IntNode cur=head;
		for(int i=0;i<NosItem;i++)
		{
			List+=cur.GetData()+" ";
			cur=cur.GetNext();
		}
		return List;
	}
}
public class W3q3
{
	public static void main(String args[])
	{
		IntLL LL=new IntLL();
		Scanner scan=new Scanner(System.in);
		System.out.println("Menu:\n1.Add at last\n2.delete at head\n3.display the list\n4.exit");
		int choice,item;
		do
		{
			System.out.print("Enter your choice:");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:	System.out.print("Enter the element to be inserted:");
					item=scan.nextInt();
					LL.AddAtLast(item);
					break;
				case 2: LL.DeleteAtHead();
					break;
				case 3:	System.out.println("The linked list is:\n"+LL.ToString());
					break;
				case 4:	break;
			}
		}while(choice!=4);
	}
}




		
	
