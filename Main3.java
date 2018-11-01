/*Question – 2

Given a string (s) and non negative integer (n) apply the following rules.
1.	    Display the first three characters as front.
2.	    If the length of the string is less than 3, then consider the entire string as front and repeat it n times.

Include a class UserMainCode with a static method repeatFirstThreeCharacters which accepts the string and integer. The return type is the string formed based on rules.

Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string and integer.

Output consists of a string .

Refer sample output for formatting specifications.

Sample Input 1:
Coward
2

Sample Output 1:
CowCow


Sample Input 2:
So
3

Sample Output 2:
SoSoSo
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static String getFirstThreeChar(String s,int n)
  {
    int len;
    String front,fin="";
    len=s.length();
    if(len>=3)
       front=s.substring(0,3);
    else
       front=s;
    for(int i=0;i<n;i++)
        fin=fin+front;
    return fin;
  }
}

public class Main3
{
   public static void main(String[] args)
    {
       int n;
       String res,s;
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       n=sc.nextInt();
       res=UserMainCode.getFirstThreeChar(s,n);
       System.out.println(res);
    }
}