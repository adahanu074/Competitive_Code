import java.util.*;
class ArticulationPoint1
{
    int V;
    LinkedList<Integer> adj[] ;
    int time =0;
    int nil=-1;

    ArticulationPoint1(int V)
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
    public void APUtil(int u,boolean isvisited[],int desc[],int low[],int parent[],boolean ap[])
    {
        isvisited[u]=true;
        int children=0;
        desc[u]=low[u]=++time;
        Iterator<Integer> iter = adj[u].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isvisited[val]==false)
            {
                children++;
                parent[val]=u;
                APUtil(val,isvisited,desc,low,parent,ap);

                low[u]= Math.min(low[u],low[val]);

                if(parent[u]==nil && children>1)
                {
                ap[u]=true;
                }

                if(parent[u]!=nil && desc[u]<=low[val])
                {
                    ap[u]=true;
                }
            }
            else if(parent[val]!=u)
            {
                low[u]  = Math.min(low[u], desc[val]); 
            }
        }
    }
    public void AP()
    {
        boolean ap[] = new boolean[V];
        int low[] = new int[V];
        int desc[] = new int[V];
        int parent[] = new int[V];
        boolean isvisited[]= new boolean[V];

        for(int i=0;i<V;i++)
        {
            parent[i]=nil;
            ap[i]=false;
            isvisited[i]=false;
        }

        for(int i=0;i<V;i++){
            if(isvisited[i]==false)
            {
                APUtil(i,isvisited,desc,low,parent,ap);
            }
        }
        for (int i = 0; i < V; i++) 
        {
            if (ap[i] == true) 
                System.out.print(i+" ");
        }
    }
    public static void main(String [] args)
    {
        System.out.println("Articulation points in first graph "); 
        ArticulationPoint1 g1 = new ArticulationPoint1(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        g1.AP(); 
        System.out.println(); 
  
        System.out.println("Articulation points in Second graph"); 
        ArticulationPoint1 g2 = new ArticulationPoint1(4); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        g2.addEdge(2, 3); 
        g2.AP(); 
        System.out.println(); 
  
        System.out.println("Articulation points in Third graph "); 
        ArticulationPoint1 g3 = new ArticulationPoint1(7); 
        g3.addEdge(0, 1); 
        g3.addEdge(1, 2); 
        g3.addEdge(2, 0); 
        g3.addEdge(1, 3); 
        g3.addEdge(1, 4); 
        g3.addEdge(1, 6); 
        g3.addEdge(3, 5); 
        g3.addEdge(4, 5); 
        g3.AP(); 
    }
}