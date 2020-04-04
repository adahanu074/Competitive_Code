import java.util.*;
public class GraphDFS
{
    private int V;
    private LinkedList<Integer> adj[];
    private static Stack<Integer> stack = new Stack<Integer>();
    GraphDFS(int V)
    {
        this.V = V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int src , int dest)
    {
        adj[src].add(dest);
    }
    public void DFSUtil(boolean isVisited[] , int node)
    {
        isVisited[node]= true;

        Iterator<Integer> iter = adj[node].iterator();
        while(iter.hasNext())
        {
            int i = iter.next();
            if(!isVisited[i])
            {
                DFSUtil(isVisited,i);
            }
        }
        stack.push(node);
    }
    public void DFS()
    {
        boolean isVisited[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!isVisited[i])
            {
                DFSUtil(isVisited,i);
            }
        }
    }
    public static void main(String [] args)
    {
        int V =6; 
        GraphDFS g = new GraphDFS(V); 
        g.addEdge(5, 2); 
    g.addEdge(5, 0); 
    g.addEdge(4, 0); 
    g.addEdge(4, 1); 
    g.addEdge(2, 3); 
    g.addEdge(3, 1); 
        g.DFS();
        System.out.println(stack);
    }

}