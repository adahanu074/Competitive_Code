import java.util.*;
public class DutchNationalFlag
{
    public static void swap(int a,int b,int arr[])
    {
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void dutch(int arr[])
    {
        int low=0;
        int high = arr.length-1;
        int mid =0;
        while(mid<=high)
        {
            if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==0)
            {
                swap(low,mid,arr);
                low++;
                mid++;
            }
            else
            {
                swap(mid,high,arr);
                high--;
            }
        }
    }
    public static void main(String [] args)
    {
        int arr [] = {0,1,1,1,0,1,2,1,2,0,0,0,1,2,1,1};
        dutch(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}