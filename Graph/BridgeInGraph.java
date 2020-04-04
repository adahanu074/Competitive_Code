import java.util.*;
public class BridgeInGraph
{
    private int V;
    LinkedList<Integer> adj[];
    private int nil = -1;
    int time = 0;
    BridgeInGraph(int V)
    {
        this.V = V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        adj[dest].add(dest);
    }
    private void bridgeUtil(int u, boolean visited[],int disc[] , int low[], int parent[])
    {
        visited[u] = true;
        low[u]=disc[u]=++time;
        Iterator<Integer> i = adj[u].iterator();
        while(i.hasNext())
        {
            int v = i.next();

            if(!visited[v])
            {
                parent[v]=u;
                bridgeUtil(v,visited,disc,low,parent);

                low[u]= Math.min(low[u],low[v]);

                if(disc[u]<low[v])
                {
                    System.out.println(u+"   "+v);
                }
            }
            else if(v!=parent[u])
            {
                low[u]= Math.min(low[u],disc[v]);
            }
        }
    }
    private void bridge()
    {
        int parent[] =new int[V];
        boolean visited[] = new boolean[V];
        int low[] = new int[V];
        int disc[] = new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]= nil;
            visited[i]=false;
        }

        for(int i =0;i<V;i++)
        {
            if(!visited[i])
            {
                bridgeUtil(i,visited,disc,low,parent);
            }
        }
    }
    public static void main(String [] args)
    {
        BridgeInGraph g1= new BridgeInGraph(5);
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        g1.bridge(); 
    }
}