import java.util.Scanner;
class Complex{
Complex()
{}
Complex(float r,float i)
{
	real=r;
	img=i;
}
void display()
{
	System.out.println(real+"+"+img+"i");
}
Complex add(Complex c1,Complex c2)
{
	Complex sum=new Complex();
	sum.real=c1.real+c2.real;
	sum.img=c1.img+c2.img;
	return sum;
}
Complex sub(Complex c1,Complex c2)
{
	Complex sub=new Complex();
	sub.real=c1.real-c2.real;
	sub.img=c1.img-c2.img;
	return sub;
}
public
float real;
float img;
}
public class W2q1{
	
	public static void main (String args[]) 
	{
		float r,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the real value of 1st complex no:");
		r=s.nextFloat();
		System.out.print("Enter the imaginary value of 1st complex no:");
		i=s.nextFloat();
		Complex c1=new Complex(r,i);
		System.out.print("Enter the real value of 2nd complex no:");
		r=s.nextFloat();
		System.out.print("Enter the imaginary value of 2nd complex no:");
		i=s.nextFloat();
		Complex c2=new Complex(r,i);
		System.out.print("The 1st complex no is ");
		c1.display();
		System.out.println();
		System.out.print("The 2nd complex no is ");
		c2.display();
		System.out.println();
		Complex sum=new Complex();
		sum=c1.add(c1,c2);
		System.out.print("The sum of the complex no is ");
		sum.display();
		System.out.println();
		Complex sub=new Complex();
		sub=c1.sub(c1,c2);
		System.out.print("The sum of the complex no is ");
		sub.display();
		System.out.println();
	}
}

