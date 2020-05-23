import java.util.*;
class Solution22 {
    public static int shortestSubarray(int[] A, int K) {
        Queue<Integer> queue = new LinkedList<>();
        int sum=0; 
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
         {
             sum += A[i];
            queue.add(A[i]);
            if(sum==K)
            {
                min = Math.min(min,queue.size());
            }
             while(!queue.isEmpty() && sum>K)
             {
                 min = Math.min(min,queue.size());
                 sum= sum - queue.poll();
             } 
         }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{77,19,35,10,-14};
        int val = shortestSubarray(arr,19);
        System.out.println(val);
    }
}