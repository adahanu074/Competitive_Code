import java.util.*;
class MergeSort
{
    static int count=0;
    public static void merge(int arr[],int start,int mid,int end)
    {
        int n1 = mid-start+1;
        int n2 =end-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int k=start;
        for(int i=0;i<n1;i++)
        {
            left[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=arr[mid+i+1];
        }
        int l=0;
        int r =0;
        while(l<n1 && r<n2)
        {
            if(left[l]<=right[r])
            {
                arr[k]=left[l];
                count++;
                l++;
            }
            else
            {
                arr[k]=right[r];
                count++;
                r++;
            }
            k++;
        }
        while(l<n1)
        {
            arr[k]=left[l];
            l++;
            k++;
        }
        while(r<n2)
        {
            arr[k]=right[r];
            r++;
            k++;
        }
    }
    public static void sort(int arr[],int start, int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {5,1,2,3,4}; 
        int n = arr.length;     
        sort(arr, 0, n-1); 
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}