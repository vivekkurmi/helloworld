import java.util.*;
class Patient
{
	private String Name;
	private int Age,HospitalNo;
	void Input()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the patient details:\nName:");
		Name=s.nextLine();
		System.out.print("Age:");
		Age=s.nextInt();
		System.out.print("Hospital No.:");
		HospitalNo=s.nextInt();
	}
	void Display()
	{
		System.out.println("The patient details are:\nName:"+Name+"\nAge:"+Age+"\nHospital No:"+HospitalNo);
	}
}
class InPatient extends Patient
{
	private String DepartmentName;
	 GregorianCalendar AdmissionDate;
	String RoomType;
	void Input()
	{
		super.Input();
		Scanner s=new Scanner(System.in);
		System.out.print("Department Name:");
		DepartmentName=s.next();
		System.out.print("Admission date:");
		AdmissionDate=new GregorianCalendar();
		AdmissionDate.set(Calendar.DATE,s.nextInt());
		AdmissionDate.set(Calendar.MONTH,s.nextInt());
		AdmissionDate.set(Calendar.YEAR,s.nextInt());
		System.out.print("Room type:");
		RoomType=s.next();
	}
	void Display()
	{
		super.Display();
		System.out.println("Department name:"+DepartmentName+"\nAdmission date:"+AdmissionDate.get(Calendar.DATE)+"/"+AdmissionDate.get(Calendar.MONTH)+"/"+AdmissionDate.get(Calendar.YEAR)+"\nRoom type:"+RoomType);
	}
}
class Billing extends InPatient
{
	private GregorianCalendar DischargeDate;
	float Amount=0;
	void Input()
	{
		super.Input();
		Scanner s=new Scanner(System.in);
		DischargeDate=new GregorianCalendar();
		System.out.print("Discharge date:");
		DischargeDate.set(Calendar.DATE,s.nextInt());
		DischargeDate.set(Calendar.MONTH,s.nextInt());
		DischargeDate.set(Calendar.YEAR,s.nextInt());
	}
	float bill()
	{
		long milli=0;
		long days=0;
		float Amount=0;
		milli=DischargeDate.getTimeInMillis()-AdmissionDate.getTimeInMillis();
		days=milli/(24*60*60*1000);
		if("Special".equals(RoomType))
		Amount=days*1200;
		else if("SemiSpecial".equals(RoomType))
		Amount=days*600;
		else
		Amount=days*150;
		return Amount;
	}
	void Display()
	{
		super.Display();
		Amount=bill();
		System.out.println("Discharge date:"+DischargeDate.get(Calendar.DATE)+"/"+DischargeDate.get(Calendar.MONTH)+"/"+DischargeDate.get(Calendar.YEAR)+"\nAmount:"+Amount);
	}
}
public class w5q1
{
	public static void main(String args[])
	{
		Billing b=new Billing();
		b.Input();
		b.Display();
	}
}
		
		
		
