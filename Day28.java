
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Day28 {
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    List<String> lst=new ArrayList<String>();
    String Regrex=".+@gmail\\.com$";
       Pattern pattern = Pattern.compile(Regrex); 
       for(int i=0;i<N;i++)
       {
           String name=sc.next();
           String email=sc.next();
           Matcher matcher=pattern.matcher(email);
           if(matcher.find())
           lst.add(name);
       }
       Collections.sort(lst);
       for(String s:lst)
       System.out.println(s);
    }

}