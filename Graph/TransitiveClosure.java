import java.util.*;
class TransitiveClosure
{
    private static int V;
    private static LinkedList<Integer> adj[];
    private static int tc[][];
    TransitiveClosure(int V)
    {
        this.V=V;
        tc = new int[V][V];
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
    
    public void doTransitive(int src)
    {
        tc[src][src]=1;
        Iterator<Integer> iter = adj[src].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            tc[src][val]=1;
        }
    }
    public void transitiveClosure()
    {
        for(int i=0;i<V;i++)
        {
            doTransitive(i);
        }
    }
    public static void main(String [] args)
    {
        TransitiveClosure g = new TransitiveClosure(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        g.transitiveClosure();

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                System.out.print(tc[i][j]+"  ");
            }
            System.out.println();
        }
    }
}