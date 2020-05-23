import java.util.*;
public class GraphBFS
{
    public static int min = Integer.MAX_VALUE;
    public static void DFS(int matrix[][] , boolean visited[],int start, int end, int length)
    {
        if(start==end)
        {
            min = Math.min(length,min);
            return;
        }
        visited[start]=true;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[start][i]>0 && visited[i]==false)
            {
                DFS(matrix,visited,i,end,length+1);
            }
        }
        visited[start]=false;
        return;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int start = sc.nextInt()-1;
        int end = sc.nextInt()-1;
        int matrix[][] = new int[nodes][nodes];
        for(int i=0;i<nodes;i++)
        {
            for(int j=0;j<nodes;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean visited[] = new boolean[nodes];
        for(int i=0;i<nodes;i++)
        {
            visited[i]=false;
        }
        DFS(matrix,visited,start,end,0);
        System.out.println(min);
    }
}