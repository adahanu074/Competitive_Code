import java.util.*;
class NextGreaterElement
{
    public static void main(String [] args)
    {

        int arr[] = new int[]{98,23,54,12,20,7,27};
        Stack<Integer> stack = new Stack<Integer>();
        int brr[] = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
            }
            else
            {
                if(arr[stack.peek()]<arr[i])
                {
                    
                    while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
                    {
                        brr[stack.peek()]=arr[i];
                        stack.pop();
                    }
                }
                stack.push(i);
            }
        }
        int start=0; 
        while(!stack.isEmpty())
        {
            brr[stack.pop()]=-1;
        }
        for(int i=0;i<brr.length;i++)
        {
           
                System.out.println(brr[i]);
      
        }
    }
}