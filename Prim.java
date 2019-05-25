import java.io.*;
import java.util.*;

class Prim
{
  void check(int n,int mat[][])
  {
    int i,j,ne=1;
    int mincost=0,min,u=0;
    int v=0;
    int visit[]=new int[n];
    for(i=0;i<n;i++)
    {
      visit[i]=0;
    }
    visit[0]=1;
    while(ne<n)
    {
      min=999;
      for(i=0;i<n;i++)
      {
        if(visit[i]==1)
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
      }
      if(visit[u]==1 && visit[v]==0)
      {
        visit[v]=1;
        ne++;
        mincost +=min;
        System.out.println("Edge selected is "+u+" "+v);
      }
      mat[u][v]=mat[v][u]=999;
    }
    System.out.println("Total cost is: "+mincost);
  }
  public static void main(String args[])
  {
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no. of vertices: ");
    n=sc.nextInt();
    int mat[][]=new int[n][n];
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
      }
    }
    Prim obj=new Prim();
    obj.check(n,mat);
  }
}
