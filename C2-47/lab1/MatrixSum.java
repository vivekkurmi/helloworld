import java.util.Scanner;

class MatrixSum
{
	public static void main(String args[])
		{
		Scanner scan=new Scanner(System.in);
		int [][]a={{1,2,3},{4,5,6},{7,8,9}};
		int [][]b={{9,8,7},{6,5,4},{3,2,1}};
		int [][]sum={{0,0,0},{0,0,0},{0,0,0}};
		for (int i=0;i<3;i++)
		{	
			for (int j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The sum of the matrices is:");
		for (int i=0;i<3;i++)
		{	
			for (int j=0;j<3;j++)
			{		
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();	
		}
	}	
}
