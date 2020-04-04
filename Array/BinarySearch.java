import java.util.*;
public class BinarySearch
{
    public static boolean search(int arr[],int value,int start,int end)
    {
        if(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==value)
            {
                return true;
            }
            else if(arr[mid]>value)
            {
                return search(arr,value,start,mid-1);
            }
            else
            {
                return search(arr,value,mid+1,end);
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int value = sc.nextInt();
        boolean result = search(arr,value,0,arr.length-1);
        System.out.println(result);
    }
}