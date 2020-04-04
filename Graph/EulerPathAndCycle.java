import java.util.*;
class EulerPathAndCycle
{
    int V;
    LinkedList<Integer> adj[];

    EulerPathAndCycle(int V)
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
        adj[dest].add(src);
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


    public boolean isConnected()
    {
        boolean visited [] =new boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        int count=0;
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false && adj[i].size()>0)
            {
                DFS(i,visited);
                count++;
            }
        }
        if(count>1)
        {
            return false;
        }
        return true;
    }

    public int isEulerian()
    {
        if(isConnected()==false)
        {
            return 0;
        }
        else{
            int odd=0;
            int even = 0;
            for(int i=0;i<V;i++)
            {
                if((adj[i].size()%2)==0)
                {
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(odd==0)
            {
                return 2;
            }
            else
            {
                if(odd==2)
                {
                    return 1;
                }
                return 0;
            }
        }
    }
    public void test() 
    { 
        int res = isEulerian(); 
        if (res == 0) 
            System.out.println("graph is not Eulerian"); 
        else if (res == 1) 
            System.out.println("graph has a Euler path"); 
        else
           System.out.println("graph has a Euler cycle"); 
    } 
public static void main(String [] args)
{
    EulerPathAndCycle g1 = new EulerPathAndCycle(5); 
    g1.addEdge(1, 0); 
    g1.addEdge(0, 2); 
    g1.addEdge(2, 1); 
    g1.addEdge(0, 3); 
    g1.addEdge(3, 4); 
    g1.test(); 

    EulerPathAndCycle g2 = new EulerPathAndCycle(5); 
    g2.addEdge(1, 0); 
    g2.addEdge(0, 2); 
    g2.addEdge(2, 1); 
    g2.addEdge(0, 3); 
    g2.addEdge(3, 4); 
    g2.addEdge(4, 0); 
    g2.test(); 

    EulerPathAndCycle g3 = new EulerPathAndCycle(5); 
    g3.addEdge(1, 0); 
    g3.addEdge(0, 2); 
    g3.addEdge(2, 1); 
    g3.addEdge(0, 3); 
    g3.addEdge(3, 4); 
    g3.addEdge(1, 3); 
    g3.test(); 

    // Let us create a graph with 3 vertices 
    // connected in the form of cycle 
    EulerPathAndCycle g4 = new EulerPathAndCycle(3); 
    g4.addEdge(0, 1); 
    g4.addEdge(1, 2); 
    g4.addEdge(2, 0); 
    g4.test(); 

    // Let us create a graph with all veritces 
    // with zero degree 
    EulerPathAndCycle g5 = new EulerPathAndCycle(3); 
    g5.test(); 
} 
}