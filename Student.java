import java.io.*;
import java.util.*;
class Student
{
 String usn,name,branch;
 long phno;
 public void readinfo()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter usn: ");
  usn=sc.nextLine();
  System.out.println("Enter name: ");
  name=sc.nextLine();
  System.out.println("Enter branch: ");
  branch=sc.nextLine();
  System.out.println("Enter ph. no: ");
  phno=sc.nextLong();
 }
 public void printinfo()
 {
  System.out.println("USN: "+usn+"\n"+"Name: "+name+"\n"+"Branch: "+branch+"\n"+"Phone number: "+phno+"\n");
 }

 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of students: ");
  int n=sc.nextInt();
  Student arr[]=new Student[n];
  for(int i=0;i<n;i++)
  {
   arr[i]=new Student();
   arr[i].readinfo();
  }
  for(int i=0;i<n;i++)
  {
   arr[i].printinfo();
  }
  
 }
}
