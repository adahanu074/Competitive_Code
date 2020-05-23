import java.util.*;
public class Solution00 {
    public static int[] solve(int A, int[] B) {
        int n = B.length+1;
        int m = A+1;
        boolean result[][]= new boolean[n][m];
        for(int i=0;i<m;i++)
        {
            result[0][i]=false;
        }
        for(int i=0;i<n;i++)
        {
            result[i][0]=true;
        }
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(j<B[i-1])
                {
                    result[i][j]=result[i-1][j];
                }
                else if(j==B[i-1])
                {
                    result[i][j]=true;
                }
                else
                {
                    result[i][j]=result[i-1][j] || result[i][j-B[i-1]];
                }
            }
            if(result[i][m-1]==true)
            {
                int start=i;
                int end = m-1;
                while(start>0 && end>0)
                {
                    if(result[start][end]&& result[start-1][end])
                    {
                        start=start-1;
                    }
                    else
                    {
                        list.add(i-1);
                        end =end-B[i-1];
                    }
                }
            }
        }
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();
            
        }
        System.out.println(list);
        return new int[]{};
    }
    public static void main(String [] args)
    {
        int A=10;
        int arr[]= new int[]{8,8,6,5,4};
        solve(A,arr);
    }
}
