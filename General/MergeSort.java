import java.util.*;
public class MergeSort
{
    public static void merge(int arr[] ,int start,int mid ,int end)
    {
        int n1 = mid -start+1;
        int n2= end -mid;

        int left[] = new int[n1];
        int right []= new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=arr[mid+1+i];
        }
        int k=0;
        int l=0;
        int sta= start;
        while(k<n1 && l<n2)
        {
            if(left[k]<right[l])
            {
                arr[sta] = left[k];
                k++;
            }
            else
            {
                arr[sta]= right[l];
                l++;
            }
            sta++;
        }
        while(k<n1)
        {
            arr[sta]=left[k];
            sta++;
            k++;
        }
        while(l<n2)
        {
            arr[sta]=right[l];
            sta++;
            l++;
        }
    }
    public static void mergeSort(int arr[], int start , int end)
    {
        if(start<end)
        {
            int mid = ((start+end)/2);
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12, 11, 13, 5, 6, 7}; 

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.print(" \n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}