import java.io.*;
import java.util.*;

public class Ham
{
  static Scanner sc=new Scanner(System.in);
  static int a[][],x[],n;
  public static void main(String args[])
  {
    System.out.print("Enter no. of cities: ");
    n=sc.nextInt();
    a=new int[n][n];
    x=new int[n];
    x[0]=0;
    System.out.println("Enter adjacency matrix:");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=1;i<n;i++)
     x[i]=-1;
    getHycle(1);
  }
  static void getHycle(int k)
  {
    while(true)
    {
      nextValue(k);
      if(x[k]==-1)
       return;
      if(k==n-1)
      {
        System.out.println("Solution: ");
        for(int i=0;i<n;i++)
         System.out.print(x[i]+"->");
        System.out.println("0");
      }
      else
       getHycle(k+1);
    }
  }
  static void nextValue(int k)
  {
    int i=0;
    while(true)
    {
      x[k]=(x[k]+1)%(n+1);
      if(x[k]==n)
       x[k]=-1;
      if(x[k]==-1)
       return;
      if(a[x[k-1]][x[k]]==1)
      {
        for(i=0;i<k;i++)
        {
          if(x[i]==x[k])
           break;
        }
      }
      if(i==k)
      {
        if(k<n-1 || k==n-1 && a[x[n-1]][0]==1)
         return;
      }
    }
  }
}
