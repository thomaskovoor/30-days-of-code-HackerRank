
import java.util.*;

class Day1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=4;
        double d=4.0;
        String s="HackerRank";
        
        int j;
        double e;
        String t;
        
        j=sc.nextInt();
        e=sc.nextDouble();
        sc.nextLine();
        t=sc.nextLine();
        
        System.out.println(i+j);
        System.out.println(d+e);
        System.out.println(s+" "+t);
        sc.close();
    }
}