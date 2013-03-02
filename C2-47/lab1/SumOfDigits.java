import java.util.Scanner;
class SumOfDigits{
	public static void main(String[] args)
	{
		System.out.print("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum;
		int r;		
		sum=0;
		while (n>0)
		{
			r=n%10;
			n=n/10;
			sum+=r;
		}
		System.out.println("The sum of the digits is "+sum);
	}
}
			
