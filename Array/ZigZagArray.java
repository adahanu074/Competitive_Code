import java.util.*;
public class ZigZagArray
{
    public static void swap(int arr[],int a,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void zigg(int arr[])
    {
        int flag=0;
        int i=0;
        while(i<arr.length-1)
        {
            if(flag==0)
            {
                if(arr[i]>arr[i+1])
                {
                    swap(arr,i,i+1);
                }
                i++;
                flag=1;
            }
            else
            {
                if(arr[i]<arr[i+1])
                {
                    swap(arr,i,i+1);
                }
                i++;
                flag=0;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+"  ");
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {3,2,6,2,1,8,9};
        zigg(arr);
    }
}