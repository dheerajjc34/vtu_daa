
import java.io.*;
import java.util.*;
class Kruskal
{
 int mincost=0;
 void check(int ne,int n,int mat[][],int parent[])
 {
   int u=0,v=0,i,j;
   for(int count=0;count<ne;count++)
   {
     int min=999;
     for(i=0;i<n;i++)
     {
       for(j=0;j<n;j++)
       {
         if(mat[i][j]<min && mat[i][j]!=0)
         {
           min=mat[i][j];
           u=i;
           v=j;
         }
       }
     }
     union(n,u,v,parent,mat);
     mat[u][v]=mat[v][u]=999;
   }
   System.out.println("Total cost is: "+mincost);
 }
 void union(int n,int u,int v,int parent[],int mat[][])
 {
   if(parent[u]!=parent[v])
   {
     for(int i=0;i<n;i++)
     {
       if(parent[i]==parent[v])
        parent[i]=parent[u];
     }
     parent[v]=parent[u];
     mincost += mat[u][v];
     System.out.println("Edge selected: "+u+ " "+v);
   }
 }
 public static void main(String args[])
 {
   int n,i,j,ne=0;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no. of vertices: ");
   n=sc.nextInt();
   int mat[][]=new int[n][n];
   int parent[]=new int[n];
   for(i=0;i<n;i++)
   {
    parent[i]=i;
   }
   System.out.println("Enter cost of: ");
   for(i=0;i<n;i++)
   {
     for(j=i;j<n;j++)
     {
       if(i==j)
         mat[i][j]=0;
       else
       {
         System.out.print("Vertices "+i+" and "+j);
         mat[i][j]=sc.nextInt();
       }
       if(mat[i][j]!=999 && mat[i][j]!=0)
        ne++;
     }
   }
   System.out.println("No of edges: "+ne);
   Kruskal obj=new Kruskal();
   obj.check(ne,n,mat,parent);
 }
}
