import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[]{3,4,7,2 ,1 ,6, 2};
        int val = Solution(7,15,arr);
        System.out.println(val);
    }
    public static ArrayList<Integer> subArray(int i, int arr[])
    {
        int j=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(i>0)
        {
            if((i&1)>0)
            {
                list.add(arr[j]);
            }
            i = (i>>1);
            j++;
        }
        return list;
    }
    static int Solution(int N, int K, int[] arr){
        int range=(1<<N)-1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=range;i++)
        {
           ArrayList<Integer> lis = subArray(i,arr);
           list.add(lis);
        }
        int min=1000;
        for(int i=0;i<list.size();i++)
        {
            int sum=0;
            for(int j=0;j<list.get(i).size();j++)
            {
                sum=sum+list.get(i).get(j);
            }
            if((sum%K)==0)
            {
                if(min>list.get(i).size())
                {
                    min=list.get(i).size();
                }
            }
        }
        if(min==1000)
        {
            return -1;
        }
        return min;
    }
}