import java.util.*;
class PossiblePathBetweenNodes
{
    int V;
    LinkedList<Integer> adj[];
    int count=0;
    PossiblePathBetweenNodes(int V)
    {
        this.V=V;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    void DFS(int src,int dest, boolean isVisited[])
    {
        isVisited[src]=true;

        if(src==dest)
        {
            count++;
        }
        else
        {
        Iterator<Integer> iter = adj[src].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isVisited[val]==false)
            {
                DFS(val,dest,isVisited);
            }
        }
    }
        isVisited[src]=false;
    }

    void countPaths(int src,int dest)
    {
        boolean isVisited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            isVisited[i]=false;
        }

        DFS(src,dest,isVisited);
    }
    public static void main(String [] args)
    {
        PossiblePathBetweenNodes g = new PossiblePathBetweenNodes(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(2, 0); 
        g.addEdge(2, 1); 
        g.addEdge(1, 3); 
  
        int s = 2, d = 3; 
        g.countPaths(s, d); 
        System.out.println(g.count);
    }
}