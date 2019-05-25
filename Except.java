import java.io.*;
import java.util.*;

class Except
{
  public static void main(String args[])
  {
    int a,b;
    float c;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a and b:");
    a=sc.nextInt();
    b=sc.nextInt();
    try
    {
      c=a/b;
      System.out.println("a/b= "+c);
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}
