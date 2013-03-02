public class linkmeup
{
	int data;
	linkmeup next;
	linkmeup(int num)
	{
		data=num*num;
		next=null;
	}
	linkmeup()
	{
		this(0);
	}
	linkmeup add(int num)
	{
		linkmeup temp=new linkmeup(num);
		temp.next=this;
		return temp;
	}
	void display()
	{
		linkmeup temp=this;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
}
