import java.util.*;
class FindBridge
{
    int V;
    LinkedList<Integer> adj[];
    int time=0;

    FindBridge(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList();
        }
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public void bridgeUtil(int u,boolean visited[],int low[],int desc[],int parent[])
    {
        visited[u]=true;
        low[u]=desc[u]=++time;

        Iterator<Integer> iter = adj[u].iterator();
        while(iter.hasNext())
        {
            int v= iter.next();

            if(visited[v]==false)
            {
                parent[v]=u;
                bridgeUtil(v,visited,low,desc,parent);

              low[u]=Math.min(low[v],low[u]);

                if(desc[u]<low[v])
                {
                    System.out.println(v+"    "+u);
                }
            }
            else if(v!=parent[u])
            {
                low[u]=Math.min(low[u],desc[v]);
            }
        }
    }
    public void bridge()
    {
        boolean visited[] = new boolean[V];
        int low[]= new int[V];
        int desc[] = new int[V];
        int parent[] = new int[V];

        for(int i=0;i<V;i++)
        {
            visited[i]=false;
            parent[i]=-1;
        }

        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                bridgeUtil(i,visited,low,desc,parent);
            }
        }
    }
    public static void main(String args[]) 
    { 
        // Create graphs given in above diagrams 
        System.out.println("Bridges in first graph "); 
        FindBridge g1 = new FindBridge(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        g1.bridge(); 
        System.out.println(); 
  
        System.out.println("Bridges in Second graph"); 
        FindBridge g2 = new FindBridge(4); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        g2.addEdge(2, 3); 
        g2.bridge(); 
        System.out.println(); 
  
        System.out.println("Bridges in Third graph "); 
        FindBridge g3 = new FindBridge(7); 
        g3.addEdge(0, 1); 
        g3.addEdge(1, 2); 
        g3.addEdge(2, 0); 
        g3.addEdge(1, 3); 
        g3.addEdge(1, 4); 
        g3.addEdge(1, 6); 
        g3.addEdge(3, 5); 
        g3.addEdge(4, 5); 
        g3.bridge(); 
    } 
}