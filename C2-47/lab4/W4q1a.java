import java.util.*;
import java.util.Scanner;
class Student
{
	private String Name;
	private int RegNo;
	private GregorianCalendar Date;
	private short Semester;
	private float GPA;
	private float CGPA;
	private static int count=0;
	Student()
	{
		count ++;
		Scanner scan=new Scanner(System.in);
		System.out.print("Name:");
		Name=scan.nextLine();
		System.out.print("Date of joining:");
		Date=new GregorianCalendar();
		Date.set(Calendar.DATE,scan.nextInt());
		Date.set(Calendar.MONTH,scan.nextInt());
		Date.set(Calendar.YEAR,scan.nextInt());
		System.out.print("Semester:");
		Semester=scan.nextShort();
		System.out.print("GPA:");
		GPA=scan.nextFloat();
		System.out.print("CGPA:");
		CGPA=scan.nextFloat();
		RegNo=CalRegNo(Date.get(Calendar.YEAR));
	}
	Student(String n,int r,int d,int m,int y,int s,float g,float c)
	{
		count++;
		Name=n;
		Date=new GregorianCalendar();
		Date.set(Calendar.DATE,d);
		Date.set(Calendar.MONTH,m);
		Date.set(Calendar.YEAR,y);
		Semester=(short)s;
		GPA=g;
		CGPA=c;
		RegNo=CalRegNo(Date.get(Calendar.YEAR));
	}
	Student(Student s)
	{
		Name=s.Name;
		Date=s.Date;
		Semester=s.Semester;
		GPA=s.GPA;
		CGPA=s.CGPA;
		RegNo=s.RegNo;
	}
	void Display()
	{
		System.out.println("Name:"+Name);
		System.out.println("Registration no:"+RegNo);
		System.out.println("Date of joining:"+Date.get(Calendar.DATE)+"/"+Date.get(Calendar.MONTH)+"/"+Date.get(Calendar.YEAR));
		System.out.println("Semester:"+Semester);
		System.out.println("GPA:"+GPA);
		System.out.println("CGPA:"+CGPA);
	}
	int CalRegNo(int y)
	{
		int r=y%1000;
		r%=100;
		r*=100;
		r=r+count;
		return r;
	}
	short GetSemester()
	{
		return Semester;
	}
	float GetCGPA()
	{
		return CGPA;
	}
	String GetName()
	{
		return Name;
	}
	void ModName()
	{
		String intials=new String();
		String name=new String();
		name=Name;
		intials=name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1)+"."+name.substring(name.lastIndexOf(" ")+1);
		Name=intials;
	}
}
public class W4q1a
{
	public static void main(String args[])
	{
		int i,j;
		Student s[]=new Student[5];
		System.out.println("Creating classes Using Default constructor");
		s[0]=new Student();
		System.out.println("Creating class Using Parameterised constructor");
		s[1]=new Student("Suraj Mishra",110905897,12,06,2011,4,6.70f,5.56f);
		s[2]=new Student("Raj Malhotra",110905002,13,06,2011,3,4.59f,7.05f);
		s[3]=new Student("Rahul Naik Trivedi",110905974,12,06,2011,5,8.58f,7.87f);
		System.out.println("creating class Using copy constructor");
		s[4]=new Student(s[2]);
		System.out.println("The student records are:");
		for(i=0;i<s.length;i++)
		{
			System.out.println("\nRecord "+(i+1)+":");
			s[i].Display();
		}
		System.out.println("\nSorting with respect to semester:");
		for(i=0;i<s.length-1;i++)
		{
			for(j=i+1;j<s.length;j++)
			{
				if (s[i].GetSemester()>s[j].GetSemester())
				{
					Student temp=s[j];
					s[j]=s[i];
					s[i]=temp;
				}
			}
		}
		for (i=0;i<s.length;i++)
		{
			System.out.println("\nRecord "+(i+1)+":");
			s[i].Display();
		}
		System.out.println("\nSorting with respect to CGPA:");
		for(i=0;i<s.length-1;i++)
		{
			for(j=i+1;j<s.length;j++)
			{
				if (s[i].GetCGPA()>s[j].GetCGPA())
				{
					Student temp=s[j];
					s[j]=s[i];
					s[i]=temp;
				}
			}
		}
		for (i=0;i<s.length;i++)
		{
			System.out.println("\nRecord "+(i+1)+":");
			s[i].Display();
		}
		System.out.println("\nSorting with respect to Name:");
		for(i=0;i<s.length-1;i++)
		{
			for(j=i+1;j<s.length;j++)
			{
				if ((s[i].GetName()).compareTo(s[j].GetName())>0)
				{
					Student temp=s[j];
					s[j]=s[i];
					s[i]=temp;
				}
			}
		}
		for (i=0;i<s.length;i++)
		{
			System.out.println("\nRecord "+(i+1)+":");
			s[i].Display();
		}
		System.out.println("\nAll students whose name start with 'S:'");
		for (i=0;i<s.length;i++)
		{
			if(s[i].GetName().charAt(0)=='S')
			{
				s[i].Display();
			}
		}
		System.out.println("\nAll students whose name contain 'naik':");
		for (i=0;i<s.length;i++)
		{
			if(s[i].GetName().contains("Naik"))
			{
				s[i].Display();
			}
		}
		System.out.println("\nDisplaying name with just initials and family name:");
		for (i=0;i<s.length;i++)
		{
			if(s[i].GetName().contains("Naik"))
			{
				s[i].ModName();
				s[i].Display();
			}
		}		
	}
}
		
