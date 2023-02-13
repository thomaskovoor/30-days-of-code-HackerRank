
import java.util.*;

class Calculator
{
     public static int power(int n,int p)
    {
        int f=1;
        if(n<0||p<0)
        throw new ArithmeticException("n and p should be non-negative");
        for(int j=0;j<p;j++)
        {
            f=f*n;
        }
        return(f);
    }
}
class Day17{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
        
            int n = sc.nextInt();
            int p = sc.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
