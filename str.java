//import 
class str
{
	public static void main(String args[])
	{
		String a="aab";
		String b="aa";
		int c=a.compareToIgnoreCase(b);
		if (c>0)
		System.out.println(a);
		else if(c==0)
		System.out.println("equal");
		else
		System.out.println(b);
	}
}
