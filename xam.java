class Employee
{
	private String Name;
	private int Id;
	private
	Employee(String n,int i)
	{
		Name=n;
		Id=i;
	}
	void display()
	{
		System.out.println(Name+" "+Id);
	}
}
class Manager extends Employee
{
	private int Salary;
	Manager(String n,int i,int s)
	{
		super(n,i);
		Salary=s;
	}
	void display()
	{
		super.display();
		System.out.println(Salary);
	}
}
class xam
{
	public static void main(String args[])
	{
		Manager m=new Manager("vivek",1109,50000);
		m.display();
	}
}
