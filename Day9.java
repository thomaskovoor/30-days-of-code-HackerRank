import java.util.*;


class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n)
     {
    // Write your code here
    if(n>0)
    return n * factorial(n-1);
    else 
    return 1;
    }

}

public class Day9 {
    public static void main(String[] args) 
    {
        Result obj=new Result();   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=obj.factorial(n);
        System.out.println(result);
        sc.close();
    }
    
}
