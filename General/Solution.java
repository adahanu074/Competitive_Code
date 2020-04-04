import java.util.*;
public class Solution {

    // Complete the substrings function below.
    public static int check(int n,int arr[])
    { 
        int j=0;
        List<Integer> list = new ArrayList<Integer>();
        while(n>0)
        {
            if((n&1)>0)
            {
                list.add(arr[j]);
            }
            else
            {
                break;
            }
            n=(n>>1);
            j++;
        }
        
        String result ="";
        for(int k=0;k<list.size();k++)
        {
            result=result+String.valueOf(list.get(k));
        }
        // System.out.println(result);
        int va =0;
        if(result.length()!=0)
        {
        va = Integer.parseInt(result);
        }
        return va;
    }
    static int substrings(String n) {
        int arr[] = new int[n.length()];
        for(int i=0;i<n.length();i++)
        {
            arr[i]=Integer.parseInt(String.valueOf(n.charAt(i)));
        } 
        int range = (1<<n.length())-1;
        int result =0;
        for(int i=1;i<=range;i++)
        {
            result +=check(i,arr);
        }
        return result;
    }

    public static void main(String [] args)
    {
        String str = "123";
        System.out.println(substrings(str));
    }
}