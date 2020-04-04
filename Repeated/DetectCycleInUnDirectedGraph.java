import java.util.*;
class DetectCycleInUnDirectedGraph
{
    int V;
    LinkedList<Integer> adj[];

    DetectCycleInUnDirectedGraph(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }

    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    private boolean dfs(int v,boolean visited[],int parent[])
    {
        if(visited[v]==true)
        {
            return true;
        }
        visited[v]=true;

        Iterator<Integer> iter= adj[v].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            parent[val]=v;
            if(dfs(val,visited,parent) && parent[v]!=val)
            {
                return true;
            }
        }
        return false;
    }

    private boolean isCyclic()
    {
        boolean visited[] = new boolean[V];
        int parent[] = new int[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
            parent[i]=-1;
        }
        parent[0]=0;

        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                boolean val = dfs(i,visited,parent);
                if(val==true)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String [] args)
    {
        DetectCycleInUnDirectedGraph g1 = new DetectCycleInUnDirectedGraph(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        if (g1.isCyclic()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contains cycle"); 
  
            DetectCycleInUnDirectedGraph g2 = new DetectCycleInUnDirectedGraph(3); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        if (g2.isCyclic()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contains cycle"); 
    }
}