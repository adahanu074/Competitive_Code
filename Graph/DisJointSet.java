import java.util.*;
class DisJointSet
{
    int V;
    LinkedList<Integer> adj[];

    DisJointSet(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]= new LinkedList();
        }
    }

    void addEdge(int src,int dest)
    {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public int root(int i, int arr[])
    {
        while(arr[i]!=i)
        {
            i=arr[i];
        }
        return i;
    }
    public void union(int src,int dest,int arr[])
    {
        int x = root(src,arr);
        int y = root(dest,arr);
        arr[x]=y;
    }
    public boolean detect()
    {
        int arr[] = new int[V];
        boolean isVisited [] =new boolean[V];
        for(int i=0;i<V;i++)
        {
            arr[i]=i;
            isVisited[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            Iterator<Integer> iter =adj[i].iterator();
            while(iter.hasNext())
            {
                int val = iter.next();
                if(root(val,arr)!=root(i,arr))
                {
                    union(i,val,arr);
                }
                else
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        DisJointSet ds = new DisJointSet(3);
        ds.addEdge(0,1);
        ds.addEdge(1,2);
        ds.addEdge(0,2);

        System.out.println(ds.detect());
    }
}