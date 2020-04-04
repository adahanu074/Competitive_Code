import java.util.*;
public class SearchSortedRotatedArray
{
    public static int search(int arr[],int value,int start,int end)
    {
        if(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==value)
            {
                // System.out.println("1");
                return mid;
            }
            else if(arr[mid]<value)
            {
                // System.out.println("2");
                return search(arr,value,mid+1,end);
            }
            else
            {
                if(arr[start]<value)
                {
                    // System.out.println("3");
                    return search(arr,value,start,mid-1);
                }
                else if(arr[start] == value)
                {
                    return start;
                }
                else
                {
                    // System.out.println("4");
                    return search(arr,value,mid+1,end);
                }
            }
        }
        else
        {
            return -1;
        }

    }
    public static void main(String [] args)
    {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {4,5,6,7,0,1,2};
        //{9,12,15,17,25,28,32,37,3,5,7,8};
           //       [0,01,02,03,04,05,06,07,8,9,10,11];
        int value = sc.nextInt();
        int val  =  search(arr,value,0,arr.length-1);
        System.out.println(val);
    }
}