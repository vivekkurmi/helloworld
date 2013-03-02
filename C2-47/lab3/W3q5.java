import java.util.Scanner;
class IntNode
{
	private int data;
	private IntNode next;
	IntNode(int value)
	{
		data=value;
		next=null;
	}
	void SetNext(IntNode n)
	{
		next=n;
	}
	int GetData()
	{
		return data;
	}
	IntNode GetNext()
	{
		return next;
	}
}
class IntLL
{
	private IntNode head;
	private int Nos;
	IntLL()
	{
		head=null;
		Nos=0;
	}
	IntNode GetHead()
	{
		return head;
	}
	int GetNos()
	{
		return Nos;
	}
	void insert(int value)
	{
		if(head==null)
		{
			IntNode n=new IntNode(value);
			head=n;
			Nos++;
			return;
		}
		IntNode prev=null;
		IntNode cur=head;
		while(cur.GetNext()!=null && cur.GetData()<value)
		{
			prev=cur;
			cur=cur.GetNext();
		}
		if(cur==head)
		{
			if(cur.GetData()==value)
			{
				return;
			}
			if (cur.GetData()<value)
			{
				IntNode n=new IntNode(value);
				cur.SetNext(n);
				Nos++;
				return;
			}
			IntNode n=new IntNode(value);
			n.SetNext(cur);
			head=n;
			Nos++;
		}
		else if(cur.GetData()>value)
		{
			IntNode n=new IntNode(value);
			prev.SetNext(n);
			n.SetNext(cur);
			Nos++;
		}
		else if (cur.GetData()==value)
		{
			return;
		}
		else
		{
			IntNode n=new IntNode(value);
			cur.SetNext(n);
			Nos++;
		}
	}
	public String ToString()
	{	
		String List="";
		IntNode cur=head;
		for(int i=0;i<Nos;i++)
		{
			List+=cur.GetData()+" ";
			cur=cur.GetNext();
		}
		return List;
	}
	void merge(IntLL l)
	{
		IntNode cur=l.GetHead();
		for(int i=0;i<l.GetNos();i++)
		{
			insert(cur.GetData());
			cur=cur.GetNext();
		}
	}			
}
public class W3q5
{
	public static void main(String args[])
	{
		IntLL LL1=new IntLL();
		IntLL LL2=new IntLL();
		IntLL LL3=new IntLL();
		Scanner scan=new Scanner(System.in);
		System.out.println("Menu:\n1.Add in 1st list\n2.Add in second list\n3.display the 1st list\n4.display the 2nd list\n5.Merge lists\n6.exit");
		int choice,item;
		do
		{
			System.out.print("Enter your choice:");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:	System.out.print("Enter the element to be inserted:");
						item=scan.nextInt();
						LL1.insert(item);
						break;
				case 2: System.out.print("Enter the element to be inserted:");
						item=scan.nextInt();
						LL2.insert(item);
						break;
				case 3:	System.out.println("The linked list is:\n"+LL1.ToString());
						break;
				case 4:	System.out.println("The linked list is:\n"+LL2.ToString());
						break;
				case 5: LL3.merge(LL1);
						LL3.merge(LL2);
						System.out.println("The merged linked list is:\n"+LL3.ToString());
						break;
				case 6: break;
			}
		}while(choice!=6);
	}
}
