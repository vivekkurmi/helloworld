import java.util.Scanner;
class Movies{
void SetTitle(String t)
{
	title=t;
}
void SetYear(int y)
{
	year=y;
}
void SetDirector(String d)
{
	dir=d;
}
void display()
{
	System.out.println("Title:"+title+"\nYear:"+year+"\nDirector:"+dir);
}
void compare(Movies m1,Movies m2)
{
	if(m1.year==m2.year)
	System.out.println("Both movies released in same year");
	else
	System.out.println("movies released in different year");
	boolean b=m1.dir.equals(m2.dir);
	if (b==true)
	System.out.println("Both movies directed by same director");
	else
	System.out.println("movies directed by different director");
}
private
String title;
int year;
String dir;
}
public class W2q3{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);	
	String t,d;
	int y;
	System.out.print("Enter the movie 1 details:\ntitle:");
	t=s.next();
	System.out.print("year:");
	y=s.nextInt();
	System.out.print("director:");
	d=s.next();
	Movies m1=new Movies();
	m1.SetTitle(t);
	m1.SetYear(y);
	m1.SetDirector(d);
	System.out.print("Enter the movie 2 details:\ntitle:");
	t=s.next();
	System.out.print("year:");
	y=s.nextInt();
	System.out.print("director:");
	d=s.next();
	Movies m2=new Movies();
	m2.SetTitle(t);
	m2.SetYear(y);
	m2.SetDirector(d);
	System.out.print("Movie 1 details are:\n");
	m1.display();
	System.out.print("Movie 2 details are:\n");
	m2.display();
	m1.compare(m1,m2);
	}
}
