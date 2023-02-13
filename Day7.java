import java.util.*;
public class Day7
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10000];
        int j,i;
        int N=sc.nextInt();
        for(i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(j=N-1;j>=0;j--)
        {
            System.out.print(A[j]+" ");
        }
        sc.close();
    }
    }