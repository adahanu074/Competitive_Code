class DikstraAlgo 
{

   public int getMinIndex(int key[], boolean memSet[])
   {
       int min = Integer.MAX_VALUE;
       int getMin = -1;

       for(int i=0;i<key.length;i++)
       {
           if(key[i]<min && memSet[i]==false)
           {
               min=key[i];
               getMin = i;
           }
       }
       return getMin;
   }
   
   void printSolution(int dist[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < dist.length; i++) 
            System.out.println(i + " \t\t " + dist[i]); 
    } 

    public void dijkstra(int graph[][],int src)
   {
    int V =graph.length;   
    boolean memSet[] = new boolean[V];
    int key[] = new int[V];

    for(int i=0;i<V;i++)
    {
        key[i]=Integer.MAX_VALUE;
    }
    memSet[src]=true;
    key[src]=0;

    for(int j=0;j<V-1;j++)
    {

        int u = getMinIndex(key,memSet);

        for(int i=0;i<V;i++)
        {
            if(graph[u][i]!=0 && memSet[i]==false && (key[u]+graph[u][i])<key[i] && key[u]!=Integer.MAX_VALUE)
            {
                key[i]=key[u]+graph[u][i];
            }
        }
    }
    printSolution(key);
   } 
   public static void main(String[] args) 
    { 
        /* Let us create the example graph discussed above */
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