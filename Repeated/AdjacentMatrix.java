import java.util.*;
public class AdjacentMatrix
{
    int V;
    LinkedList<Integer> adj[];

    AdjacentMatrix(int V)
    {
        this.V=V;
        adj = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        // adj[dest].add(src);
    }
    public void transitiveClosure()
    {
        boolean visited[] = new boolean[V];
        int graph[][] = new int[V][V];

        
        for(int i=0;i<V;i++)
        {
            graph[i][i]=1;
            Iterator<Integer> iter = adj[i].iterator();
            while(iter.hasNext())
            {
                int v = iter.next();
                graph[i][v]=1;
            }
        }

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        
        AdjacentMatrix g =new AdjacentMatrix(4);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);

        g.transitiveClosure();
    }
    
}