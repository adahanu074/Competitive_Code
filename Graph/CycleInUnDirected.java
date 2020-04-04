import  java.util.*;
class CycleInUnDirected
{
    int V;
    LinkedList<Integer> adj[];
    static int count=0;
    CycleInUnDirected(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList();
        }
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        // adj[dest].add(src);
    }

    public boolean cycle(boolean isVisited[],int n,int parent)
    {
        isVisited[n]=true;

        Iterator<Integer> iter =adj[n].iterator();

        while(iter.hasNext())
        {
            int i = iter.next();
            if(isVisited[i]==false)
            {
                if(cycle(isVisited,i,n))
                {
                    return true;
                }
            }
            else if(i!=parent)
            {
                count++;
                return true;
            }
        }
        return false;
    }
    public boolean isCyclic()
    {
        boolean isVisited[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            isVisited[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                if(cycle(isVisited,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        CycleInUnDirected g1 = new CycleInUnDirected(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        if (g1.isCyclic()) {
            System.out.println("Graph contains cycle"); 
            System.out.println(count); 
        }
        else
            System.out.println("Graph doesn't contains cycle"); 
  
            CycleInUnDirected g3 = new CycleInUnDirected(7); 
            // Graph g3 = new Graph(7); 
            g3.addEdge(0, 1); 
            g3.addEdge(1, 2); 
            g3.addEdge(2, 0); 
            g3.addEdge(1, 3); 
            g3.addEdge(1, 4); 
            g3.addEdge(1, 6); 
            g3.addEdge(3, 5); 
            g3.addEdge(4, 5); 
        if (g3.isCyclic()) 
        {
            System.out.println("Graph contains cycle");
            System.out.println(count);  
        }
        else
            System.out.println("Graph doesn't contains cycle"); 
    } 
}