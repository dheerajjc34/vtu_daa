import java.io.*;
import java.util.*;
import java.lang.*;

class Floyd
{
 void solve(int n,int mat[][])
 {
   int i,j,k;
   for(k=0;k<n;k++)
   {
     for(i=0;i<n;i++)
     {
       for(j=0;j<n;j++)
       {
         mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
       }
     }
   }
 }
 void display(int n,int mat[][])
 {
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       System.out.print(mat[i][j]+ " ");
     }
     System.out.println();
   }
 }
 public static void main(String args[])
 {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no. of vertices: ");
   n=sc.nextInt();
   int mat[][]=new int[n][n];
   System.out.println("Enter edge cost: ");
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       if(i==j)
        mat[i][j]=0;
       else
       {
         System.out.print("Vertex "+i+" and "+j);
         mat[i][j]=sc.nextInt();
       }
     }
   }
   Floyd obj=new Floyd();
   obj.solve(n,mat);
   obj.display(n,mat);
 }
}
