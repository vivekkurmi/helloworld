import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t,i,j,k,x,n,m,a,b,c,e,high,ans;
		
		t=s.nextInt();                     //geting the no of testcases
		for(i=1;i<=t;i++)
		{
			n=s.nextInt();					//no of integers in key
			m=s.nextInt();					//no of query in the testcase
			int key[]=new int[n];
			for(j=0;j<n;j++)
			key[j]=s.nextInt();				//getting the key
			for(k=0;k<m;k++)				//input of query and calulation
			{   high=0;
				a=s.nextInt();
				b=s.nextInt();
				c=s.nextInt();
				for(x=b-1;x<c;x++)
				{    ans=key[x]^a;
					 if(ans>high)
						 high=ans;
				}
				System.out.println(high);
			}
		}
	}
}
