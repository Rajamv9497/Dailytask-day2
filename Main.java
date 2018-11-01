/*1.Sum of Powers of elements in an array
Given a method with an int array. Write code to find the power of each individual element accoding to its position index, add them up and return as output.
 
Include a class UserMainCode with a static method getSumOfPower which accepts an integer array as input.
 
The return type of the output is an integer which is the sum powers of each element in the array.
 
Create a Main class which gets integer array as an input and call the static method getSumOfPowerpresent in the UserMainCode.
 
Input and Output Format:
Input is an integer array.First element corresponds to the number(n) of elements in an array.The next inputs corresponds to each element in an array.
Output is an integer .

Sample Input 1:
4
3
6
2
1
 
Sample Output 1:
12
 */




import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int getSumOfPower(int a[])
  {
    int power=0;
    for(int i=0;i<a.length;i++)
        power=power+(int)Math.pow(a[i],i);
   return power;
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
       res=UserMainCode.getSumOfPower(a);
       System.out.println(res);
    }
}