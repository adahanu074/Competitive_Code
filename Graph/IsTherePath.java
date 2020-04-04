import java.util.*;
class IsTherePath
{
    int V;
    LinkedList<Integer> adj[];

    IsTherePath(int V)
    {
        this.V=V;
        adj= new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    public boolean DFS(int val, int dest, boolean visited[])
    {
        if(val==dest)
        {
            return true;
        }
        else
        {
            visited[val]=true;
            Iterator iter = adj[val].iterator();
            while(iter.hasNext())
            {
                int va = (int)iter.next();
                if(visited[va]==false)
                {
                    if(DFS(va,dest,visited))
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean isReachable(int src,int dest)
    {
       if(src==dest)
       {
           return true;
       }
       else
       {
           boolean visited[] =new boolean[V];
           for(int i=0;i<V;i++)
           {
               visited[i] = false;
           }
           visited[src]=true;
           boolean vaa = false;
           Iterator iter = adj[src].iterator();
           while(iter.hasNext())
           {
               int val = (int)iter.next();
               if(visited[val]==false)
               {
                   vaa = DFS(val,dest,visited);
               }
           }
           return vaa;
       }
    }
    public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        IsTherePath g = new IsTherePath(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        int u = 1; 
        int v = 3; 
        if (g.isReachable(u, v)) 
            System.out.println("There is a path from " + u +" to " + v); 
        else
            System.out.println("There is no path from " + u +" to " + v);; 
  
        u = 3; 
        v = 1; 
        if (g.isReachable(u, v)) 
            System.out.println("There is a path from " + u +" to " + v); 
        else
            System.out.println("There is no path from " + u +" to " + v);; 
    }
}