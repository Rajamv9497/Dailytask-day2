/*
2..Difference between largest and smallest elements in an array

Given a method taking an int array having size more than or equal to 1 as input. Write code to return the difference between the largest and smallest elements in the array. If there is only one element in the array return the same element as output.
 
Include a class UserMainCode with a static method getBigDiff which accepts a integer array as input.
 
The return type of the output is an integer which is the difference between the largest and smallest elements in the array.
 
Create a Main class which gets integer array as an input and call the static method getBigDiff present in the UserMainCode.
 
Input and Output Format:
Input is an integer array.First element in the input represents the number of elements in an array.
Size of the array must be >=1
Output is an integer which is the difference between the largest and smallest element in an array.
Sample Input 1:
4
3
6
2
1
 
Sample Output 1:
5
*/



import java.io.*;
import java.util.*;
import java.lang.*;

class UserMainCode
{
  public static int getBigDiff(int a[])
  {
    int diff=0;
    int min,max;
    min=max=a[0];
    for(int i=0;i<a.length;i++)
     {
       if(a[i]<min)
            min=a[i];
       if(a[i]>max)
            max=a[i];
      }
    if(a.length==1)
         diff=min;
    else
          diff=max-min;
    return diff;
  }
}

public class Main
{
   public static void main(String[] args)
    {
       int n,res;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
       res=UserMainCode.getBigDiff(a);
       System.out.println(res);
    }
}