import java.io.*;
import java.util.*;

class Stack
{
 int top=-1;
 void push(int e,int s,int a[])
 {
  if(top==s-1)
   System.out.println("Stack Overflow\n");
  else
  {
   top=top+1;
   a[top]=e;
   System.out.println(e+" is inserted\n");
  }
 }
 void pop(int a[])
 {
  if(top==-1)
   System.out.println("Stack Underflow\n");
  else
  {
   int d;
   d=a[top];
   top=top-1;
   System.out.println(d+" is deleted\n");
  }
 }
 void display(int s,int a[])
 {
  int i;
  for(i=top;i>=0;i--)
  {
   System.out.println(a[i]+"\n");
  }
 }  
  
 public static void main(String args[])
 {
  Stack obj=new Stack();
  int ch,size;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter stack size: ");
  size=sc.nextInt();
  int arr[]=new int[size];
  
  while(true)
  {
  System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\nENter choice: ");
  ch=sc.nextInt();
   switch(ch)
   {
    case 1:
           {
            int ele;
            System.out.println("Enter element to push: ");
            ele=sc.nextInt();
            obj.push(ele,size,arr);
            break;
           }
           
    case 2:
           {
            obj.pop(arr);
            break;
           }
    case 3:
           {
            obj.display(size,arr);
            break;
           }
    case 4:
           {
            System.exit(0);
           }
   }
  }
 }  
}   
