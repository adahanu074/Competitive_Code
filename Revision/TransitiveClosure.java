import java.util.*;
class TransitiveClosure
{
    int V;
    LinkedList<Integer> adj[];
    TransitiveClosure(int V)
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
    }
    public void DFS(int start,int v,int graph[][],boolean visited[])
    {
        Iterator<Integer> iter = adj[v].iterator();
        
        while(iter.hasNext())
        {
            int val = iter.next();
            if(visited[val]==false)
            {
                visited[val]=true;
                graph[start][val]=1;
                DFS(start,val,graph,visited);
            }       
        }
    }
    public void getClosure()
    {
        int graph[][]= new int[V][V];
        boolean visited[] =new boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            graph[i][i]=1;
            visited[i]=true;
            DFS(i,i,graph,visited);
            Arrays.fill(visited,false);
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
    public static void main(String[] args) {
        TransitiveClosure g = new TransitiveClosure(4);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        g.getClosure();
    }
}
