import java.util.Scanner;
class Fibonacci{
	static int fibo(int n)
	{
		if (n==0)
		return 0;
		else if (n==1)
		return 1;
		else
		return (fibo(n-1)+fibo(n-2));
	}
	public static void main(String[] args)
	{		
		System.out.print("Enter the lenght of the fibonacci series:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fib;
		System.out.println("Fibonacci series:");		
		for(int i=0;i<n;i++)
		{
			fib=fibo(i);
			System.out.print(fib+" ");
		}
		System.out.println();
	}
}
