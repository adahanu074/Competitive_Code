import java.util.*;
class NodesAtLevel
{
    int V;
    LinkedList<Integer> adj[];
    NodesAtLevel(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    public void getNodes(int root , int level)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(root);
        queue.add(-1);
        int count=0;
        // int value = -20;
        while(!queue.isEmpty())
        {
            int value = queue.remove();
            if(value==(-1))
            {
                count++;
                queue.add(-1);
                value = queue.remove();
                if(value==(-1))
                {
                    break;
                }
                System.out.println();
                
            }
            // if(count==2)
            // {
                System.out.print(value+" ");
            // }
            Iterator<Integer> iter = adj[value].iterator();
            while(iter.hasNext())
            {
                int val = iter.next();
                queue.add(val);
            }
        }
    }
    public static void main(String [] args) 
    {
        NodesAtLevel g = new NodesAtLevel(6);  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(2, 4); 
        g.addEdge(2, 5);
        int level = 2;
        g.getNodes(0,level);
    }
}