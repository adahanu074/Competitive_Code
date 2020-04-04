import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class AllPairShortestPath 
{ 
    final static int INF = 99999, V = 4; 
  
    void floydWarshall(int graph[][]) 
    { 
        int arr[][] =new int[V][V];
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                arr[i][j]= graph[i][j];
            }
        } 

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                for(int k=0;k<V;k++)
                {
                    if((arr[i][k] + arr[k][j])<(arr[i][j]))
                    {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
    public static void main (String[] args) 
    {
        int graph[][] = { {0,   5,  INF, 10}, 
                          {INF, 0,   3, INF}, 
                          {INF, INF, 0,   1}, 
                          {INF, INF, INF, 0} 
                        }; 
        AllPairShortestPath a = new AllPairShortestPath(); 
        a.floydWarshall(graph); 
    } 
} 
  