import java.util.*;
public class RemoveDuplicateSpace
{
    // Space Required 
    // public static void remove(int arr[])
    // {
    //     int arr1[]= new int[arr.length];
    //     int j=0;
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         if(arr[i]!=arr[i+1])
    //         {
    //             arr1[j]=arr[i];
    //             j++;
    //         }
    //     }
    //     arr1[j]=arr[arr.length-1];
    //     for(int i=0;i<=j;i++)
    //     {
    //         System.out.print(arr1[i]+" ");
    //     }
    // }
    public static void remove(int arr[])
    {
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        for(int i=0;i<=j;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[] ={1,2,2,2,3,4,4,4,5,6,6,7,7};
        remove(arr);
    }
}