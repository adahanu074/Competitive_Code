import java.util.*;
class CountPossiblePath
{
    private int V;
    private LinkedList<Integer> adj[];
    private static int count = 0;
    CountPossiblePath(int V)
    {
        this.V=V;
        adj = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList<Integer>();
        }
    }

    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    private void dfsUtil(int src,int dest, boolean visited[])
    {
        visited[src]=true;
        if(src==dest)
        {
            visited[src]=false;
            count++;
            return;
        }
        Iterator<Integer> iter  = adj[src].iterator();
        while(iter.hasNext())
        {
            int value = iter.next();
            if(visited[value]==false)
            {
                visited[value]=true;
                dfsUtil(value,dest,visited);
            }
        }
        visited[src]=false;
    }
    private void countPaths(int src,int dest)
    {
        boolean visited[] =new boolean[V];

        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }

        dfsUtil(src,dest,visited);
    }
    public static void main(String [] args)
    {
        CountPossiblePath g = new CountPossiblePath(4); 
        g.addEdge(0, 1); 
    g.addEdge(0, 2); 
    g.addEdge(1, 2); 
    g.addEdge(2, 0); 
    g.addEdge(2, 3); 
    g.addEdge(3, 3);  
  
        int s = 0, d = 3; 
        g.countPaths(s, d);
        System.out.println(count);
    }
}