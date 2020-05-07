import java.util.*;
public class QuickSort
{
    public static int divide(int arr[], int start,int end)
    {
        int ins = start-1;
        int high = arr[end];
        for(int i=start;i<end;i++)
        {
            if(arr[i]>high)
            {
                continue;
            }
            else
            {
                ins++;
                int temp =arr[i];
                arr[i]=arr[ins];
                arr[ins]=temp;
            }
        }
        ins++;
        int temp = arr[ins];
        arr[ins]=arr[end];
        arr[end]=temp;
        return ins;
    }
    public void sort(int arr[] , int start, int end)
    {
    if(start<end)
    {
        int partition = divide(arr,start, end);
        sort(arr,start,partition-1);
        sort(arr,partition+1,end);
    }
    }
    public static void main(String [] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
        System.out.println(Arrays.toString(arr));
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
        System.out.println(Arrays.toString(arr));
    }
}