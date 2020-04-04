import java.util.*;
class TransitiveClosureWithMatrix
{
    private int V;
    private LinkedList<Integer> adj[];
    private int tc[][];

    TransitiveClosureWithMatrix(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        tc=new int[V][V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    public void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }
    
    public void DFS(int src, int dest)
    {
        tc[src][dest]=1;

        Iterator<Integer> iter = adj[src].iterator();
        // while(iter.hasNext())
        // {
        //     int val = iter.next();
        //     if(tc[src][val]==0)
        //     {
        //         DFS(src,val);
        //     }
        // }
        for (int ad : adj[dest]) {             
            if (tc[src][ad]==0) { 
                DFS(src, ad); 
            } 
        } 
    }
    public void transitiveClosure()
    {
        for(int i=0;i<V;i++)
        {
            DFS(i,i);
        }
    }
    public static void main(String [] args)
    {
        TransitiveClosureWithMatrix g = new TransitiveClosureWithMatrix(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        System.out.println("Transitive closure " + 
                "matrix is"); 
  
        g.transitiveClosure();
        for (int i = 0; i < g.V; i++) { 
            System.out.println(Arrays.toString(g.tc[i])); 
          } 
          for (int i = 0; i < g.V; i++) { 
            System.out.println(g.adj[i]); 
          } 
    }
}