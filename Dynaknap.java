import java.io.*;
import java.util.*;
import java.lang.*;

class Dynaknap
{
 public void fill(int mat[][],int p[],int w[],int n,int m)
 {
  int i,j;
  int x[]=new int[n+1];
  for(i=0;i<n+1;i++)
  {
   for(j=0;j<m+1;j++)
   {
    if(i==0 | j==0)
       mat[i][j]=0;
    else if(w[i]>j)
       mat[i][j]=mat[i-1][j];
    else
       mat[i][j]=Math.max(mat[i-1][j],mat[i-1][j-w[i]]+p[i]);
    }
   }
  for(i=0;i<n+1;i++)
  {
   for(j=0;j<m+1;j++)
   {
    System.out.print(mat[i][j]+" ");
   }
   System.out.print("\n");
  }  
  System.out.println("Max profit: "+mat[n][m]); 
  int cap=m;
  for(i=n;i>0;i--)
  {
   if(mat[i][cap]==mat[i-1][cap])
    x[i]=0;
   else
   {
    x[i]=1;
    cap=cap-w[i];
   }
  }
  System.out.print("Items selected: "); 
  for(i=0;i<n+1;i++)
  {
   if(x[i]==1)
    System.out.print(i+" ");
  } 
  System.out.println();  
 }
 public static void main(String args[])
 {
  int n,i,j,m;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter no. of items: ");
  n=sc.nextInt();
  System.out.print("Enter capacity: ");
  m=sc.nextInt();
  int mat[][]=new int[n+1][m+1];
  int p[]=new int[n+1];
  int w[]=new int[n+1];
  System.out.println("Enter profit: ");
  for(i=1;i<n+1;i++)
  {
   System.out.print("Item "+i+": ");
   p[i]=sc.nextInt();
  }
  System.out.println("Enter weight: ");
  for(i=1;i<n+1;i++)
  {
   System.out.print("Item "+i+": ");
   w[i]=sc.nextInt();
  }
  Dynaknap ob=new Dynaknap();
  ob.fill(mat,p,w,n,m);
 }
}
   
 
