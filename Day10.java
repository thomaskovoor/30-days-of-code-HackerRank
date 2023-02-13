

import java.util.Scanner;
public class Day10
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int d,i=0,a=0;;
        int arr[]=new int[1000];
        
        while(n>0)
        {
          d=n%2;
          arr[i]=d;
          if(n==1)
          {
            arr[i]=d;
            break;
          }
          n=n/2;
          i++;
        }
        int str[]=new int[i+1];
        int k=i;
        for(k=i;k>=0;k--)
        {
        if(arr[k]==1)
        {
          str[a]+=1;
        } 
        else
        a++;
      }
        int big=str[0];
        for(i=0;i<=a;i++)
        {
          if(big<str[i])
          big=str[i];
        }
        System.out.println(big);
        sc.close();
    }
  }