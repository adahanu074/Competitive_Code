import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the climbingLeaderboard function below.
    public static int find(int [] myarray,int val,int start, int end)
    {
        if(start<=end)
        {
        int mid = (start+end)/2;
        if(myarray[mid]==val)
        {
            return mid;
        }
        else if(myarray[mid]<val)
        {
            return find(myarray,val,mid+1,end);
        }
        else
        {
            return find(myarray,val,start,mid-1);
        }
        }
        return -1;
    }
    static void climbingLeaderboard(int[] scores, int[] alice) {
        int val[]= new int[alice.length];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<scores.length;i++)
        {
            set.add(scores[i]);
        }
        int arr[]= new int[set.size()]; 
        TreeSet<Integer> set1 = new TreeSet<>(set);
        System.out.println(set1); 
        for(int i=0;i<set.size();i++)
        {
            arr[i]=set1.pollFirst(); 
        }
        for(int i=0;i<alice.length;i++)
        {
            int value = find(arr,alice[i],0,(arr.length-1));
            System.out.println(value);
            System.out.println(alice[i]);
            val[i] =arr.length-value;    
        }
        // for(int i=0;i<alice.length;i++)
        // {
        //     System.out.println(val[i]);   
        // }
        
    }

    public static void main(String[] args) throws IOException {
       int scores[] = new int[]{100, 100, 50 ,40, 40 ,20, 10};
       int alice[] = new int[]{5 ,25 ,50 ,120};
       climbingLeaderboard(scores,alice);
    }
}
