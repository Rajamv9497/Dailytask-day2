/*Question - 4
Calculate Electricity Bill
 
Given a method calculateElectricityBill() with three inputs. Write code to calculate the current bill.
 
Include a class UserMainCode with a static method calculateElectricityBill which accepts 3 inputs .The return type of the output should be an integer .
 
Create a class Main which would get the inputs and call the static method calculateElectricityBill present in the UserMainCode.
 
Input and Output Format:
Input consist of 3 integers.
First input is previous reading, second input is current reading and last input is per unit charge.
Reading Format - XXXXXAAAAA where XXXXX is consumer number and AAAAA is meter reading.
Output is a single integer corresponding to the current bill.
Refer sample output for formatting specifications. 
 
Sample Input 1:
ABC2012345
ABC2012660
4
Sample Output 1:
1260
 
Sample Input 2:
ABCDE11111
ABCDE11222
3
Sample Output 2:
333
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int calculateElectricityBill(String a,String b,int c)
  {
     int a1,b1;
     a1=Integer.parseInt(a.substring(5));
     b1=Integer.parseInt(b.substring(5));
     return (b1-a1)*c;    
  }
}

public class Main5
{
   public static void main(String[] args)
    {
       int uni,res;
       String s1,s2;
       Scanner sc=new Scanner(System.in);
       s1=sc.nextLine();
       s2=sc.nextLine();
       uni=sc.nextInt();
       res=UserMainCode.calculateElectricityBill(s1,s2,uni);
       System.out.println(res);
    }
}