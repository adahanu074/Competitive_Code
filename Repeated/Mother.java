import java.util.*;
class Mother
{
    private static int V;
    private LinkedList<Integer> adj[];

    Mother(int V)
    {
        this.V= V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    private void dfs(int v, boolean visited[])
    {
        visited[v]=true;

        Iterator<Integer> iter = adj[v].iterator();
        while(iter.hasNext())
        {
            int value = iter.next();
            if(visited[value]==false)
            {
                dfs(value,visited);
            }
        }
    }
    private void findMother()
    {
        boolean [] visited = new boolean[V];

        for(int i=0;i<V;i++)
        {
            visited[i]= false;
        }
        int mother = -1;
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,visited);
                mother =i;
                System.out.println(mother);
            }
        }
        System.out.println(mother);
    }
    public static void main(String []args)
    {
        Mother g = new Mother(7);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(4, 1); 
        g.addEdge(6, 4); 
        g.addEdge(5, 6); 
        g.addEdge(5, 2); 
        g.addEdge(6, 0);

        g.findMother();
    }
}