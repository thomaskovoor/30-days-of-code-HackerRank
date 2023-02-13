import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class Day18
 {
  public static void main(String[] args)
  {
    Stack<Character> stack = new Stack<Character>();
    Queue <Character> queue = new LinkedList<Character>();
    Scanner sc=new Scanner(System.in);
    Day18 obj= new Day18();
    String s=sc.nextLine();
    sc.close();
    char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++)
    { 
        stack.push(ch[i]);
        queue.add(ch[i]);
    }
    boolean flag=true;
    for(int j=0;j<ch.length;j++)
    {
        if(stack.pop()!=queue.remove())
        {
        flag=false;
        break;
        }

    }
    System.out.println( "The word, " + s + ", is "+( (!flag) ? "not a palindrome." : "a palindrome." ) );
  }    
}