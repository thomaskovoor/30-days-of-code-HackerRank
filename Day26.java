import java.util.Scanner;
;
public class Day26 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int d1,m1,y1;
        int d2,m2,y2;
        d1=sc.nextInt();
        m1=sc.nextInt();
        y1=sc.nextInt();
        d2=sc.nextInt();
        m2=sc.nextInt();
        y2=sc.nextInt();
        int fine;
        if(d1<=d2&&m1<=m2&&y1<=y2)
        fine=0;
        else if(d1!=d2&&m1!=m2&&y1<y2)
        fine=0;
         else if(d1>d2&&m1==m2&&y1==y2)
        fine=15*(d1-d2);
        else if(m1!=m2&&y1==y2)
        fine=500*(m1-m2);
        else 
        fine=10000;
        System.out.println(fine);
    }
    
}
