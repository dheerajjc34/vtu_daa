import java.io.*;
import java.util.*;

class Greedy3
{
 public void sort(double p[],double q[],int n,int c)
 {
  int i,j;
  double temp=0,temp2=0,x=c,profit=0;
  for(j=0;j<n-1;j++)
  {
   for(i=0;i<n-j-1;i++)
   {
    if((p[i]/q[i])<(p[i+1]/q[i+1]))
    {
     temp=p[i];
     p[i]=p[i+1];
     p[i+1]=temp;
     temp2=q[i];
     q[i]=q[i+1];
     q[i+1]=temp2;
    }
   }
  }
  for(i=0;i<n;i++)
  {
   if(q[i]<x)
   {
    x=x-q[i];
    profit += p[i];
   }
   else if(x==0)
    i=n;
   else if(x<q[i])
   {
    profit=profit+(p[i]*(x/q[i]));
   }
  }
  System.out.println("Profit is: "+profit);
 }
 public static void main(String args[])
 {
  int n,i,j,c;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter no. of items: ");
  n=sc.nextInt();
  System.out.print("Enter capacity: ");
  c=sc.nextInt();
  double p[]=new double[n];
  double q[]=new double[n];
  System.out.println("Enter profit: ");
  for(i=0;i<n;i++)
  {
   System.out.print("Item "+i+": ");
   p[i]=sc.nextInt();
  }
  System.out.println("Enter weight: ");
  for(i=0;i<n;i++)
  {
   System.out.print("Item "+i+": ");
   q[i]=sc.nextInt();
  }
  Greedy3 ob=new Greedy3();
  //ob.disp(p,n);
  ob.sort(p,q,n,c);
  //ob.disp(p,n);
 }
}
   
 
