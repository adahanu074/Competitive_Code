import java.util.*;
class DetectCycle
{
    int V;
    LinkedList<Integer> adj[];

    DetectCycle(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }
    boolean DFS(int src,boolean isVisited[] , boolean again[])
    {
        if(again[src]==true)
        {
            return true;
        }
        again[src]=true;
        isVisited[src]=true;
        Iterator<Integer> iter = adj[src].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isVisited[val]==false)
            {  
                if(DFS(val,isVisited,again))
                {
                    return true;
                }
            }
        }
        again[src]=false;
        return false;

    }
    boolean isCyclic()
    {
        boolean isVisited[] = new boolean[V];
        boolean again[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            isVisited[i] = false;
            again[i] = false;
        }
        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                boolean value =DFS(i,isVisited,again);
                if(value==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        DetectCycle graph = new DetectCycle(4); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3); 
        
        System.out.println(graph.isCyclic());
    }
}