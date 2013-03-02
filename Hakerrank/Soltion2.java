import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;
public class Soltion2
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		TreeSet<String> ts= new TreeSet<String>();
		ArrayList<String> arr=new ArrayList<String>();
		int i,n,c,length,j;
		String string,sub;
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			string=scan.next();
			length=string.length();
			for(c=0;c<=length;c++)
			{
				for(j=1;j<=length-c;j++)
				{
					sub = string.substring(c,c+j);
					ts.add(sub);
				}
			}
		}
        length=ts.size();
        //String[] arr = ts.toArray(new String[length]);
		arr.addAll(ts);
		c=scan.nextInt();
		for(i=0;i<c;i++)
		{
			if((j=scan.nextInt()-1)<length)
			{
				System.out.println(arr.get(j));
			}
			else
			{
				System.out.println("INVALID");
			}

		}
	}
}
