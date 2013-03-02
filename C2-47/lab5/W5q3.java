import java.util.Scanner;
abstract class Figure
{
	float dim1;
	float dim2;
	abstract float Area();
	Figure(float a,Float b)
	{
		dim1=a;
		dim2=b;
	}
}
class Rectangle extends Figure
{
	Rectangle(float a,float b)
	{
		super(a,b);
	}
	float Area()
	{
		return dim1*dim2;
	}
}
class Triangle extends Figure
{
	Triangle(float a,float b)
	{
		super(a,b);
	}
	float Area()
	{
		return 0.5f*dim1*dim2;
	}
}
class Square extends Figure
{
	Square(float a)
	{
		super(a,a);
	}
	float Area()
	{
		return dim1*dim2;
	}
}
class W5q3
{
	public static void main(String args[])
	{
		float a,b;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the dimentions of the rectangle:");
		a=scan.nextFloat();
		b=scan.nextFloat();
		Rectangle r=new Rectangle(a,b);
		System.out.println("Area of rectangle is "+r.Area());
		System.out.print("Enter the dimentions of the Triangle:");
		a=scan.nextFloat();
		b=scan.nextFloat();
		Triangle t=new Triangle(a,b);
		System.out.println("Area of Triangle is "+t.Area());
		System.out.print("Enter the dimentions of the Square:");
		a=scan.nextFloat();
		Square s=new Square(a);
		System.out.println("Area of Square is "+s.Area());
	}
}
