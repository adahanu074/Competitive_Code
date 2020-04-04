import java.util.*;
class NumberOfTrees
{
    private int V;
    private LinkedList<Integer> adj[];

    NumberOfTrees(int V)
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
        adj[dest].add(src);
    }

    void dfsUtil(int i, boolean isVisited[])
    {
        isVisited[i]=true;

        Iterator<Integer> iter = adj[i].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isVisited[val]==false)
            {
                dfsUtil(val,isVisited);
            }
        }
    }
    void countTrees()
    {
        boolean isVisited[] = new boolean[V];
        int count =0;
        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                dfsUtil(i,isVisited);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String [] args)
    {
        NumberOfTrees g = new NumberOfTrees(5);  
  
        g.addEdge(0, 1);  
        g.addEdge(0, 2);  
        g.addEdge(3, 4); 
        g.countTrees();
    }
}