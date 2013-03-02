import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;
class StringNode
{
	private String data;
	private StringNode next;
	StringNode(String value)
	{
		data=value;
		next=null;
	}
	void SetNext(StringNode n)
	{
		next=n;
	}
	String GetData()
	{
		return data;
	}
	StringNode GetNext()
	{
		return next;
	}
}
class StringLL
{
	private StringNode head;
	private int Nos;
	StringLL()
	{
		head=null;
		Nos=0;
	}
	StringNode GetHead()
	{
		return head;
	}
	int GetNos()
	{
		return Nos;
	}
	void insert(String value)
	{
		if(head==null)
		{
			StringNode n=new StringNode(value);
			head=n;
			Nos++;
			return;
		}
		StringNode prev=null;
		StringNode cur=head;
		String test=cur.GetData();
		int c=test.compareTo(value);
		while(cur.GetNext()!=null && c<0)
		{
			prev=cur;
			cur=cur.GetNext();
			test=cur.GetData();
			c=test.compareTo(value);
		}
		if(cur==head)
		{
			if(c==0)
			{
				return;
			}
			if (c<0)
			{
				StringNode n=new StringNode(value);
				cur.SetNext(n);
				Nos++;
				return;
			}
			StringNode n=new StringNode(value);
			n.SetNext(cur);
			head=n;
			Nos++;
		}
		else if(c>0)
		{
			StringNode n=new StringNode(value);
			prev.SetNext(n);
			n.SetNext(cur);
			Nos++;
		}
		else if (c==0)
		{
			return;
		}
		else
		{
			StringNode n=new StringNode(value);
			cur.SetNext(n);
			Nos++;
		}
	}
	public String[] ToArray()
	{
		String[] arr=new String[Nos];
		StringNode cur=head;
		for(int i=0;i<Nos;i++)
		{
			arr[i]=cur.GetData();
			cur=cur.GetNext();
		}
		return arr;
	} 
	void merge(StringLL l)
	{
		StringNode cur=l.GetHead();
		for(int i=0;i<l.GetNos();i++)
		{
			insert(cur.GetData());
			cur=cur.GetNext();
		}
	}			
}
public class Solution
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in).useDelimiter("\\s*\n\\s*");
		int i,n,length,c,j;
		String string,sub;
		String[] arr;
		n=scan.nextInt();
		StringLL[] LL=new StringLL[n];
		for(i=0;i<n;i++)
		{
			LL[i]=new StringLL();
			string  = scan.next();
			length = string.length();
			for(c=0;c<length;c++)
			{
				for(j=1;j<=length-c;j++)
				{
					sub = string.substring(c,c+j);
					LL[i].insert(sub);
				}
			}
		}
		StringLL set=new StringLL();
		for(i=0;i<n;i++)
		{
			set.merge(LL[i]);
		}
		arr=set.ToArray();
		length=set.GetNos();
		c=scan.nextInt();
		for(i=0;i<c;i++)
		{
			j=scan.nextInt();
			if((j-1)<length)
			{
				System.out.println(arr[j-1]);
			}
			else
			{
				System.out.println("INVALID");
			}
		}
	}
}
