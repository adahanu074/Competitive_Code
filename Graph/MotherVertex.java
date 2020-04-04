import java.util.*;
class MotherVertex
{
    int V;
    LinkedList<Integer> adj[];
    
    MotherVertex(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList();
        }
    }

    void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }

    void DFSUtil(int i, boolean isVisited[])
    {
        isVisited[i]=true;

        Iterator<Integer> iter = adj[i].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isVisited[val]==false)
            {
                DFSUtil(val, isVisited);
            }
        }
    }
    int getMother()
    {
        boolean isVisited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            isVisited[i]=false;
        }

        int last = -1;
        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                DFSUtil(i, isVisited);
                last=i;
            }
        }
        for(int i=0;i<V;i++)
        {
            isVisited[i]=false;
        }
        DFSUtil(last, isVisited);

        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                return -1;
            }
        }
        return last;
    }
    public static void main(String [] args)
    {
        MotherVertex g = new MotherVertex(7); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(4, 1); 
        g.addEdge(6, 4); 
        g.addEdge(5, 6); 
        g.addEdge(5, 2); 
        g.addEdge(6, 0); 
        System.out.println(g.getMother());
    }
}