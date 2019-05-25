import java.io.*;
import java.util.*;
 class Second extends Thread
 {
  public int x;
  public Second(int x){
    this.x=x;
  }
  public void run(){
    System.out.println("2nd thread: square of "+x+" is "+(x*x));
  }
 }
 class Third extends Thread
 {
   public int x;
   public Third(int x){
     this.x=x;
   }
   public void run(){
     System.out.println("3rd thread: cube of "+x+" is "+(x*x*x));
   }
 }
 class First extends Thread
 {
   public void run()
   {
     int num=0;
     Random r=new Random();
     try
     {
       for(int i=0;i<3;i++)
       {
         num=r.nextInt(100);
         System.out.println("1st thread: x is "+num);
         Second b=new Second(num);
         b.start();
         Third c=new Third(num);
         c.start();
         Thread.sleep(1000);
       }
     }
     catch(Exception e){
       System.out.println(e.getMessage());
     }
   }
 }
 class MultiThread
 {
  public static void main(String args[])
  {
    First a=new First();
    a.start();
  }
 }
