import java.util.*;
public class NextGreaterElement
{
    public static void next(int arr[])
    {
        
        Stack<Integer> stack =  new Stack<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(!stack.isEmpty() && stack.peek()<arr[i])
            {
                int value = stack.pop();
                System.out.println(value +" ---->"+arr[i]);
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty())
        {
            int value = stack.pop();
            System.out.println(value +" ---->"+"Sorry");
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {11, 13, 21, 3};
        next(arr);
    }
}