import java.util.*;
class Kosaraju
{
    int V;
    LinkedList<Integer> adj[];

    Kosaraju(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }

    Kosaraju getTranspose()
    {
        Kosaraju kos = new Kosaraju(V);
        for(int i=0;i<V;i++)
        {
            Iterator<Integer> iter = adj[i].iterator();
            while(iter.hasNext())
            {
                kos.adj[iter.next()].add(i);
            }
        }
        return kos;
    }

    void dfsUtil(int i, boolean isVisited[])
    {
        isVisited[i]=true;
        System.out.print(i+"   ");
        Iterator<Integer> iter = adj[i].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isVisited[val]==false)
            {
                dfsUtil(val, isVisited);
            }
        }
    }
    void fillOutStack(int i, boolean isVisited[] , Stack<Integer> stack)
    {
        isVisited[i]=true;

        Iterator<Integer> iter =adj[i].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(isVisited[val]==false)
            {
                fillOutStack(val,isVisited,stack);
            }
        }
        stack.push(i);
    }
    void fillStack()
    {
        Stack<Integer> stack = new Stack<Integer>();

        boolean isVisited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            isVisited[i]=false;
        }

        for(int i=0;i<V;i++)
        {
            if(isVisited[i]==false)
            {
                fillOutStack(i,isVisited,stack);
            }
        }

        Kosaraju kr  = getTranspose();

        for(int i=0;i<V;i++)
        {
            isVisited[i]= false;
        }

        while(!stack.isEmpty())
        {
            int val = stack.pop();

            if(isVisited[val]==false)
            {
                kr.dfsUtil(val,isVisited);
                System.out.println();
            }
        }
    }
    public static void main(String [] args)
    {
        Kosaraju g = new Kosaraju(5); 
        g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(3, 4); 
        g.fillStack();
    }
}