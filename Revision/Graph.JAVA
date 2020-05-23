import java.util.*;
public class Graph
{
    static int V;
    static LinkedList<Integer> adj[];
    Graph(int V)
    {
        this.V = V;
        adj= new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    static Graph graph;
    public static void addEdge(int src,int dest)
    {
        graph.adj[src].add(dest);
        graph.adj[dest].add(src);
    }

    public static int minIndex(int memset[] , boolean visited[])
    {
        int index = -1;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<V;i++)
        {
            if(memset[i]<min && visited[i]==false)
            {
                min = memset[i];
                index = i;
            }
        }
        return index;
    }
    public static void Dikstra(int start,int end)
    {
        boolean visited[] = new boolean[V];
        int memset[] = new int[V];
        int parent[] = new int[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
            memset[i]=Integer.MAX_VALUE;
            parent[i]=Integer.MAX_VALUE;
        }
        memset[start]=0;
        parent[start]=-1;
        for(int i=0;i<V-1;i++)
        {
            int u = minIndex(memset,visited);
            visited[u]=true;

            for(int j=0;j<V;j++)
            {
                if(memset[u]!=Integer.MAX_VALUE && graph.adj[u].contains(j) && visited[j]==false && (memset[u]+1)<memset[j])
                {
                    memset[j]=memset[u]+1;
                    parent[j]=u;
                }
            }
        }
        if(memset[end]==Integer.MAX_VALUE)
        {
            memset[end]=-1;
        }
        // System.out.println(memset[end]);
        // System.out.println(Arrays.toString(parent));
        List<Integer> listt =new ArrayList<>();
        int value = end;
        while(parent[end]!=(-1))
        {
            listt.add(0,parent[end]+1);
            end=parent[end];
        }
        listt.add(value+1);
        for(int i=0;i<listt.size();i++)
        {
            System.out.print(listt.get(i)+" ");
        }
    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        V = sc.nextInt();
        int edge = sc.nextInt();
        int start = sc.nextInt()-1;
        int end = sc.nextInt()-1;
        graph = new Graph(V);
        for(int i=0;i<edge;i++)
        {
            int src = sc.nextInt()-1;
            int dest = sc.nextInt()-1;
            addEdge(src,dest);
        }
        // System.out.println(Arrays.toString(graph.adj));
        // System.out.println(start+ " "+end);
        Dikstra(start,end);
    }
}