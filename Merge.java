import java.io.*;
import java.util.*;

class Merge
{

  void display(int a[],int n)
  {
    for(int i=0;i<n;i++)
     System.out.println(a[i]);
  }
  void divide(int a[],int l,int r)
  {
    if(l<r)
    {
     int m=(l+r)/2;
     divide(a,l,m);
     divide(a,m+1,r);
     merge(a,l,m,r);
    }
  }
  void merge(int a[],int l,int m,int r)
  {
    int i,j;
    int n1=m-l+1;
    int n2=r-m;
    int la[]=new int[n1];
    int ra[]=new int[n2];
    for(i=0;i<n1;i++)
     la[i]=a[l+i];
    for(i=0;i<n2;i++)
     ra[i]=a[m+i+1];
    int k=l;
    i=0;
    j=0;
    while(i<n1 && j<n2)
    {
      if(la[i]<ra[j])
      {
        a[k]=la[i];
        k++;
        i++;
      }
      else
      {
        a[k]=ra[j];
        k++;
        j++;
      }
    }
      while(i<n1)
      {
        a[k]=la[i];
        k++;
        i++;
      }
      while(j<n2)
      {
        a[k]=ra[j];
        k++;
        j++;
      }
    }
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter how many numbers: ");
    n=sc.nextInt();
    Random r=new Random();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
     a[i]=r.nextInt(5000);
    Merge obj=new Merge();
    obj.display(a,n);
    long time1=System.nanoTime();
    obj.divide(a,0,n-1);
    long time2=System.nanoTime();
    double time3=time2-time1;
    time3=time3/(1000000);
    System.out.println("After sorting");
    obj.display(a,n);
    System.out.println("Total time taken is: "+time3);
  }
}
