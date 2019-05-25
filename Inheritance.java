import java.io.*;
import java.util.*;

class Staff {
	String name;
	int salary;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=sc.nextLine();
		System.out.print("Enter salary");
		salary=sc.nextInt();
	}
    public void display()
    {
    	System.out.println("----------\nName: "+name+"\nSalary: "+salary);
    }
}
class Teaching extends Staff{
	String domain;
	int pub;
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter domain: ");
		domain=sc.nextLine();
		System.out.print("Enter no. of publications: ");
		pub=sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Domain: "+domain+"\nPublications: "+pub);
	}
}
class Technical extends Staff{
	String skill;
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter skill:");
		skill=sc.nextLine();
	}
	public void display()
	{
		super.display();
		System.out.println("Skill: "+skill);
	}

}
class Inheritance{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("no. of teachers: ");
		n=sc.nextInt();
		Teaching arr1[]=new Teaching[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=new Teaching();
			arr1[i].read();
		}
		Technical arr2[]=new Technical[n];
		for(int i=0;i<n;i++)
		{
			arr2[i]=new Technical();
			arr2[i].read();
		}
		for(int i=0;i<n;i++)
		{
			arr1[i].display();
			arr2[i].display();
		}
	}
}
