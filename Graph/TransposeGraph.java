import java.util.*;
class TransposeGraph
{
    int V;
    LinkedList<Integer> adj[];
    TransposeGraph(int V)
    {
        this.V=V;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    public TransposeGraph transpose()
    {
        TransposeGraph graph = new TransposeGraph(V);
        for(int i=0;i<=4;i++)
        {
            Iterator<Integer> iter = adj[i].iterator();
            while(iter.hasNext())
            {
                int val = iter.next();
                graph.adj[val].add(i);
            }
        }
        return graph;
    }
    public static void main(String [] args)
    {
        TransposeGraph g = new TransposeGraph(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(0,3);
        g.addEdge(2,0);
        g.addEdge(3,2);
        g.addEdge(4,3);
        g.addEdge(4,1);
        TransposeGraph gra = g.transpose();
        for(int i=0;i<=4;i++)
        {
            System.out.println(gra.adj[i]);
        }
    }
}