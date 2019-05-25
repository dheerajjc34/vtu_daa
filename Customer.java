import java.io.*;
import java.util.*;
class Customer
{
 String name,dob;
 void getdata()
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter name: ");
   name=sc.nextLine();
   System.out.print("enter dob: ");
   dob=sc.nextLine();
 }
 void display()
 {
   System.out.println("Name: "+name);
   StringTokenizer st=new StringTokenizer(dob,"/");
   while(st.hasMoreTokens())
   {
     System.out.println(st.nextToken()+",");
   }
 }
 public static void main(String args[])
 {
   Customer cs=new Customer();
   cs.getdata();
   cs.display();
 }
}
