
import java.util.*;

public class Day25 {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       Day25 obj=new Day25();
       int T=sc.nextInt();
       
       for(int i=0;i<T;i++)
       {
           int x=sc.nextInt();
           obj.chkprime(x);
    }
}
void chkprime(int n)
{
   boolean flag=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(n==1){
            System.out.println("Not prime");
        }
        else if(!flag){
            System.out.println("Prime");
        }
        
        else{
            System.out.println("Not prime");
        }
}
}