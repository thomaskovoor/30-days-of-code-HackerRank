
import java.util.*;



import java.util.Scanner;
public class Day16
 {
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    try{
        int x=Integer.parseInt(s);
        System.out.println(x);
    }
    catch(NumberFormatException e)
    {
        System.out.println("Bad String");
  }  
}
}      
