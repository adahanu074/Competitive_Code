import java.util.*;
class NumberOfNodes
{
    int V;
    LinkedList<Integer> adj[];
    int parent[];
    int time=0;
    NumberOfNodes(int V)
    {
        this.V=V;
        adj= new LinkedList[V];
        parent= new int[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList();
        }
    }

    void addEdge(int src, int dest)
    {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    void DFSUtil(int val,boolean isVisited[], int parent[],int time)
    {
        isVisited[val]=true;
        Iterator<Integer> iter = adj[val].iterator();
        while(iter.hasNext())
        {
            int i = iter.next();
            if(isVisited[i]==false)
            {
                parent[i]=time;
                DFSUtil(i,isVisited,parent,time+1);
            }
        }
    }
    void getNodes()
    {
        boolean isVisited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            isVisited[i]=false;
        }

        parent[0]=time;
        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                DFSUtil(i,isVisited,parent,1);
            }
        }

    }
    public static void main(String [] args)
    {
        NumberOfNodes g = new NumberOfNodes(6); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(2, 4); 
        g.addEdge(2, 5); 
        int level = 2;
        g.getNodes();

        for(int i=0;i<g.V;i++)
        {
            if(g.parent[i]==2)
            {
                System.out.print(i+"  ");
                System.out.println();
            }
        }
        for(int i=0;i<g.V;i++)
        {
            System.out.println(g.parent[i]);
        }
    }
}