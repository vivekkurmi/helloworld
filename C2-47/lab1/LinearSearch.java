import java.util.Scanner;
class LinearSearch{
	public static void main(String[] args)
	{
		System.out.print("Enter the size of array:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[10];
		System.out.println("Enter the array:");		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Enter the element to be searched:");		
		int key=s.nextInt();
		int flag=0;
		for(int j=0;j<n;j++)
		{
			if (a[j]==key)
			{
				System.out.println("Element found at position "+(j+1));
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("Element not found");
	}
}
			
