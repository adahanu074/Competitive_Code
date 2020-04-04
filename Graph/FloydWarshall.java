class FloydWarshall
{
    public static int INF = 9999;
    public void floydWarshall(int graph[][])
    {
        int V= graph.length;

        int dist [][] = new int[V][];
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                dist[i][j]=graph[i][j];
            }
        }
        for (int k = 0; k < V; k++) 
        { 
            // Pick all vertices as source one by one 
            for (int i = 0; i < V; i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (int j = 0; j < V; j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                System.out.print(dist[i][j]+"  ");
            }
            System.out.println();
        }
        printGraph(dist);
    }

    public void printGraph(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {

                if(arr[i][j]==INF)
                {
                    System.out.print("INF ");
                }
                else
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
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