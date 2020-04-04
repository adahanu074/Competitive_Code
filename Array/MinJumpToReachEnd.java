import java.util.*;
public class MinJumpToReachEnd
{
    public static int jump(int arr[])
    {
        int arr1[] = new int[arr.length];
        Arrays.fill(arr1,1000);
        arr1[0]=0;
        int j=1;
        while(j<arr.length)
        {
            for(int i=0;i<j;i++)
            {
                if((j-i)<=arr[i])
                {
                    arr1[j]= Math.min(arr1[j],arr1[i]+1);
                }
            }
            j++;
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        return arr1[arr1.length-1];
    }
    public static void main(String [] args)
    {
        Scanner sc  = new Scanner(System.in);
        int arr []= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int value = jump(arr);
        System.out.println(value);
    }
}