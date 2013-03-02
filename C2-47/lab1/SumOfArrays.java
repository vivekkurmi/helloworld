import java.util.Scanner;
class SumOfArrays{
	public static void main(String[] args)
	{
		System.out.print("Enter the size of array 1:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[10];
		System.out.println("Enter the array 1:");
		int i;		
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Enter the size of array 2:");
		int m=s.nextInt();
		int[] b=new int[10];
		System.out.println("Enter the array 2:");	
		for(i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		if(n!=m)
			System.out.println("Cann't add arrays of different lenghts");
		else
		{
			int[] c=new int[10];			
			for(i=0;i<n;i++)
			{
				c[i]=a[i]+b[i];
			}
			System.out.println("The three arrays are:");
			System.out.println("Array 1:");
			for(i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			System.out.println("Array 2:");
			for(i=0;i<n;i++)
				System.out.print(b[i]+" ");
			System.out.println();
			System.out.println("Array 3:");
			for(i=0;i<n;i++)
				System.out.print(c[i]+" ");
			System.out.println();
		}
	}
}
		
		
