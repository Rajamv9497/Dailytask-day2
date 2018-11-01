/*Question - 1

Given the age of a person as string, validate the age based on the following rules.

1. Value should contain only numbers.
2. Value should be non-negative.
3. Value should be in the range of 21 to 45'.

If all the conditions are satisifed then print TRUE else print FALSE.

Include a class UserMainCode with a static method ValidateAge which accepts the string. The return type is the boolean formed based on rules.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of TRUE or FALSE .
Refer sample output for formatting specifications.

Sample Input 1:
23

Sample Output 1:
TRUE

Sample Input 2:
-34

Sample Output 2:
FALSE
*/



import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static boolean validateAge(String s)
  {
     int a;
    try{
     a=Integer.parseInt(s);}
      catch(Exception e)
      { return false;}
    if(a>=21 && a<=45) 
       return true;
    else
        return false;
  }
}

public class Main2
{
   public static void main(String[] args)
    {
       boolean res;
       String s;
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       res=UserMainCode.validateAge(s);
       System.out.println(res);
    }
}