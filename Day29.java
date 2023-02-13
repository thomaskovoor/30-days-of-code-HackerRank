import java.io.*;

import java.util.*;

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        int res=0;
        
    for(int i=0;i<N;i++)
    for(int j=i+1;j<=N;j++)
    {
        int and=i&j;
        if(and<K&&and>res)
        res=and;
    }
    return(res);

    }

}

public class Day29 {
    public static void main(String[] args) throws IOException {
     Scanner sc=new Scanner(System.in);
     Result obj=new Result();
     int T=sc.nextInt();
     for(int i=0;i<T;i++)
     {
         int N=sc.nextInt();
         int K=sc.nextInt();
         int res=obj.bitwiseAnd(N,K);
         System.out.println(res);
     }   
    }
}