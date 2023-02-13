import java.util.*;
class Day6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i,len,j;
        String S[]=new String[15];
        for(i=0;i<T;i++)
        {
            S[i]=sc.next();
        }
        for(i=0;i<T;i++)
        {
         len=S[i].length();
            for(j=0;j<len;j+=2)
            {
                System.out.print(S[i].charAt(j));
            }
            System.out.print(" ");
            for(j=1;j<len;j+=2)
            {
                System.out.print(S[i].charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
    
}