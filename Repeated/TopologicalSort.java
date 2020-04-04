import java.util.*;
class TopologicalSort
{
    int V;
    LinkedList<Integer> adj[];
    
    TopologicalSort(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }

    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }
    public void dfs(int v, boolean visited[], Stack<Integer> stack)
    {
        visited[v]=true;

        Iterator<Integer> iter = adj[v].iterator();
        while(iter.hasNext())
        {
            int value = iter.next();
            if(visited[value]==false)
            {
                dfs(value,visited,stack);
            }
        }
        stack.push(v);
    }
    public void topologicalSort()
    {
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,visited,stack);
                // System.out.println();
            }
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+"    ");
        }
        System.out.println();
    }
    public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        TopologicalSort g = new TopologicalSort(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.topologicalSort(); 
    } 
}