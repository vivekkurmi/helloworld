import java.util.Scanner;
class Factorial{
	int fact(int n)
	{
		int fac=1;		
		for(int i=1;i<=n;i++)
		{
			fac*=i;
		}
		return fac;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter a no.:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Factorial f=new Factorial();
		int fac;
		fac=f.fact(n);
		System.out.println("The factorial of "+n+" is "+fac);
	}
}









