import java.util.*;
public class DikstraAlgo
{
    public static int miniindex(int memset[], boolean visited[])
    {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<memset.length;i++)
        {
            if(memset[i]<min && visited[i]==false)
            {
                min = memset[i];
                index=i;
            }
        }
        return index;
    }
    public static void Dikstra(int matrix[][],int start)
    {
        int nodes = matrix.length;
        boolean visited[] =new boolean[nodes];
        int memset[]= new int[nodes];

        for(int i=0;i<nodes;i++)
        {
            visited[i]=false;
            memset[i]=Integer.MAX_VALUE;
        }

        memset[start]=0;
        for(int i=0;i<nodes-1;i++)
        {
            int minIndex = miniindex(memset,visited);
            visited[minIndex]=true;
            for(int j=0;j<nodes;j++)
            {
                if(visited[j]==false && memset[minIndex]!=Integer.MAX_VALUE && matrix[minIndex][j]>0 && (memset[minIndex]+matrix[minIndex][j])<memset[j])
                {
                    memset[j]=memset[minIndex]+matrix[minIndex][j];
                }
            }
        }

        for(int i=0;i<nodes;i++)
        {
            if(memset[i]==Integer.MAX_VALUE)
            memset[i]=-1;
        }
        for(int i=0;i<nodes;i++)
        {
            System.out.print(memset[i] + " ");
        }

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int matrix[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        Dikstra(matrix,start-1);
    }
}