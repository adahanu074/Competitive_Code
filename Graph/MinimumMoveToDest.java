import java.util.*;
class MinimumMoveToDest
{
    static int moves = Integer.MAX_VALUE;
    static List<Integer> list = new ArrayList<Integer>();
    public static int check(int arr[][],int src,int dest,int n,int mov)
    {
        if(src<0 || src>=n || dest<0 || dest>=n)
        {
            return 0;
        }
        else if(arr[src][dest]==0)
        {
            return 0;
        }
        else if(arr[src][dest]==2)
        {
            list.add(mov);
            return 1;
        }
        else{
            arr[src][dest]=0;
            int val = check(arr,src,dest-1,n,mov+1)
            +check(arr,src-1,dest,n,mov+1)
            +check(arr,src,dest+1,n,mov+1)
            +check(arr,src+1,dest,n,mov+1);
            arr[src][dest]=1;
            return 0;
        }
    }
    public static void main(String [] args)
    {
        int arr[][]= new int[][]{{ 3 , 3 , 1 , 0 }, 
        { 3 , 0 , 3 , 3 }, 
        { 2 , 3 , 0 , 3 }, 
        { 0 , 3 , 3 , 3 } };
        int actual = 0;
        int flag=0;
         check(arr,0,2,4,0);
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}