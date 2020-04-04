import java.util.*;
public class KandaneAlgo
{
    private static int kandane(int arr[])
    {
        int max_till_now = 0;
        int high =0;
        for(int i=0;i<arr.length;i++)
        {
            max_till_now = max_till_now+arr[i];
            if(max_till_now<0)
            {
                max_till_now =0;
            }
            if(max_till_now>high)
            {
                high=max_till_now;
            }
        }
        return high;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        int value = kandane(arr);
        System.out.println(value);
    }
}