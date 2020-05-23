import java.util.*;
class Mother
{
    int V;
    LinkedList<Integer> adj[];
    Mother(int V)
    {
        this.V=V;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    public void DFS(int v,boolean visited[])
    {
        visited[v]=true;
        Iterator<Integer> iter = adj[v].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(visited[val]==false)
            {
                DFS(val,visited);
            }
        }
    }
    public void mother()
    {
        boolean visited [] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        int mother  = -1;
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                DFS(i,visited);
                mother = i;
            }
        }
        System.out.println(mother);
    }
    public static void main(String [] args)
    {
        Mother graph =new Mother(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(4,1);
        graph.addEdge(6,4);
        graph.addEdge(5,6);
        graph.addEdge(5,2);
        graph.addEdge(6,0);
        graph.mother();
    }
}