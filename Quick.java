import java.io.*;
import java.util.*;
class Quick
{
  
 public void qsort(int a[],int low,int high)
 {
  int i=low;
  int j=high;
  if(high-low>=1)
  {
   int pivot=a[i];
   while(j>i)
   {
    while(a[i]<=pivot && i<=high && j>i)
    {
     i++;
    } 
    while(a[j]>pivot && j>=low && j>=i)
    { 
     j--;
    }
    if(j>i)
    {
     swap(a,i,j);
    }
   }
   swap(a,low,j);
   qsort(a,low,j-1);
   qsort(a,j+1,high);
  }
  else
   return;
 }
 void swap(int a[],int c,int d)
 {
  int temp=a[c];
  a[c]=a[d];
  a[d]=temp;
 }
 void display1(int n,int a1[])
  {
    for(int i=0;i<n;i++)
   {
    System.out.println(a1[i]+" ");
   }
  }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many numbers: ");
  int n=sc.nextInt();
  Random r=new Random();
  int a1[]=new int[n];
  for(int i=0;i<n;i++)
  {
   a1[i]=r.nextInt(50);
  }
  Quick ob=new Quick();
  ob.display1(n,a1);
  long time1=System.nanoTime();
  ob.qsort(a1,0,n-1);
  long time2=System.nanoTime();
  double time3=time2-time1;
  time3=time3/(1000000);
  System.out.println("After sorting:\n ");
  ob.display1(n,a1);
  System.out.println("Time taken is: "+time3);
 }
} 

