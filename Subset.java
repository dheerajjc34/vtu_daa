import java.io.*;
import java.util.*;

class Subset
{
  void sub(int cs,int k,int r,int x[],int w[],int d)
  {
    x[k]=1;
    if(cs+w[k]==d)
    {
      System.out.print("Solution: ");
      for(int i=0;i<=k;i++)
      {
        if(x[i]==1)
        System.out.print(w[i]+ " ");
      }
      System.out.println();
    }
    else if(cs+w[k]+w[k+1]<=d)
     sub(cs+w[k],k+1,r-w[k],x,w,d);
    if(cs+r-w[k]>=d && cs+w[k+1]<=d)
    {
      x[k]=0;
      sub(cs,k+1,r-w[k],x,w,d);
    }
  }
  public static void main(String args[])
  {
    int n,d,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no. of elements: ");
    n=sc.nextInt();
    int x[]=new int[n];
    int w[]=new int[n];
    System.out.println("Enter "+n+" numbers:");
    for(int i=0;i<n;i++)
    {
      w[i]=sc.nextInt();
      sum += w[i];
    }
    System.out.print("Enter required sum: ");
    d=sc.nextInt();
    Subset obj=new Subset();
    if(sum<d || w[0]>d)
     System.out.println("No solution");
    else
     obj.sub(0,0,sum,x,w,d);
  }
}
