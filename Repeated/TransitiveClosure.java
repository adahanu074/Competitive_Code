import java.util.*;
class TransitiveClosure
{
    private int V;
    private LinkedList<Integer> adj[];

    TransitiveClosure(int V)
    {
        this.V=V;
        adj = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    private void dfs(int start,int v,int graph[][],boolean visited[])
    {
        visited[v]=true;
        graph[start][v]=1;
        Iterator<Integer> iter = adj[v].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(visited[val]==false)
            {
            dfs(start,val,graph,visited);
            }
        }
    }
    private void transitive()
{

        int graph[][] = new int[V][V];
        boolean visited [] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            dfs(i,i,graph,visited);
            Arrays.fill(visited,false);
        }

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
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
        g.transitive();
    }
}