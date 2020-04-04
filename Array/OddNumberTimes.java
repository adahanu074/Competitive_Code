import java.util.*;
public class OddNumberTimes
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,1,1,2,2,3};
        int result =0;
        for(int i=0;i<arr.length;i++)
        {
            result = result^arr[i]; 
        }
        System.out.println(result);
    }
}