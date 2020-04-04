import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class Shortest { 
    static final int V = 9;
    
    public int minimumdist(int dist[], boolean visited[])
    {
        int min = Integer.MAX_VALUE;
        int minindex= -2;
        for(int i=0;i<V;i++)
        {
            if(!visited[i] && dist[i]<min)
            {
                minindex = i;
                min=dist[i];
            }
        }
        return minindex;
    }

    void dijkstra(int graph[][], int src) 
    { 
        int dist [] = new int[V];
        boolean visited [] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            visited[i]= false;
        }
        dist[src]=0;
        for(int k=0;k<V-1;k++)
        {
            int index = minimumdist(dist,visited);
            visited[index]=true;

            for(int i=0;i<V;i++)
            {
                if(!visited[i] && dist[index]!=Integer.MAX_VALUE  && graph[index][i]!=0 && (dist[index]+graph[index][i])<dist[i]){
                    dist[i] = dist[index]+graph[index][i];
                }
            }
        }

        for(int i=0;i<V;i++)
        {
            System.out.println(dist[i]);
        }
    }  
    public static void main(String[] args) 
    { 
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
        ShortestPath t = new ShortestPath(); 
        t.dijkstra(graph, 0); 
    } 
} 