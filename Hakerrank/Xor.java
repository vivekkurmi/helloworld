import java.util.Scanner;
import java.util.TreeSet;
class Xor
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t,i,j,k,x,y,n,m,a,b,c,e;
		TreeSet ts=new TreeSet();
		t=s.nextInt();
		for(i=0;i<t;i++)
		{
			n=s.nextInt();
			m=s.nextInt();
			int key[]=new int[n];
			for(j=0;j<n;j++)
			key[j]=s.nextInt();
			for(k=0;k<m;k++)
			{   
				ts.clear();
				a=s.nextInt();
				b=s.nextInt();
				c=s.nextInt();
				for(x=b-1,y=c-1;x<y;x++,y--)
				{    
					ts.add(key[x]^a);
					//ts.add(key[y]^a);
				}
				System.out.println(ts.last());
			}
		}
	}
}
