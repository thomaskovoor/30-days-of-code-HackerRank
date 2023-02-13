
import java.util.*;
public class Day20{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n,j,temp,i;
       n=sc.nextInt();
       int arr[]=new int[1000];
       
       for(i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       } 
       sc.close();
       int numSwaps=0;
       for(i=0;i<n;i++)
       {
       int numberOfSwaps=0;
       for(j=0;j<n-1;j++)
       {
        if(arr[j]>arr[j+1])
        {
         temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
         numSwaps++;
         numberOfSwaps++;
        }
    }
        if(numberOfSwaps==0)
        {
            break;
        }
    }

System.out.println("Array is sorted in "+numSwaps+" swaps.");
System.out.println("First Element: "+arr[0]);
System.out.println("Last Element: "+arr[n-1]);

          
}
}
