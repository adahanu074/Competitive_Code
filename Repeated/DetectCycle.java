import java.util.*;
public class DetectCycle
{
    private int V;
    private LinkedList<Integer> adj[];

    DetectCycle(int V)
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
    }

    private boolean dfs(int v, boolean visited[], boolean restack[])
    {
        if(restack[v]==true)
        {
            return true;
        }
        if(visited[v]==true)
        {
            return false;
        }
        
        visited[v]=true;
        restack[v]=true;
        boolean va = false;
        Iterator<Integer> iter = adj[v].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            va = va || dfs(val,visited,restack);
        }
        restack[v]=false;
        return va;
    }
    public boolean isCyclic()
    {
        boolean visited[] = new boolean[V];
        boolean restack[] = new boolean[V];

        for(int  i =0;i<V;i++)
        {
            visited[i]=false;
            restack[i]=false;
        }

        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                boolean value = dfs(i,visited,restack);
                if(value==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) 
    { 
        DetectCycle graph = new DetectCycle(4); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3); 
          
        if(graph.isCyclic()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't "
                                    + "contain cycle"); 
    } 
}