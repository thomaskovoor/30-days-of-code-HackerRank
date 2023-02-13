import java.util.HashMap;
import java.util.Scanner;
class Day8
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
HashMap<String,Integer> phoneBook= new HashMap<String,Integer>();  
int n=sc.nextInt();
String a;
int b;
for(int i=0;i<n;i++)
{
a=sc.next();
b=sc.nextInt();
phoneBook.put(a,b);
}
while(sc.hasNext())
{
    String s=sc.next();
    if(phoneBook.containsKey(s))
    {
        System.out.println(s+"="+phoneBook.get(s));
    }
    else
    System.out.println("Not found");
}
}
}