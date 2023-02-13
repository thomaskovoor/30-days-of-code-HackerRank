
import java.util.*;

public class Day11
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
   int i,j;
   int arr[][]=new int[6][6];
   for(i=0;i<6;i++)
   {
     for(j=0;j<6;j++)
     {
       arr[i][j]=sc.nextInt();
     }
   }
   int max=-9*6;
   for(i=0; i<4; i++) {
    for(j=0; j<4; j++) {
        int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
        sum += arr[i+1][j+1];
        sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        if(sum>max) {
            max = sum;
        }
    }
}
System.out.println(max);
   


}    
}