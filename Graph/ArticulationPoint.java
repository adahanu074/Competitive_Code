import java.util.*;
class ArticulationPoint
{
    int V;
    LinkedList<Integer> adj[] ;
    int time =0;
    int nil=-1;
    ArticulationPoint(int V)
    {
        this.V = V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList<Integer>();
        }
    }
    void addEdge(int src, int dest)
    {
        adj[src].add(dest);
        adj[dest].add(src);
    }
    public void APUtil(int u, boolean visited[], int disc[] , int low[],
                       int parent[], boolean ap[])
    {
        int children = 0;
        visited[u]=true;
        disc[u]=low[u]=++time;
        Iterator<Integer> i = adj[u].iterator();
        while(i.hasNext())
        {
            int v = i.next();
            if(!visited[v])
            {
                children++;
                parent[v]=u;
                APUtil(v,visited,disc,low,parent,ap);
                low[u]= Math.min(low[u],low[v]);
                if(parent[u] == nil && children>1){
                    ap[u]=true;
                }
                if(parent[u]!=nil && low[v]>=disc[u])
                {
                    ap[u]=true;
                }
            }
            else if(v!=parent[u])
            {
                low[u]= Math.min(low[u],low[v]);
            }
        }
    }
                       
    public void AP()
    {
        boolean visited[] =new boolean[V];
        int parent[] = new int[V];
        int low[] = new int[V];
        int disc[]= new int[V];
        boolean ap[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            parent[i]=nil;
            visited[i]=false;
            ap[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                APUtil(i,visited,disc,low,parent,ap);
            }
        }
        for(int i=0;i<V;i++)
        {
            if(ap[i]==true)
            {
                System.out.print(i+"  ");
            }
        }
    }
    public static void main(String args[]) 
    { 
        // Create graphs given in above diagrams 
        System.out.println("Articulation points in first graph "); 
        ArticulationPoint g1 = new ArticulationPoint(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        g1.AP(); 
        System.out.println(); 
  
        System.out.println("Articulation points in Second graph"); 
        ArticulationPoint g2 = new ArticulationPoint(4); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        g2.addEdge(2, 3); 
        g2.AP(); 
        System.out.println(); 
  
        System.out.println("Articulation points in Third graph "); 
        ArticulationPoint g3 = new ArticulationPoint(7); 
        g3.addEdge(0, 1); 
        g3.addEdge(1, 2); 
        g3.addEdge(2, 0); 
        g3.addEdge(1, 3); 
        g3.addEdge(1, 4); 
        g3.addEdge(1, 6); 
        g3.addEdge(3, 5); 
        g3.addEdge(4, 5); 
        g3.AP(); 
    } 
}