import java.util.*;
class CountPath
{
    int V;
    LinkedList<Integer> adj[];

    CountPath(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    public void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }

    public int DFS(int start, int end, boolean visited[])
    {
        if(start==end)
        {
            visited[end]=false;
            return 1;
        }
        Iterator<Integer> iter = adj[start].iterator();
        int count =0;
        while(iter.hasNext())
        {
            int value = iter.next();
            if(visited[value]==false)
            {
                visited[value]=true;
                count += DFS(value,end,visited);
            }
        }
        visited[start]=false;
        return count;
    }
    public void countPaths(int start, int end)
    {
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(i==start)
            {
            visited[start]=true;
            int vol = DFS(start,end,visited);
            System.out.println(vol);
            break;
            }
        }
    }
    public static void main(String args[])  
    { 
        CountPath g = new CountPath(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(2, 0); 
        g.addEdge(2, 1); 
        g.addEdge(1, 3); 
  
        int s = 2, d = 3; 
        g.countPaths(s, d); 
    } 
}