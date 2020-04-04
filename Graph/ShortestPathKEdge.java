import java.util.*;
class ShortestPathKEdge
{
    static int V = 4;
    static int INF = Integer.MAX_VALUE;
    public int shortestPath(int graph[][] , int u, int v, int k)
    {
        if(k==0 && u==v)
        {
            return 0;
        }
        if(k==1 && graph[u][v]!=INF)
        {
            return graph[u][v];
        }
        if(k<=0 )
        {
            return INF;
        }
        int res = INF;

        for(int i=0;i<V;i++)
        {
            if(u!=i && v!=i && graph[u][i]!=INF)
            {
                int res_in = shortestPath(graph,i,v,k-1);
                if(res_in!=INF)
                {
                    res = Math.min(res,graph[u][i]+res_in);
                }
            }
        }
        return res;
    }
    public static void main (String[] args) 
    {
        int graph[][] = new int[][]{ {0, 10, 3, 2}, 
                                     {INF, 0, INF, 7}, 
                                     {INF, INF, 0, 6}, 
                                     {INF, INF, INF, 0} 
                                   }; 
                                   ShortestPathKEdge t = new ShortestPathKEdge(); 
        int u = 0, v = 3, k = 2; 
        System.out.println("Weight of the shortest path is "+ 
                           t.shortestPath(graph, u, v, k)); 
    } 
}