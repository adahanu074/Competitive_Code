import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args){
        long [] arr = new long[]{10,1,20,1};
        System.out.println(minsum_and(arr,4));
    }
    public static void swap(long [] arr , int a , int b)
    {
        long temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void permutation(long [] arr,ArrayList<ArrayList<Long>> list,int start, int end)
    {
        if(start == end)
        {
            ArrayList<Long> lo = new ArrayList<Long>();
            for(int i=0;i<arr.length;i++)
            {
                lo.add(arr[i]);
            }
            list.add(lo);
        }
        for(int i=start;i<=end;i++)
        {
            swap(arr,start,i);
            permutation(arr,list,start+1,end);
            swap(arr,start,i);
        }
    }
    public static long findval(ArrayList<Long> list)
    {
        long val = list.get(0);;
        for(int i=1;i<list.size();i++)
        {
            long val1=list.get(0);
            for(int j=1;j<=i;j++)
            {
                val1 &=list.get(j);
            }
            val +=val1;
        }
        System.out.println(val);
        return val;
    }
    static long minsum_and(long[] arr, int n){
        long max = Integer.MAX_VALUE;
        ArrayList<ArrayList<Long>> list = new ArrayList<ArrayList<Long>>();
        permutation(arr,list,0,n-1);
        // System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            long val = findval(list.get(i));
            if(max>val)
            {
                max=val;
            }
        }
        return max;
    }
}