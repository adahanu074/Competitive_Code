import java.util.*;
class GraphBFS
{
    private int V;
    private LinkedList<Integer> adj[];

    GraphBFS(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList<>();
        }
    }

    void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }

    void BFS(int start)
    {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(start);
        boolean isVisited[] = new boolean[V];
        while(!queue.isEmpty())
        {
            int val = queue.remove();
            if(!isVisited[val])
            {
                isVisited[val]=true;
            System.out.println(val);
            Iterator<Integer> iter = adj[val].iterator();
            while(iter.hasNext())
            {
                queue.add(iter.next());
            }
        }
        } 
    }
    public static void main(String [] args)
    {
        
        GraphBFS g = new GraphBFS(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        g.BFS(2);
    }

}