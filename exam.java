import java.util.Scanner;
class Employee
{
	private String Name;
	private int Id;
	private int Age;
	private float Salary;
	private String Title;
	private String Dept;
	Employee()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Name:");
		Name=s.nextLine();
		System.out.print("ID:");
		Id=s.nextInt();
		System.out.print("Age:");
		Age=s.nextInt();
		System.out.print("Salary:");
		Salary=s.nextFloat();
		System.out.print("Title:");
		Title=s.nextLine();
		System.out.print("Department:");
		Dept=s.nextLine();
	}
	public void ChangeSalary(float incr)
	{
		Salary*=(incr/100);
	}
	public float GetSalary()
	{
		return Salary;
	}
	public void display()
	{
		System.out.println("Name:"+Name+"\nID:"+Id+"\nAge:"+Age+"\nSalary:"+Salary+"\nTitle:"+Title+"\nDepartment:"+Dept);
	}
}
class Manager extends Employee
{
	private int EIds[];
	Manager()
	{
		super();
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("No of people supervised are:");
		n=s.nextInt();
		EIds=new int[n];
		System.out.println("Enter the EID's of people supervised:");
		for(int i=0;i<n;i++)
		{
			EIds[i]=s.nextInt();
		}
	}
	public void ChangeSalary(float incr)
	{
		super.ChangeSalary(incr);
	}
	public float GetSalary()
	{
		return super.GetSalary();
	}
	public void display()
	{
		super.display();
		System.out.println("EID's of people supervised:");
		for(int i=0;i<EIds.length;i++)
		{
			System.out.println(EIds[i]);
		}
	}
}
class Executive extends Manager
{
	private float Bonus;
	Executive()
	{
		super();
		Bonus=10f;
		super.ChangeSalary(Bonus);
	}
	public void SetBonus(int bns)
	{
		Bonus=bns;
		super.ChangeSalary(bns);
	}
	public float GetSalary()
	{
		return super.GetSalary();
	}
	public void display()
	{
		super.display();
		System.out.println("Bonus:"+Bonus);
	}
}
class exam
{
	public static void main(String args[])
	{
		//System.out.println("Menu:\n1.Manager\n2.Executive"); 
		Manager m=new Manager();
		m.display();
		Executive e=new Executive();
		e.display();
	}
}
