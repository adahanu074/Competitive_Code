import java.util.*;
public class Leader
{
    public static void leader(int arr[])
    {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
            }
            else
            {
                 while(!stack.isEmpty() && stack.peek()<arr[i])
                    {
                        stack.pop();
                    }
                    stack.push(arr[i]);
            }
        }
        System.out.println(stack);
    }
    public static void main(String [] args)
    {
        int arr[] = {27, 39, 15, 12, 18, 4};
        leader(arr);
    }
}