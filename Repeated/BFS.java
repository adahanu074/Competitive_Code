import java.util.*;
class BFS
{
    int V;
    LinkedList<Integer> adj[];

    BFS(int V)
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

    public void bfs(int v)
    {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];

        visited[v]=true;
        queue.add(v);
        queue.add(-1);
        // System.out.println(v);
        while(!queue.isEmpty())
        {
            int value = queue.poll();
            if(value==(-1))
            {
                value = queue.poll();
                if(value==(-1))
                {
                    break;
                }
                System.out.println();
            }
            System.out.print(value+"  ");
            Iterator<Integer> iter = adj[value].iterator();
            while(iter.hasNext())
            {
                int node = iter.next();
                if(visited[node]==false)
                {
                  queue.add(node);
                  visited[node]=true;
                }
            }
            queue.add(-1);
        }
        System.out.println();

    }
    
    public static void main(String args[]) 
    { 
        BFS g = new BFS(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.bfs(2); 
    } 
}