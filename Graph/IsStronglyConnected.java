import java.util.*;
class IsStronglyConnected
{
    int V;
    LinkedList<Integer> adj[];

    IsStronglyConnected(int V)
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
    public IsStronglyConnected getTranspose()
    {
        IsStronglyConnected graph1 = new IsStronglyConnected(V);
        for(int i=0;i<V;i++)
        {
            Iterator<Integer> iter = adj[i].iterator();
            while(iter.hasNext())
            {
                int val = iter.next();
                graph1.adj[val].add(i);
            }
        }
        return graph1;
    }

    public void fill(int src, boolean visited[],Stack<Integer> stack)
    {
        visited[src]=true;

        Iterator<Integer> iter = adj[src].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(visited[val]==false)
            {
                fill(val,visited,stack);
            }
        }
        stack.push(src);
    }

    void DFS(int val, boolean visited[])
    {
        visited[val]=true;
        System.out.print(val+" ");
        Iterator<Integer> iter =adj[val].iterator();
        while(iter.hasNext())
        {
            int va = iter.next();
            if(visited[va]==false)
            {
                DFS(va,visited);
            }
        }
    }
    public int  kosaraju()
    {
        Stack<Integer> stack = new Stack<Integer>();
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }

        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                fill(i,visited,stack);
            }
        }

        IsStronglyConnected gra = getTranspose();

        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        int count=0;
        while(!stack.isEmpty())
        {
            int value = stack.pop();
            if(visited[value]==false)
            {
                gra.DFS(value,visited);
                System.out.println();
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        IsStronglyConnected g = new IsStronglyConnected(5); 
        g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(3, 4); 
  
        System.out.println("Following are strongly connected components "+ 
                           "in given graph "); 
        System.out.println(g.kosaraju());
    } 
}