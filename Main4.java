/*Question -3
Write a program to read a string and return an integer based on the following rules.
If the first word and the last word in the String match, then return the number of characters in the word else return sum of the characters in both words. Assume the Strings to be case - sensitive.
Include a class UserMainCode with a static method calculateWordSum which accepts a string. The return type (integer) should be based on the above rules.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
COGNIZANT TECHNOLOGY SOLUTIONS COGNIZANT
Sample Output 1:
9
Sample Input 2:
HOW ARE YOU
Sample Output 2:
6
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int calculateWordSum(String s)
  {
    String ss[]=s.split(" ");
    int len=ss.length;
    if(ss[0].equals(ss[len-1])) 
       return ss[0].length();
    else
        return ss[0].length()+ss[len-1].length();
  }
}

public class Main4
{
   public static void main(String[] args)
    {
       String s;
       int res;
       Scanner sc=new Scanner(System.in);
       s=sc.nextLine();
       res=UserMainCode.calculateWordSum(s);
       System.out.println(res);
    }
}