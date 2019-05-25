import java.io.*;
import java.util.*;
class Dijkstra
{
 public static void main(String args[])
 {
   int n,i,j,u=0,v=0,src;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no. of vertices: ");
   n=sc.nextInt();
   int d[]=new int[n];
   int p[]=new int[n];
   int visit[]=new int[n];
   int mat[][]=new int[n][n];
   System.out.println("Enter edge cost: ");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
       if(i==j)
        mat[i][j]=0;
      else
      {
        System.out.print("Edge "+i+" "+j);
        mat[i][j]=sc.nextInt();
      }
     }
   }
   for(i=0;i<n;i++)
   {
     visit[i]=0;
     d[i]=999;
     p[i]=i;
   }
   System.out.printf("Enter source vertex: ");
   src=sc.nextInt();
   u=src;
   visit[u]=1;
   d[u]=0;
   p[u]=u;
   for(int c=0;c<n-1;c++)
   {
     int min=999;
     for(v=0;v<n;v++)
     {
       if(visit[u]==1 && visit[v]==0)
       {
         if(d[v]>d[u]+mat[u][v])
         {
           d[v]=d[u]+mat[u][v];
           p[v]=u;
         }
       }
     }
     for(v=0;v<n;v++)
     {
       if(d[v]<=min && d[v]!=0 && visit[v]==0)
       {
         min=d[v];
         u=v;
       }
     }
     visit[u]=1;
   }
   System.out.println("Paths for each vertex are: ");
   for(i=0;i<n;i++)
   {
     System.out.println("From "+src+" to "+i+":");
     System.out.println("Parent node: "+p[i]);
     System.out.println("Minimum cost: "+d[i]);
   }
 }
}
