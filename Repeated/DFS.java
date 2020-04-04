import java.util.*;
class DFS
{
    private int V;
    private LinkedList<Integer> adj[];

    DFS(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList();
        }
    }

    public void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }

    public void dfsUtil(int v, boolean visited[])
    {
        visited[v]=true;
        System.out.println(v);

        Iterator<Integer> iter = adj[v].iterator();
        while(iter.hasNext())
        {
            int value = iter.next();
            if(visited[value]==false)
            {
                dfsUtil(value, visited);
            }
        }
    }
    public void dfs()
    {
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }

        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfsUtil(i, visited);
            }
        }
    }

    public static void main(String args[]) 
    { 
        DFS g = new DFS(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal"); 
  
        g.dfs(); 
    } 
}